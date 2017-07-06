/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr, Sam Harwell
 All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/


/** A Java 1.7 grammar for ANTLR v4 derived from ANTLR v3 Java grammar.
 *  Uses ANTLR v4's left-recursive expression notation.
 *  It parses ECJ, Netbeans, JDK etc...
 *
 *  Sam Harwell cleaned this up significantly and updated to 1.7!
 *
 *  You can test with
 *
 *  $ antlr4 Java.g4
 *  $ javac *.java
 *  $ grun Java compilationUnit *.java
 * 
 * Edited by Julian Sven Baehr.
 */
grammar Java;

@header{
	package de.julian.baehr.immutable.generated;
}

//--------------------------------- from here via 
//################################# to here via 

//--------------------------------- from here via CompilationUnitListener
// starting point for parsing a java file
compilationUnit
    :   packageDeclaration importDeclaration* typeDeclaration? EOF
    ;

packageDeclaration
    :   'package' packageName=qualifiedName ';'
    ;

//split import declaration into 4 sub-rules
importDeclaration
    :   'import' className=qualifiedName ';' 					#singleClassImport
    |	'import' qualifiedName ('.' '*') ';'					#starImport
    |	'import' 'static' methodName=qualifiedName ';' 			#staticImport
    |	'import' 'static' className=qualifiedName ('.' '*') ';' #staticImportMany
    ;
//################################# to here via CompilationUnitListener

//--------------------------------- from here via TypeDeclarationListener
typeDeclaration
    :   (classDeclaration | enumDeclaration | interfaceDeclaration | annotationTypeDeclaration)
    ;
//################################# to here via TypeDeclarationListener

//--------------------------------- from here via ModifierListener
modifierList
	: modifier
	| modifierList modifier
	;

modifier
    :   classOrInterfaceModifier #nonSimpleModifier
    |   (   'native'
        |   'synchronized'
        |   'transient'
        |   'volatile'
        )	# simpleModifer
    ;

classOrInterfaceModifier
    :   annotation       #annotationModifer // class or interface
    |   (   'public'     // class or interface
        |   'protected'  // class or interface
        |   'private'    // class or interface
        |   'static'     // class or interface
        |   'abstract'   // class or interface
        |   'final'      // class only -- does not apply to interfaces
        |   'strictfp'   // class or interface
        )	#simpleClassModifer
    ;  

variableModifierList
	:	variableModifier
	|	variableModifierList variableModifier
	;	

variableModifier
    :   'final'		#simpleVariableModifier
    |   annotation	#annotationVariableModifier
    ;
//################################# to here via ModifierListener

//--------------------------------- from here via ClassDeclarationListener
classDeclaration
    :   modifiers=modifierList? 'class' className=Identifier typeParameters?
        ('extends' extensionType=typeType)?
        ('implements' typeList)?
        classBody
    ;
//################################# to here via ClassDeclarationListener

//parameters
//--------------------------------- from here via TypeParametersListener
typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   Identifier ('extends' typeBound)?
    ;

typeBound
    :   typeType ('&' typeType)*
    ;
//################################# to here via TypeParametersListener

//--------------------------------- from here via EnumDeclarationListener
enumDeclaration
    :   modifiers=modifierList? ENUM enumName=Identifier ('implements' typeList)?
        '{' enumConstants? ','? enumBodyDeclarations? '}'
    ;

enumConstants
    :   enumConstant (',' enumConstant)*
    ;
//################################# to here via EnumDeclarationListener

//--------------------------------- from here via EnumConstantListener
enumConstant
    :   annotation* Identifier arguments? classBody?
    ;
//################################# to here via EnumConstantListener

//--------------------------------- from here via EnumDeclarationListener
enumBodyDeclarations
    :   ';' classBodyDeclaration*
    ;
//################################# to here via EnumDeclarationListener

//--------------------------------- from here via InterfaceDeclarationListener
interfaceDeclaration
    :   modifiers=modifierList? 'interface' interfaceName=Identifier typeParameters? ('extends' typeList)? interfaceBody
    ;
