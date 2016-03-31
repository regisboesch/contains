package contains;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * JUnit test fo MyClass
 */
public class TestMyClass {

	@Test
	public void testContains() {
		String ref1 = "This is an another sentence.";
		String s1 = "sentence";
		String s2 = "anothere";
		
		assertTrue(MyClass.contains(ref1, s1));
		assertFalse(MyClass.contains(ref1, s2));
	}

}
