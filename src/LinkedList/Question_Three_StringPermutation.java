//1.3 Given two strings, write a method to decide if one is a permutation of the other
package LinkedList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question_Three_StringPermutation {
	public static void main(String[] args) {
		System.out.println("Purmutation Status: "+method_1("hello","dog"));
		System.out.println("Purmutation Status: "+method_2("odg","dog"));
	}

	private static boolean method_1(String sample_1, String sample_2) {
		char[] array1 = sample_1.toCharArray();
		char[] array2 = sample_2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		sample_1 = String.valueOf(array1);
		sample_2 = String.valueOf(array2);
		
		if(sample_1.equals(sample_2)) return true;
		else return false;
	}

	private static boolean method_2(String sample_1, String sample_2) {
		char[] array1 = sample_1.toCharArray();
		char[] array2 = sample_2.toCharArray();
		boolean result = false;
		int[] abc = new int[256];
		for(int i=0; i <array1.length; i++){
			int val = array1[i];
			abc[val]++;
		}
		for(int i=0; i <array2.length; i++){
			int val2 = array2[i];
			abc[val2]--;
			if(abc[val2]<0) {
				result = false;
				break;
			}else{
				result = true;
			}
		}

		return result;
	}
}

// 1 2 3 4 5 6 7 
// 1