//################################# to here via InterfaceDeclarationListener

//--------------------------------- from here via TypeListListener
typeList
    :   typeType (',' typeType)*
    ;
//################################# to here via TypeListListener

//--------------------------------- from here via ClassBodyListener
classBody
    :   '{' classBodyDeclaration* '}'
    ;
//################################# to here also via ClassBodyListener

//--------------------------------- from here via InterfaceDeclarationListener
interfaceBody
    :   '{' interfaceBodyDeclaration* '}'
    ;
//################################# to here via InterfaceDeclarationListener

//--------------------------------- from here via ClassBodyListener
classBodyDeclaration
    :   ';'									#classBodyDeclarationSemicolon
    |   isStatic='static'? block			#classBodyDeclarationStaticBlock //also field initializers
    |   memberDeclaration					#classBodyDeclarationMember
    ;

memberDeclaration
    :   (methodDeclaration
	    |   genericMethodDeclaration
	    |   fieldDeclaration
	    |   constructorDeclaration
	    |   genericConstructorDeclaration) #memberDeclarationMember
//################################# to here also via ClassBodyListener

//--------------------------------- from here via TypeDeclarationListener
    |	(interfaceDeclaration
	    |   annotationTypeDeclaration
	    |   classDeclaration
	    |   enumDeclaration) #memberDeclarationSubType
    ;
//################################# to here via TypeDeclarationListener

//--------------------------------- from here via MethodListener
/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    :   modifierList? (typeType|'void') Identifier formalParameters //brackets //not allowing [] in grammar
        ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;
//################################# to here via MethodListener

//--------------------------------- from here via GenericMethodListener
genericMethodDeclaration
    :   modifierList? typeParameters methodDeclaration
    ;
//################################# to here via GenericMethodListener

//--------------------------------- from here via ConstructorListener
constructorDeclaration
    :   modifierList? Identifier formalParameters ('throws' qualifiedNameList)?
        constructorBody
    ;
//################################# to here via ConstructorListener

//--------------------------------- from here via GenericConstructorListener
genericConstructorDeclaration
    :   modifierList? typeParameters constructorDeclaration
    ;
//################################# to here via GenericConstructorListener

//--------------------------------- from here via FieldListener
fieldDeclaration
    :   modifierList? typeType variableDeclarators ';'
    ;
//################################# to here via FieldListener

//--------------------------------- from here via InterfaceDeclarationListener
interfaceBodyDeclaration
    :   interfaceMemberDeclaration
    |   ';'
    ;

interfaceMemberDeclaration
    :   (constDeclaration
	    |   interfaceMethodDeclaration
	    |   genericInterfaceMethodDeclaration)	#interfaceMemberDeclarationMember
//################################# from here via InterfaceDeclarationListener
//--------------------------------- from here via TypeDeclarationListener
    |   (interfaceDeclaration
	    |   annotationTypeDeclaration
	    |   classDeclaration
	    |   enumDeclaration) #interfaceMemberDeclarationType
//################################# to here via TypeDeclarationListener
    ;

//--------------------------------- from here via ConstDeclarationListener
constDeclaration
    :   modifierList? typeType constantDeclarator (',' constantDeclarator)* ';'
    ;

constantDeclarator
    :   Identifier brackets '=' variableInitializer
    ;
//################################# to here via ConstDeclarationListener

//--------------------------------- to here via InterfaceMethodListener
// see matching of [] comment in methodDeclaratorRest
interfaceMethodDeclaration
    :   modifierList? (typeType|'void') Identifier formalParameters //(brackets='[' ']')*
        ('throws' qualifiedNameList)?
        ';'
    ;
//################################# to here via InterfaceMethodListener

//--------------------------------- to here via GenericInterfaceMethodListener
genericInterfaceMethodDeclaration
    :   modifierList? typeParameters interfaceMethodDeclaration
    ;
//################################# to here via GenericInterfaceMethodListener

//--------------------------------- to here via VariableDeclaratorsListener
variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;
//################################# to here via VariableDeclaratorsListener

