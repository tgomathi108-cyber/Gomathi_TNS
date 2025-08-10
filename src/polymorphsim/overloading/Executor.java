package polymorphsim.overloading;

public class Executor {

	public static void main(String[] args) {
		System.out.println("Is 121 Palindrome? "+Operation.isPalindrome(121));
		System.out.println("Is 123 Palindrome? "+Operation.isPalindrome(123));
		
		System.out.println("Is CAR Palindrome? "+Operation.isPalindrome("CAR"));
		System.out.println("Is RACECAR Palindrome? "+Operation.isPalindrome("RACECAR"));

		

	}

}
