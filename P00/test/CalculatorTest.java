import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	// How to run the Test methods: Run as -> JUnit Test
	// The status bar color of JUnit has success or failure indicated as GREEN and RED respectively.
	
	@Test
	public void testAdd() {
		// Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();

		// Act
		int actual = cal.add(a, b);

		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}

	
	@Test
	/*^^^
	 The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case.
	 To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method.
	 Any exceptions thrown by the test will be reported by JUnit as a failure.
	 If no exceptions are thrown, the test is assumed to have succeeded.
	 */
	public void testSubtract() {
		// Arrange
		int a = 4;
		int b = 1234;
		Calculator cal = new Calculator();

		// Act
		int actual = cal.subtract(a, b);

		// Assert
		int expected = 5555;	//-1230
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		// Arrange
		int a = 5;
		int b = 1111;
		Calculator cal = new Calculator();

		// Act
		int actual = cal.multiply(a, b);

		// Assert
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		// Arrange
		int a = 5;
		int b = 1000;
		Calculator cal = new Calculator();

		// Act
		int actual = cal.divide(a, b);

		// Assert
		int expected = 200;	//5000
		assertEquals(expected, actual);
	}

}