//--------------------------------- to here also via VariableDeclaratorIdListener
variableDeclaratorId
    :   Identifier (arrayBrackets='[' ']')*
    ;
//################################# to here via VariableDeclaratorIdListener

//--------------------------------- to here via VariableInitializerListener
variableInitializer
    :   arrayInitializer
    |   expression
    ;
//################################# to here via VariableDeclaratorsListener

//--------------------------------- to here via ArrayInitializerListener
arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;
//################################# to here via ArrayInitializerListener

//--------------------------------- from here via getText
enumConstantName
    :   Identifier
    ;
//################################# to here via getText

//--------------------------------- from here via TypeTypeListener
typeType
    :   cType=classOrInterfaceTypeList arrayDeclaration?
    |   pType=primitiveType arrayDeclaration?
    ;
    
arrayDeclaration
	: ('[' ']')+
	;    

//--------------------------------- from here also via ResourceSpecificationListener
classOrInterfaceTypeList
    :   classOrInterfaceType
    | 	classOrInterfaceTypeList '.' classOrInterfaceType
    ;
    
classOrInterfaceType
	: id=Identifier typeArguments?
	;
//################################# to here also via ResourceSpecificationListener
    
primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;
//################################# to here via TypeTypeListener

//--------------------------------- from here via TypeArgumentsListener
typeArguments
    :   '<' typeArgumentsList '>'
    ;
    
typeArgumentsList
	:	typeArgument
	|	typeArgumentsList ',' typeArgument
	;

typeArgument
    :   typeType	#normalTypeArgument
    |   '?' (keyWord=('extends' | 'super') typeType)?	#wildcardTypeArgument
    ;  
//################################# to here via TypeArgumentsListener

//--------------------------------- from here via QualifiedNameListListener
qualifiedNameList	//via .getText()
    :   qualifiedName (',' qualifiedName)*
    ;
//################################# to here via QualifiedNameListListener

//--------------------------------- from here via FormalParametersListener
formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   variableModifierList? typeType variableDeclaratorId
    ;

lastFormalParameter
    :   variableModifierList? typeType '...' variableDeclaratorId
    ;
//################################# to here via FormalParametersListener

//--------------------------------- from here via MethodListener
methodBody
    :   block
    ;
//################################# to here via MethodListener

//--------------------------------- from here via ConstructorListener
constructorBody
    :   block
    ;
//################################# to here via ConstructorListener

//--------------------------------- from here via getText
qualifiedName
    :   Identifier ('.' Identifier)*
    ;  

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;
//################################# to here via getText

// ANNOTATIONS

//--------------------------------- from here via AnnotationListener
annotation
    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
    ;

annotationName : qualifiedName ;

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;
elementValuePair
    :   Identifier '=' elementValue
    ;
//################################# to here via AnnotationListener

//--------------------------------- from here via ElementValueListener

elementValue
    :   expression
    |   annotation
    |   elementValueArrayInitializer
    ;
//################################# to here via ElementValueListener

//--------------------------------- from here via ElementValueArrayInitializerListener
elementValueArrayInitializer
    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;
//################################# to here via ElementValueArrayInitializerListener

//--------------------------------- from here via AnnotationTypeDeclarationListener
annotationTypeDeclaration
    :   modifiers=modifierList? '@' 'interface' name=Identifier annotationTypeBody
    ;

annotationTypeBody
    :   '{' (annotationTypeElementDeclaration)* '}'
    ;

annotationTypeElementDeclaration
    :   annotationTypeElementRest
    |   ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
    ;

annotationTypeElementRest
    :   annotationMethodOrConstantRest ';'	#annotationTypeElementRestMethod
//################################# to here via AnnotationTypeDeclarationListener
//--------------------------------- from here via TypeDeclarationListener
    |   (classDeclaration 
    	|   interfaceDeclaration 
    	|   enumDeclaration 
    	|   annotationTypeDeclaration 
    	';'?) #annotationTypeElementRestType
    ;
//################################# to here via TypeDeclarationListener

//--------------------------------- from here via AnnotationTypeDeclarationListener
annotationMethodOrConstantRest
    :   annotationMethod
    |   annotationConstant
    ;
