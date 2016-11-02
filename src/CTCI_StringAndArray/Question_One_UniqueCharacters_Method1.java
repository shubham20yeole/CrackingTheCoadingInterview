//1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
// Author: Shubham Yeole

package CTCI_StringAndArray;
public class Question_One_UniqueCharacters_Method1 {
	public static void main(String[] args) {
		String s[] ={"hello world", "tina", "Shubham"};
		for(int i=0; i <s.length; i++){
			System.out.println("METHOD _ 1 : --- "+method_1(s[i]));
			System.out.println("METHOD _ 2 : --- "+method_2(s[i]));
			System.out.println("METHOD _ 3 : --- "+method_3(s[i]));
		}
	}

	public static String method_1(String sample){
		String result = null;
		for(int i=0; i<sample.length();i++){
			for(int j=i+1; j<sample.length();j++){
				if(sample.charAt(i)==sample.charAt(j)){
					result = sample+" Duplicate";
					return result;
				}else{
					result = sample+" Unique";
				}
			}
		}
		return result;
	}

	public static String method_2(String sample){
		String result = null;

		if(sample.length()>256) return sample+" Duplicate";

		boolean[] charss = new boolean[256];
		for(int i=0; i<sample.length(); i++){
			int val = sample.charAt(i);
			if(charss[val]==true) return sample+" Duplicate";
			charss[val] = true;
		}
		if (result == null) result = sample+" Unique";
		return result;
	}
	public static boolean method_3(String sample){
		int checker = 0;
		for (int i=0; i < sample.length(); i++) {
			int val = sample.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);

		}
		return true;
	}
}
