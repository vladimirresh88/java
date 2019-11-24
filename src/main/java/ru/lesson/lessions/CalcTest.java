package  ru.lesson.lessions;
import java.util.Scanner;
public class CalcTest {
	
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		final int sum;
		sum   = first + second;
		System.out.println("sum  = " + sum);
		Scanner reader = new Scanner(System.in);
		try{
			System.out.println("Enter f1  = ");
			int f1 = Integer.valueOf( reader.next());
			System.out.println("Enter f2  = ");
			int f2 = Integer.valueOf( reader.next());
			Calculator calc = new Calculator();
			calc.add(f1, f2);
			System.out.println("add  = " + calc.result);
			int res = calc.calc(1);
			System.out.println("calc  = " + res);
			try {
				calc.div(f1, f2);
				System.out.println("div = " + calc.result);
			} catch (UserExeption userExeption) {
				System.out.println(userExeption);
				System.out.println("You are bitch");
				userExeption.printStackTrace();
			}
		}
		finally
		{
			reader.close();
		}
	}
}