//################################# to here via AnnotationTypeDeclarationListener
    
//--------------------------------- from here via AnnotationMethodListener
annotationMethod
	: modifierList? typeType id=Identifier annotationMethodRest 
	;
//################################# to here via AnnotationMethodListener
	
//--------------------------------- from here via AnnotationConstantListener
annotationConstant
	: modifierList? typeType annotationConstantRest
	;
//################################# to here via AnnotationConstantListener

//--------------------------------- from here via AnnotationMethodListener
annotationMethodRest
    : '(' ')' defaultValue?
    ;
//################################# to here via AnnotationMethodListener

//--------------------------------- from here via AnnotationConstantListener
annotationConstantRest
    :   variableDeclarators
    ;
//################################# to here via AnnotationConstantListener

//--------------------------------- from here via AnnotationMethodListener
defaultValue
    :   'default' elementValue
    ;   
//################################# to here via AnnotationMethodListener

// STATEMENTS / BLOCKS

//--------------------------------- from here via BlockListener
block
    :   '{' blockStatement* '}'
    ;
//################################# to here via BlockListener

//--------------------------------- from here via BlockStatementListener
blockStatement
    :   localVariableDeclarationStatement
    |   statement
    |   typeDeclaration
    ;
//################################# to here via BlockStatementListener

//--------------------------------- from here via LocalVariableDeclarationStatementListener
localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;
//################################# to here via LocalVariableDeclarationStatementListener

//--------------------------------- from here via LocalVariableDeclarationListener
localVariableDeclaration
    :   variableModifierList? typeType variableDeclarators
    ;
//################################# to here via LocalVariableDeclarationListener

//--------------------------------- from here via respective StatementListener
statement
    :   block																	#statementBlock
    |   ASSERT exp1=expression (':' exp2=expression)? ';'						#statementAssert
    |   'if' parExpression ifStmt=statement ('else' elseStmt=statement)?		#statementIf
    |   'for' '(' forControl ')' statement										#statementFor
    |   'while' parExpression statement											#statementWhile
    |   'do' statement 'while' parExpression ';'								#statementDo
    |   'try' block (catchClause+ finallyBlock? | finallyBlock)					#statementTry
    |   'try' resourceSpecification block catchClause* finallyBlock?			#statementTryResources
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'	#statementSwitch
    |   'synchronized' parExpression block										#statementSynchronized
    |   'return' expression? ';'												#statementReturn
    |   'throw' expression ';'													#statementThrow
    |   'break' Identifier? ';'													#statementBreak
    |   'continue' Identifier? ';'												#statementContinue
    |   ';'																		#statementSemicolon
    |   statementExpression ';'													#statementStatemenExpression
    |   Identifier ':' statement												#statementIdentifierStatement
    ;
//################################# to here via StatementListener

//--------------------------------- from here via CatchClauseListener
catchClause
    :   'catch' '(' variableModifierList? catchType Identifier ')' block
    ;

catchType
    :   qualifiedName ('|' qualifiedName)*
    ;
//################################# from here via CatchClauseListener

//--------------------------------- from here via FinallyBlockListener
finallyBlock
    :   'finally' block
    ;
//################################# from here via FinallyBlockListener

//--------------------------------- from here via ResourceSpecificationListener
resourceSpecification
    :   '(' resources ';'? ')'
    ;

resources
    :   resource (';' resource)*
    ;

resource
    :   variableModifierList? classOrInterfaceTypeList variableDeclaratorId '=' expression
    ;
//################################# from here via ResourceSpecificationListener

//--------------------------------- from here via SwitchBlockStatementGroupListener
/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;
//################################# to here via SwitchBlockStatementGroupListener

//--------------------------------- from here via SwitchLabelListener
switchLabel
    :   'case' constantExpression ':'
    |   'case' enumConstantName ':'
    |   'default' ':'
    ;
//################################# to here via SwitchLabelListener

//--------------------------------- from here via StatementForListener
forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   variableModifierList? typeType variableDeclaratorId ':' expression
    ;

