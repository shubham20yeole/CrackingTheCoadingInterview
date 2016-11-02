//Write a method to replace all spaces in a string with '%20'. You may assume that the
//string has sufficient space at the end of the string to hold the additional characters,
//and that you are given the "true" length of the string. (Note: if implementing in Java,
//please use a character array so that you can perform this operation in place.)

package LinkedList;

public class Question_Four_Replace_Spaces {
	public static void main(String[] args) {
		String string = "Mr Shubham Dilip Yeole";
		char[] array = string.toCharArray();
		System.out.println("\n\nInput : " +string);
		System.out.println("\n\nResult: "+method_1(array,string.length()));
//		method_1(array,string.length());
	}

	private static String method_1(char[] array, int length) {
		int spaceCount = 0;
		for(int i=0; i<array.length; i++){
			if(array[i]==' ') spaceCount++;
		}
		int count = 0;
		int newLength = length + spaceCount*2;
		char[] newArray = new char[newLength];

		for(int i= 0; i<array.length; i++){
			if(array[i]==' '){
				newArray[count++] = '%';
				newArray[count++] = '2';
				newArray[count++] = '0';
			}else{
				newArray[count] = array[i];
				count++;
			}
		}
        String newString1 = new String(newArray);

		return newString1;
	}
}
