public class TestArrayReversal {

	public static void main(String[] args) {
		String[] namesArray = {"Sean", "Matt", "Evan", "Catherine", "Katie"};
		
		int arrayLength = namesArray.length;
		
		for (int i = 0; i < namesArray.length; i++) {
			System.out.print(namesArray[i] + " ");
		}
		
		WriteArrayBackwards.reverseArray(namesArray, arrayLength);
		
		System.out.println();
		
		for (int i = 0; i < namesArray.length; i++) {
			System.out.print(namesArray[i] + " ");
		}
	}
}