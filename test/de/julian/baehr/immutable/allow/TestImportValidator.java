package de.julian.baehr.immutable.allow;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.julian.baehr.immutable.allow.ImportValidator;

public class TestImportValidator {

	ImportValidator testee = null;
	
	@Before
	public void setUp() throws Exception {
		testee = new ImportValidator();
	}

	@After
	public void tearDown() throws Exception {
		testee = null;
	}
	
	@Test
	public void testDefault(){
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.String"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Boolean"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Byte"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Short"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Integer"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Long"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Float"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Double"), is( true));
	}

	@Test
	public void testAllow() {
		testee.allow("java.lang.Test");
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test"), is( true));
	}

	@Test
	public void testAllowBulk() {
		testee.allow("java.lang", Arrays.asList("Test", "Test2"));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test2"), is( true));
	}
	
	@Test
	public void testAllowAll() {
		testee.allowAll("java.lang");
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test2"), is( true));
	}
	
	@Test
	public void testAllowAllExcept() {
		testee.allowAllExcept("java.lang", Arrays.asList("Test3", "Test4"));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test2"), is( true));
		assertThat("Should not be allowed!", testee.isClassAllowed("java.lang.Test3"), is( false));
		assertThat("Should not be allowed!", testee.isClassAllowed("java.lang.Test4"), is( false));
	}
	
	@Test
	public void testAllowAllAndSubPackages() {
		testee.allowAllAndSubPackages("java.lang.+");
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.Test1"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.util.Test2"), is( true));
		assertThat("Should be allowed!", testee.isClassAllowed("java.lang.util.foo.bar.Test3"), is( true));
		assertThat("Should not be allowed!", testee.isClassAllowed("java.Test4"), is( false));
	}
	
	@Test
	public void testAllowCollisionWithSubPackages1(){
		testee.allowAllAndSubPackages("java.lang.+");
		assertThat("Should not be possible after allow sub packages!", testee.allow("java.lang.Test"), is( false));
	}
	
	@Test
	public void testAllowCollisionWithSubPackages2(){
		testee.allow("java.lang.Test");
		assertThat("Should not be possible after allow!", testee.allowAllAndSubPackages("java.lang.+"), is( false));
	}
	
	@Test
	public void testAllowBulkCollisionWithSubPackages1(){
		testee.allowAllAndSubPackages("java.lang.+");
		assertThat("Should not be possible after allow sub packages!", testee.allow("java.lang", Arrays.asList("Test", "Test2")), is( false));
	}
	
	@Test
	public void testAllowBulkCollisionWithSubPackages2(){
		testee.allow("java.lang", Arrays.asList("Float", "Boolean"));
		assertThat("Should not be possible after allow bulk!", testee.allowAllAndSubPackages("java.lang.+"), is( false));
	}
	
	@Test
	public void testAllowAllCollisionWithSubPackages1(){
		testee.allowAllAndSubPackages("java.lang.+");
		assertThat("Should not be possible after allow sub packages!", testee.allowAll("java.lang"), is( false));
	}
	
	@Test
	public void testAllowAllCollisionWithSubPackages2(){
		testee.allowAll("java.lang");
		assertThat("Should not be possible after allow all!", testee.allowAllAndSubPackages("java.lang.+"), is( false));
	}
	
	@Test
	public void testAllowAllExceptCollisionWithSubPackages1(){
		testee.allowAllAndSubPackages("java.lang.+");
		assertThat("Should not be possible after allow sub packages!", testee.allowAllExcept("java.lang", Arrays.asList("Test", "Test2")), is( false));
	}
	
	@Test
	public void testAllowAllExceptCollisionWithSubPackages2(){
		testee.allowAllExcept("java.lang", Arrays.asList("Test", "Test2"));
		assertThat("Should not be possible after allow all except!", testee.allowAllAndSubPackages("java.lang.+"), is( false));
	}
}
