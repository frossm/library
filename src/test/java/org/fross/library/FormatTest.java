/**
 * 
 */
package org.fross.library;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Michael Fross (michael@fross.org)
 *
 */
class FormatTest {

	/**
	 * Test method for {@link org.fross.library.Format#Comma(java.lang.Double)}.
	 */
	@Test
	void testCommaDouble() {
		assertEquals("1,234,567.01", Format.Comma(1234567.01));
		assertEquals("999.9999", Format.Comma(999.9999));
		assertEquals(".003", Format.Comma(.003));
		assertEquals("1,000.00", Format.Comma(Double.valueOf(1000)));
	}

	/**
	 * Test method for {@link org.fross.library.Format#Comma(java.lang.Long)}.
	 */
	@Test
	void testCommaLong() {
		assertEquals("1,234,567", Format.Comma(1234567L));
		assertEquals("999", Format.Comma(999L));
		assertEquals("123,456,789", Format.Comma(123456789L));
		assertEquals("1,000", Format.Comma(1000L));
	}

	/**
	 * Test method for {@link org.fross.library.Format#humanReadableBytes(long)}.
	 */
	@Test
	void testHumanReadableBytes() {
		assertEquals("1.235 GB", Format.humanReadableBytes(1234567890));
		assertEquals("1.000 KB", Format.humanReadableBytes(1000));
		assertEquals("4.096 MB", Format.humanReadableBytes(4096000));
	}

	/**
	 * Test method for {@link org.fross.library.Format#CenterText(int, java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	void testCenterTextIntStringStringString() {
		String in = "Even Length String";
		String out = "-Even Length String+";

		assertEquals(out, Format.CenterText(20, in, "-", "+"));

		in = "Odd Length String";
		out = "-   Odd Length String   +";
		assertEquals(out, Format.CenterText(25, in, "-", "+"));
	}

	/**
	 * Test method for {@link org.fross.library.Format#CenterText(int, java.lang.String)}.
	 */
	@Test
	void testCenterTextIntString() {
		String in = "Even Length String";
		String out = " Even Length String ";

		assertEquals(out, Format.CenterText(20, in));

		in = "Odd Length String";
		out = "    Odd Length String    ";
		assertEquals(out, Format.CenterText(25, in));
	}

	/**
	 * Test method for {@link org.fross.library.Format#Capitalize(java.lang.String)}.
	 */
	@Test
	void testCapitalize() {
		assertEquals("CapitalizeD first CHAracter", Format.Capitalize("capitalizeD first CHAracter"));
	}

}