package de.julian.baehr.immutable.allow;

import static de.julian.baehr.immutable.allow.PackageState.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.julian.baehr.immutable.allow.PackageInfo;

public class TestPackageInfoFSM {

	private PackageInfo testee;
	
	@Before
	public void setUp() throws Exception {
		testee = new PackageInfo("foo.bar");
	}

	@After
	public void tearDown() throws Exception {
		testee = null;
	}

	@Test
	public void testInitialState() {
		assertThat("Initial State should be NONE!", testee.getState(), is( NONE));
	}

	@Test
	public void testAllowState() {
		testee.allow("String");
		assertThat("State should be ALLOW!", testee.getState(), is( ALLOW));
	}

	@Test
	public void testAllowBulkState() {
		testee.allow(Arrays.asList("String", "Float"));
		assertThat("State should be ALLOW!", testee.getState(), is( ALLOW));
	}

	@Test
	public void testAllowAllState() {
		testee.allowAll();
		assertThat("State should be ALLOW_ALL!", testee.getState(), is( ALLOW_ALL));
	}

	@Test
	public void testAllowAllExceptState() {
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}
	
	@Test
	public void testAllowAllow(){
		testee.allow("String");
		assertThat("Transition should be possible!", testee.allow("Float"), is( true));
		assertThat("State should be ALLOW!", testee.getState(), is( ALLOW));
	}
	
	@Test
	public void testAllowAllowBulk(){
		testee.allow("String");
		assertThat("Transition should be possible!", testee.allow(Arrays.asList("String", "Float")), is( true));
		assertThat("State should be ALLOW!", testee.getState(), is( ALLOW));
	}
	
	@Test
	public void testAllowAllowAll(){
		testee.allow("String");
		assertThat("Transition should be possible!", testee.allowAll(), is( true));
		assertThat("State should be ALLOW_ALL!", testee.getState(), is( ALLOW_ALL));
	}
	
	@Test
	public void testAllowAllowAllExcept_NoCollision(){
		testee.allow("String");
		assertThat("Transition should be possible!", testee.allowAllExcept(Arrays.asList("Double", "Float")), is( true));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}
	
	@Test
	public void testAllowAllowAllExcept_Collision(){
		testee.allow("String");
		assertThat("Transition should not be possible!", testee.allowAllExcept(Arrays.asList("String", "Float")), is( false));
		assertThat("State should be ALLOW!", testee.getState(), is( ALLOW));
	}
	
	@Test
	public void testAllowAllAllow(){
		testee.allowAll();
		assertThat("Transition should be possible!", testee.allow("String"), is( true));
		assertThat("State should be ALLOW_ALL!", testee.getState(), is( ALLOW_ALL));
	}
	
	@Test
	public void testAllowAllAllowBulk(){
		testee.allowAll();
		assertThat("Transition should be possible!", testee.allow(Arrays.asList("String", "Float")), is( true));
		assertThat("State should be ALLOW_ALL!", testee.getState(), is( ALLOW_ALL));
	}
	
	@Test
	public void testAllowAllAllowAll(){
		testee.allowAll();
		assertThat("Transition should be possible!", testee.allowAll(), is( true));
		assertThat("State should be ALLOW_ALL!", testee.getState(), is( ALLOW_ALL));
	}
	
	@Test
	public void testAllowAllAllowAllExcept(){
		testee.allowAll();
		assertThat("Transition should not be possible!", testee.allowAllExcept(Arrays.asList("String", "Float")), is( false));
		assertThat("State should be ALLOW_ALL!", testee.getState(), is( ALLOW_ALL));
	}

	@Test
	public void testAllowAllExceptAllow_NoCollision(){
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("Transition should be possible!", testee.allow("Double"), is( true));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}

	@Test
	public void testAllowAllExceptAllow_Collision(){
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("Transition should not be possible!", testee.allow("String"), is( false));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}

	@Test
	public void testAllowAllExceptAllowBulk_NoCollision(){
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("Transition should be possible!", testee.allow(Arrays.asList("Boolean", "Double")), is( true));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}

	@Test
	public void testAllowAllExceptAllowBulk_Collision(){
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("Transition should not be possible!", testee.allow(Arrays.asList("Double", "String")), is( false));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}

	@Test
	public void testAllowAllExceptAllowAllExcept_NoCollision(){
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("Transition should be possible!", testee.allowAllExcept(Arrays.asList("String", "Float")), is( true));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}

	@Test
	public void testAllowAllExceptAllowAllExcept_Collision(){
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("Transition should not be possible!", testee.allowAllExcept(Arrays.asList("Boolean", "Float")), is( false));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}

	@Test
	public void testAllowAllExceptAllowAll(){
		testee.allowAllExcept(Arrays.asList("String", "Float"));
		assertThat("Transition should not be possible!", testee.allowAll(), is( false));
		assertThat("State should be ALLOW_ALL_EXCEPT!", testee.getState(), is( ALLOW_ALL_EXCEPT));
	}
}
