//Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.
//
//Return all such possible sentences.
//
//For example, given
//s = "snakesandladder",
//dict = ["snake", "snakes", "and", "sand", "ladder"].
//
//A solution is ["snakes and ladder",
//           "snake sand ladder"].
package CTCI_StringAndArray;

public class GeekForGeeks {
	public static void main(String[] args) {
		String s = "snakesandladder";
		String[] dict = {"snake", "snakes", "and", "sand", "ladder"};
	    permutation("", "abc"); 

		for(int i=0;i<dict.length;i++){
			String word = dict[i]; int count=0;
				if(s.contains(word)){
//					System.out.println(word);
				}
		}

	}
	private static void permutation(String prefix, String str) {
	    
	    if (str.length() == 0){
	    	System.out.println(prefix+"\n");
	    }
	    else {
	        for (int i = 0; i < str.length(); i++){
	        	permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
	        }
	    }
	}
}

// abc 

//package StringAndArray;
//
//public class GeekForGeeks {
//	public static void main(String[] args) {
//		String s = "snakesandladder";
//		StringBuilder s1 = new StringBuilder("snakesandladder");
//		String[] dict = {"snake", "snakes", "and", "sand", "ladder"};
//
//		for(int i=0;i<dict.length;i++){
//			String word = dict[i]; int count=0;
//			for(int j=0;j<word.length();j++){
//				if(s.contains(""+word.charAt(j))){
//					s1.setCharAt(j,'z');
//					count++;
//					if(count==word.length()) System.out.println("We found");
//				}
//			}
//		}
//		System.out.println(s1);
//
//	}
//}

