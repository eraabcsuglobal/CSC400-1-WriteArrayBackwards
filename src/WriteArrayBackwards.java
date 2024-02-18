public class WriteArrayBackwards {
	
	// recursive method that will write array backwards
	// array takes in an array of string elements and the array length
	public static String[] reverseArray(String[] strArray, int length) {
		// during each recursion, if the remaining length is less than or equal to half the original array length, return the now-reversed array
		if (length <= strArray.length / 2) {
			return strArray;
		} else {
			// else, create a temporary slot to store the value of the current point in the array
			String tempVal = strArray[length - 1];
			// swap the current point in the array with the element that is at the end of the array minus the current position
			strArray[length - 1] = strArray[strArray.length - length];
			strArray[strArray.length - length] = tempVal;
		}
		
		return reverseArray(strArray, length - 1);
	}
	

}
