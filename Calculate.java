public class Calculate{

	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first =Integer.valueOf(arg[0]);
		int second=Integer.valueOf(arg[1]);
		int summ=first + second;
		System.out.println("Sum "+summ);
		int sub=first - second;
		System.out.println("Sub "+sub);
		double div =first / second;
		System.out.println("Div "+div);
		int multi=first * second;
		System.out.println("Multi "+multi);
	}

}