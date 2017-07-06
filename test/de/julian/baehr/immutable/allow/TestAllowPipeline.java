package de.julian.baehr.immutable.allow;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import de.julian.baehr.immutable.allow.AllowedImportUtil;
import de.julian.baehr.immutable.allow.IReadableImportValidator;

@RunWith(Parameterized.class)
public class TestAllowPipeline {

	@Parameters
	public static Collection<?> data(){
		return Arrays.asList(new Object[][]{
			//first the string that is to be parsed, 2nd a string[] of fully qualified class names that should be allowed
			{"", new String[]{}},
			{"allow java.lang.Double;", new String[]{"java.lang.Double",}},
			{"allow java.lang.Double;\r\nallow java.lang.Float;", new String[]{"java.lang.Double", "java.lang.Float",}},
			{"allow all from java.lang;", new String[]{"java.lang.Double", "java.lang.Float",}},
			{"allow all from java.lang except Double;", new String[]{"java.lang.Float"}},
			{"allow Double, Float from java.lang;", new String[]{"java.lang.Float", "java.lang.Double"}},
			{"allow Double, Float,  from java.lang;", new String[]{"java.lang.Float", "java.lang.Double"}},
			{"allow all from java.lang.+;", new String[]{"java.lang.Float", "java.lang.Double", "java.lang.util.foo.bar.String"}},
		});
	}
	
	private IReadableImportValidator testee;
	private String[] allowedClasses;
	private String toParse;
	
	public TestAllowPipeline(String toParse, String[] allowedClasses) {
		this.toParse = toParse;
		this.allowedClasses = allowedClasses;
	}
	
	@Before
	public void setUp() throws Exception {
		testee = AllowedImportUtil.parseAllowedImports(toParse);
	}

	@After
	public void tearDown() throws Exception {
		testee = null;
		toParse = null;
		allowedClasses = null;
	}

	@Test
	public void test() {
		for(String s : allowedClasses){
			assertThat(s + " should be allowed!", testee.isClassAllowed(s), is( true));
		}
	}

}
