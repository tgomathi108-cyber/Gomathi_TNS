package exceptionhandling;

public class TryCath {
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int result;
		try {

			result = TryCath.performDivision(12, 0);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");

			result = TryCath.performDivision(12, 3);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");
		} catch (ArithmeticException e) {
			//System.out.println("I am in catch block: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(TryCath.performDivision(12f, 5f));

		System.out.println("------------------------------");
		System.out.println(TryCath.performDivision(12f, 0f));

	}

	private static int performDivision(float f, float g) {
		// TODO Auto-generated method stub
		return 0;
	}

}
