package com.mk.JavaCompRef.StringHandler16;

public class PalindromeCheckString {

	public static void main(String as[]){
		
		String str = "madam";
		String str1 = "civic";
		
		System.out.println("Is Word \""+str+"\" "+isPalindrome(str));
		System.out.println("Is Word \""+str1+"\" "+isPalindromeString(str1));
	}
	private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
	private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        //System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}
