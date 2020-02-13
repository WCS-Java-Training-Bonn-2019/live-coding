package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Testprogramm {
	
	public static void main(String[] args) {
		
		try {
			int a = scanFile();
			assert a >= 0;
			
			int b = scanInteger();
			assert b >= 0 : "your number is smaller than 0!";
			
			int result = division(a, b);
			
			printNumber(result);
			System.out.println("no error :)");
		}
		catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found!");
		}
		catch (InputMismatchException e) {
			System.out.println("ERROR: Not a number!");
		}
		catch (ArithmeticException e) {
			System.out.println("ERROR: Never divide by 0!");
		}
		catch (DontLikeFiveException e) {
			System.out.println("ERROR!" + e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finish");
		}
		
	}
	
	private static int scanFile() throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("number.txt"));
		int i;
		
		try {
			i = sc.nextInt();
		}
		finally {
			sc.close();
		}
		
		return i;
	}
	
	private static int scanInteger() {
		
		Scanner sc = new Scanner(System.in);
		int i;
		
		System.out.print("i: ");
		
		try {
			i = sc.nextInt();
		}
		finally {
			sc.close();
		}
		
		return i;
	}

	private static int division(int a, int b) {
		return a / b;
	}
	
	private static void printNumber(int x) throws DontLikeFiveException {
		methodA(x);
	}
	
	private static void methodA(int x) throws DontLikeFiveException {
		methodB(x);
	}
	
	private static void methodB(int x) throws DontLikeFiveException {
		methodC(x);
	}
	
	private static void methodC(int x) throws DontLikeFiveException {
		if (x == 5)
			throw new DontLikeFiveException();
		
		System.out.println(x);
	}
}
