package lab07;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

public class ExceptionExamplesTest {

	private ExceptionExamples exceptionExamples;

	@Before
	public void setup() {
		exceptionExamples = new ExceptionExamples();
	}

	@Test
	public void testArrayIndexOutOfBounds() {
		System.out.println(testSomething());
		System.out.println("Keep going");
	}

	private int testSomething() {
		try {
			exceptionExamples.printArrayElements();
			return 0;
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			return 1;
		}
		finally {
			return 2;
		}
	}

	@Test(expected = FileNotFoundException.class)
	public void testDivisionByZero() throws FileNotFoundException {
		exceptionExamples.readFromFile();
	}

	@Test
	public void test() {
		exceptionExamples.aMethodThatThrowsAnUncheckedException();
		//exceptionExamples.aMethodThatThrowsACheckedException();
	}

	@Test
	public void testPrinter() {
		Printer printer = new Printer();
		try {
			printer.print("hello world how are you");
			printer.print("then printing some other text");
			printer.print("suddenly getting out of ink");
			printer.print("and paper");
			printer.print("oh noo123456789");
		} catch (OutOfPaperException exception) {
			System.out.println("It ran out of paper");
		} catch (OutOfInkException exception) {
			System.out.println("It ran out of ink");
		}
	}
}