forUpdate
    :   expressionList
    ;
//################################# to here via StatementForListener

// EXPRESSIONS

//--------------------------------- from here via ParExpressionListener
parExpression
    :   '(' expression ')'
    ;
//################################# to here via ParExpressionListener

//--------------------------------- from here via ExpressionListListener
expressionList
    :   expression (',' expression)*
    ;
//################################# to here via ExpressionListListener

//--------------------------------- from here via ExpressionListener and respective listeners
statementExpression
    :   expression
    ;

constantExpression
    :   expression
    ;

expression
    :   primary																	#expressionPrimary
    |   expression '.' Identifier												#expressionDotId
    |   expression '.' 'this'													#expressionDotThis
    |   expression '.' 'new' nonWildcardTypeArguments? innerCreator				#expressionDotNewWildInner
    |	'#new' Identifier specialParameters										#expressionAutoCpy
    |   expression '.' 'super' superSuffix										#expressionDotSuperSuffix
    |   expression '.' explicitGenericInvocation								#expressionDotExplGenInvoc
    |   exp1=expression '[' exp2=expression ']'									#expressionArray
    |   expression '(' expressionList? ')'										#expressionMethodCall
    |   'new' creator															#expressionCtor
    |   '(' typeType ')' expression												#expressionCast
    |   expression op=('++' | '--')												#expressionPost
    |   op=('+'|'-'|'++'|'--') expression										#expressionPre
    |   op=('~'|'!') expression													#expressionNot
    |   exp1=expression op=('*'|'/'|'%') exp2=expression						#expressionMulDivMod
    |   exp1=expression op=('+'|'-') exp2=expression							#expressionAddSub
    |   exp1=expression op=('<<' | '>>>' | '>>' ) exp2=expression				#expressionLessGreater
    |   exp1=expression op=('<=' | '>=' | '>' | '<') exp2=expression			#expressionLessGreaterEqual
    |   expression 'instanceof' typeType										#expressionInstanceof
    |   exp1=expression op=('==' | '!=') exp2=expression						#expressionEquals
    |   exp1=expression '&' exp2=expression										#expressionAnd
    |   exp1=expression '^' exp2=expression										#expressionXor
    |   exp1=expression '|' exp2=expression										#expressionOr
    |   exp1=expression '&&' exp2=expression									#expressionAndAnd
    |   exp1=expression '||' exp2=expression									#expressionOrOr
    |   exp1=expression '?' exp2=expression ':' exp3=expression					#expressionTern
    |   <assoc=right> exp1=expression
        op=(   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '&='
        |   '|='
        |   '^='
        |   '>>='
        |   '>>>='
        |   '<<='
        |   '%='
        )
        exp2=expression															#expressionMath
    ;
//################################# to here via ExpressionListener

//--------------------------------- from here via SpecialParametersListener
specialParameters
	: '(' specialParameter* ')'
	;
	
specialParameter
	: Identifier '=' expression
	;	
//################################# to here via SpecialParametersListener

//--------------------------------- from here via PrimaryListener and respective listeners
primary
    :   '(' expression ')'																#primExpression
    |   'this'																			#primThis
    |   'super'																			#primSuper
    |   literal																			#primLiteral
    |   Identifier																		#primId
    |   typeType '.' 'class'															#primClass
    |   'void' '.' 'class'																#primVClass
    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | 'this' arguments)	#primNonWild
    ;
//################################# to here via PrimaryListener

//--------------------------------- from here via CreatorListener
creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;
//################################# to here via CreatorListener

//--------------------------------- from here via CreatedNameListener
createdName
    :   createdNamePart ('.' createdNamePart)*
    |   primitiveType
    ;
    
createdNamePart
	: Identifier typeArgumentsOrDiamond?
	;
    
//################################# to here via CreatedNameListener

//--------------------------------- from here via InnerCreatorListener
innerCreator
    :   Identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;
//################################# to here via InnerCreatorListener

