package com.Strings;

public class Lab4 {

	public static void main(String[] args) {
		
         String str1="JLCD";
         String str2="JLCD";
         String str3="JLCd";
         
         System.out.println(str1.equals(str2));
         System.out.println(str3.equals(str2));
         
         System.out.println(str3.equalsIgnoreCase(str2));
         System.out.println(str1.compareTo(str2)); //same
         System.out.println(str2.compareTo(str3)); //str2 is smaller
         System.out.println(str3.compareTo(str2)); //str3 is bigger
	}

}
