grammar AllowedImports;

@header{
	package de.julian.baehr.immutable.allow.generated;
}

//starting point for AllowedImports.txt
compilationUnit
	: allowedImport* EOF
	;
	
fullyQualifiedName
	: NAME (DOT NAME)*
	;
	
subPackages
	: NAME (DOT NAME)* DOT PLUS
	;
	
listOfNames
	: NAME
	| listOfNames COMMA NAME
	| listOfNames COMMA
	;
	
allowedImport
	: ALLOW allowedClass=fullyQualifiedName SEMICOLON #allowSingleClass
	| ALLOW allowedClasses=listOfNames FROM allowedPackage=fullyQualifiedName SEMICOLON #allowMultipleClasses
	| ALLOW ALL FROM allowedPackage=fullyQualifiedName EXCEPT disallowedClasses=listOfNames SEMICOLON #allowSomePackage
	| ALLOW ALL FROM allowedPackage=fullyQualifiedName SEMICOLON #allowAllPackage
	| ALLOW ALL FROM allowedPackage=subPackages SEMICOLON #allowSubPackages
	;


// TOKENS
ALLOW 		: 'allow';
ALL			: 'all';
FROM		: 'from';
EXCEPT		: 'except';

//SYMBOLS
COMMA		: ',';
SEMICOLON	: ';';
DOT			: '.';
PLUS		: '+';

NAME		: [a-zA-Z$_] [a-zA-Z0-9$_]* ;
    
// whitespace
WHITE_SPACE : [ \t\r\n] -> skip;

MULTILINE_COMMENT : '/*' .*? '*/' -> skip;
SINGLELINE_COMMENT : '//' ~[\r\n]* -> skip;

    