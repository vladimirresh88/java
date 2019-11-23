import java.util.Scanner; 
public class CalcTest {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum   = first + second;
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
			System.out.println("res  = " + res);
		}
		finally
		{
			reader.close();
		}
	}
}