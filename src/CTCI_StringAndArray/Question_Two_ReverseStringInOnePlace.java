// 1.2 Implement a function void reverse(char* str) in C or C++ which reverses a null-terminated string.

package CTCI_StringAndArray;

public class Question_Two_ReverseStringInOnePlace {
	public static void main(String[] args) {
		String s[] ={"Shubham Dilip Yeole", "Harshada Gothankar", "Amitayu Jain", "Jimmy Patel", "Yasha Sardey", "Silpa"};
		for(int i=0; i <s.length; i++){
			System.out.println(getResult(s[i]));
		}
	}
	
	public static String getResult(String sample){
		StringBuffer result = new StringBuffer(sample);
		boolean[] chars = new boolean[sample.length()];
		char temp, start, end;
		int len = sample.length(), count =0, count1 = len-1;
		for(int i=0; i<sample.length()/2; i++){
			start = result.charAt(count);
			end = result.charAt(count1);
			result.setCharAt(count,end);
			result.setCharAt(count1,start);
			count1--;
			count++;
		}
		return result.toString();
	}
}

//  abcdefg

// get start and last