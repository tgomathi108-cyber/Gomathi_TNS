package wrapper;
public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//AutoBoxing - primitive to object
		//UnBoxing - object to primitive
		
		int x = 5;
		//AutoBoxing
		Integer y = Integer.valueOf(x);
		
		//UnBoxing 
		
		int z = y;
		
		System.out.println(y +" "+ z);

	}
}