import java.util.concurrent.SynchronousQueue;

public class recursion {

	public static void main(String[] args) {
		int[] intArray = {50,75,45,55,5};
		String example = "bellaria";

		
		System.out.println(powerOfThree(2));

		backwards(example, example.length());
		System.out.println(" ");
		forwards(example, 0);
		
		System.out.println("\n"+sum(intArray, intArray.length));
		
		
		System.out.println("max" + max(intArray, intArray.length));
		
		System.out.println(min(intArray, intArray.length));
		
		forwardArray(intArray, 0);
		backwardsArray(intArray, intArray.length);
		
		System.out.println(arraySum(intArray, intArray.length));
	}
	
	static int powerOfThree (int  x) {
		if (x == 0) {
			return 1;
		}

		return 4 * powerOfThree(x-1);

	}


	private static void backwards(String substring, int i) {
		if (i == 1) {
			System.out.print(substring.charAt(0));
		}
		else {
			System.out.print(substring.charAt(i-1));
			backwards(substring, i-1);
		}
	}
	
	public static void forwards(String substring, int i) {
		if (i == substring.length()-1) {
			System.out.print(substring.charAt(substring.length()-1));
		}
		else {
			System.out.print(substring.charAt(i));
			forwards(substring, i+1);
		}
	}
	
	
	public static int sum(int[] i, int length) {
		if (length == 1) {
			return i[0];
		}
		return i[length-1] + sum(i, length-1);
		
	}
	

	
	public static int max (int[] i, int length) {
		if (length == 1) {
			return i[0];
		}
		return Math.max(i[length-1], max(i, length-1));
		
	}
	
	public static int min (int[] i, int index) {
		if (index == 1) {
			return i[0];
		}
		return Math.min(i[index-1], min(i, index-1));
	}
	
	public static void forwardArray(int[] array, int length) {
		if (length != array.length) {
			System.out.print(array[length]+" ");
			forwardArray(array, length+1);
			
		}
		else {
			System.out.println("");
		}
				
	}

	public static void backwardsArray(int[] array, int length) {
		if (length != 0) {
			System.out.print(array[length-1] + " ");
			backwardsArray(array, length-1);
		}
		else {
			System.out.println("");
		}
	}
	
	public static int arraySum(int[] array, int index) {
		if (index == 1)
			return array[0];
		return array[index-1] + arraySum(array, index-1);
	}
	
	
}
