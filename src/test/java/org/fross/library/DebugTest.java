/**
 * 
 */
package org.fross.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Michael Fross (michael@fross.org)
 *
 */
class DebugTest {

	@Test
	void test() {
		// Should be false as Debug has not been enabled
		assertFalse(Debug.query());
		
		// Turn on Debugging
		Debug.enable();
		assertTrue(Debug.query());
		
		// Turn it back off
		Debug.disable();
		assertFalse(Debug.query());
		
	}

}
