package test.exercise;

import org.junit.*;

public class StringProblemTest {

	// Iterate through the String, one character at a time

	@Test
	public void testRemoveCharacter1_negative1() {
		Assert.assertEquals(null, StringProblem.removeCharacter1(null, ' '));
	}

	@Test
	public void testRemoveCharacter1_negative2() {
		Assert.assertEquals("", StringProblem.removeCharacter1("", 'a'));
	}

	@Test
	public void testRemoveCharacter1_negative3() {
		Assert.assertEquals("", StringProblem.removeCharacter1(" bbb ", 'b'));
	}

	@Test
	public void testRemoveCharacter1_positive1() {
		Assert.assertEquals("tstr", StringProblem.removeCharacter1("tester", 'e'));
	}

	@Test
	public void testRemoveCharacter1_positive2() {
		Assert.assertEquals("1", StringProblem.removeCharacter1("a1a", 'a'));
	}

	@Test
	public void testRemoveCharacter1_positive3() {
		Assert.assertEquals("", StringProblem.removeCharacter1("ttt", 't'));
	}

	@Test
	public void testRemoveCharacter2_negative1() {
		Assert.assertEquals(null, StringProblem.removeCharacter2(null, ' '));
	}

	@Test
	public void testRemoveCharacter2_negative2() {
		Assert.assertEquals("", StringProblem.removeCharacter2("", 'a'));
	}

	@Test
	public void testRemoveCharacter2_negative3() {
		Assert.assertEquals("", StringProblem.removeCharacter2(" bbb ", 'b'));
	}

	// Find a method in the String class that can solve this in one line
	@Test
	public void testRemoveCharacter2_positive1() {
		Assert.assertEquals("tstr", StringProblem.removeCharacter2("tester", 'e'));
	}

	@Test
	public void testRemoveCharacter2_positive2() {
		Assert.assertEquals("1", StringProblem.removeCharacter2("a1a", 'a'));
	}

	@Test
	public void testRemoveCharacter2_positive3() {
		Assert.assertEquals("", StringProblem.removeCharacter2("ttt", 't'));
	}
}