//--------------------------------- from here via ArrayCreatorRestListener
arrayCreatorRest
    :   '['
        (   ']' brackets arrayInitializer
        |   expression ']' bracketExpression* brackets
        )
    ;
//################################# to here via ArrayCreatorRestListener
    
//--------------------------------- from here via BracketExpressionListener
bracketExpression
	: '[' expression ']'
	;
//################################# to here via BracketExpressionListener

//--------------------------------- from here via ClassCreatorRestListener
classCreatorRest
    :   arguments classBody?
    ;
//################################# to here via ClassCreatorRestListener

//--------------------------------- from here via ExplicitGenericInvocationListener
explicitGenericInvocation
    :   nonWildcardTypeArguments explicitGenericInvocationSuffix
    ;
//################################# to here via ExplicitGenericInvocationListener

//--------------------------------- from here via NonWildcardTypeArgumentsListener
nonWildcardTypeArguments
    :   '<' typeList '>'
    ;
//################################# to here via NonWildcardTypeArgumentsListener

//--------------------------------- from here via TypeArgumentsOrDiamondListener
typeArgumentsOrDiamond
    :   '<' '>'
    |   typeArguments
    ;
//################################# to here via TypeArgumentsOrDiamondListener

//--------------------------------- from here via NonWildcardTypeArgumentsOrDiamondListener
nonWildcardTypeArgumentsOrDiamond
    :   '<' '>'
    |   nonWildcardTypeArguments
    ;
//################################# to here via NonWildcardTypeArgumentsOrDiamondListener

//--------------------------------- from here via SuperSuffixListener
superSuffix
    :   arguments
    |   '.' Identifier arguments?
    ;
//################################# to here via SuperSuffixListener

//--------------------------------- from here via ExplicitGenericInvocationSuffixListener
explicitGenericInvocationSuffix
    :   'super' superSuffix
    |   Identifier arguments
    ;
//################################# to here via ExplicitGenericInvocationSuffixListener

//--------------------------------- from here via ArgumentsListener
arguments
    :   '(' expressionList? ')'
    ;
//################################# to here via ArgumentsListener

//------------ via getText()
brackets
	: ('[' ']')*
	;
//############ via getText()

/*--------------------------------------------------- here to end via lexer */
// LEXER

// §3.9 Keywords

ABSTRACT      : 'abstract';
ASSERT        : 'assert';
BOOLEAN       : 'boolean';
BREAK         : 'break';
BYTE          : 'byte';
CASE          : 'case';
CATCH         : 'catch';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'const';
CONTINUE      : 'continue';
DEFAULT       : 'default';
DO            : 'do';
DOUBLE        : 'double';
ELSE          : 'else';
ENUM          : 'enum';
EXTENDS       : 'extends';
FINAL         : 'final';
FINALLY       : 'finally';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
GOTO          : 'goto';
IMPLEMENTS    : 'implements';
IMPORT        : 'import';
INSTANCEOF    : 'instanceof';
INT           : 'int';
INTERFACE     : 'interface';
LONG          : 'long';
NATIVE        : 'native';
NEW           : 'new';
PACKAGE       : 'package';
PRIVATE       : 'private';
PROTECTED     : 'protected';
PUBLIC        : 'public';
RETURN        : 'return';
SHORT         : 'short';
STATIC        : 'static';
STRICTFP      : 'strictfp';
SUPER         : 'super';
SWITCH        : 'switch';
SYNCHRONIZED  : 'synchronized';
THIS          : 'this';
THROW         : 'throw';
THROWS        : 'throws';
TRANSIENT     : 'transient';
TRY           : 'try';
VOID          : 'void';
VOLATILE      : 'volatile';
WHILE         : 'while';

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

// §3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;
// §3.10.5 String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;
// §3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// §3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

// §3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';

// §3.12 Operators

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
AND_ASSIGN      : '&=';
OR_ASSIGN       : '|=';
XOR_ASSIGN      : '^=';
MOD_ASSIGN      : '%=';
LSHIFT_ASSIGN   : '<<=';
RSHIFT_ASSIGN   : '>>=';
URSHIFT_ASSIGN  : '>>>=';

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;
