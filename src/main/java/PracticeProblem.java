import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		char d;
		d = 'a';

		System.out.print("In: ");
		String prompt;
		prompt = in.nextLine();
		System.out.println(prompt.charAt(0));
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Boolean trueFalse;
		trueFalse = in.nextBoolean();
		in.nextLine();
		System.out.println(!trueFalse);
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Integer num;
		num = in.nextInt();
		in.nextLine();
		System.out.println(num > 5);

		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Double var;
		var = in.nextDouble();
		in.nextLine();
		System.out.println(-2 <= var && var <= 2);
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String word;
		word = in.nextLine();
		System.out.println(word.equals("Hello World"));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: In: ");
		Integer num1;
		Integer num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
		in.nextLine();
		System.out.println(num1 <= num2);
	}

	public static void q7() {
		//Write question 7 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: In: ");
		double var1;
		double var2;
		var1 = in.nextDouble();
		var2 = in.nextDouble();
		in.nextLine();
		System.out.println(var1 > var2);
	}

}
