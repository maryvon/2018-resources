package lab07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExamples {

	public void printArrayElements() {
		//0 -> 9
		int[] myArray = new int[10];

		for (int i = 0; i < 11; i++) {
			int j = myArray[i];
			//System.out.println(myArray[i]);
		}
	}

	public void divisionByZero() {
		int firstNumber = 100;
		int secondNumber = 10;

		int result = firstNumber / secondNumber;

		result = firstNumber / (secondNumber - 10);
	}

	public void readFromFile() throws FileNotFoundException {
		File file = new File("non-existing.file");
		System.out.println(file.exists());
		Scanner scan = new Scanner(file);
	}

	public void aMethodThatThrowsAnUncheckedException() throws ArrayIndexOutOfBoundsException {
		throw new ArrayIndexOutOfBoundsException();
	}

	public void aMethodThatThrowsACheckedException() throws IOException {
		throw new IOException();
	}
}
