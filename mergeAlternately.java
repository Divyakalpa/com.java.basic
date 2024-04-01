package com.java.basic;

public class mergeAlternately {
		public String mergeAlternately(String word1, String word2) {
        
			StringBuilder str= new StringBuilder();
			int arrlength=Math.max(word1.length(),word2.length());
			
			for(int i=0;i<arrlength;i++) {
				if(i<word1.length()) {
					str.append(word1.charAt(i));
				}
				if(i<word2.length()) {
					str.append(word2.charAt(i));
				}
			}
			
		return str.toString();
    }
		
		   public static void main(String[] args) {
		        String word1 = "abc";
		        String word2 = "pqrbnm";

		        mergeAlternately mstr=new mergeAlternately();
		        String mergedString = mstr.mergeAlternately(word1, word2);
		        System.out.println("Merged String: " + mergedString);
		    }
}
