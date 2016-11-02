//1.5 Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string.

package CTCI_StringAndArray;


public class Question_five_char_count_in_String {

	public static void main(String[] args) {
		String sample = "adsasasde";
		System.out.println("Input: "+sample);
		System.out.println("Result: "+getResult(sample));
	}

	public static String getResult(String sample) {
		String result="", temp = "";
		int[] array = new int[256];
		for(int i = 0; i < sample.length(); i++){
			int val = sample.charAt(i);
			array[val]++;
		}
		System.out.println(temp);
		for(int i = 0; i < sample.length(); i++){
			int val = sample.charAt(i);
			if(!result.contains(""+sample.charAt(i))){
				result = result+sample.charAt(i)+array[val];
			}
		}
		return result;
	}
}