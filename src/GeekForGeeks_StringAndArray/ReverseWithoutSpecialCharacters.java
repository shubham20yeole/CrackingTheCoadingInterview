package GeekForGeeks_StringAndArray;

public class ReverseWithoutSpecialCharacters {

	public static void main(String[] args) {
		String sample = "ab67j@"; // j76ba@
		StringBuffer s = new StringBuffer(sample);
		System.out.println(s);
		char start, end;
		int count = 0 , count1 = sample.length()-1;
		for(int i=0;i<sample.length()/2;i++){
			int val = sample.charAt(count);
			int val2 = sample.charAt(count1);
			System.out.println(sample.charAt(count) +" Status: "+isSpecial(val));
			System.out.println(sample.charAt(count1) +" Status: "+isSpecial(val2));
		}
		System.out.println(s);
	}
	public static boolean isSpecial(int val){
		if((val>=48 && val<=57) && (val>=65 && val<=90) && (val>=97 && val<=122))
			return false;
		else return true;

	}
}
