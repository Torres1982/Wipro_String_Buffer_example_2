import java.lang.StringBuffer;

class Day2Task12 {
	public static void main(String args[]) {
		String string = "Barcelona";
		String firstHalfOfString = formHalfOfTheString(string);
		
		System.out.println(firstHalfOfString);	
	}
	
	public static String formHalfOfTheString(String string) {
		String result = "";
		int stringLength = string.length();
		StringBuffer buffer1 = new StringBuffer(string);
		
		if (stringLength % 2 == 1) {
			return null;
		} else {
			buffer1.setLength(stringLength/2);
			result = buffer1.toString();
		}
		return result;
	}
}