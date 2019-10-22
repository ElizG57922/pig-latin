package pigLatin;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		String output = "";
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the text to be translated: ");
		String input = kb.nextLine().toLowerCase();
        kb.close();
        String[] words = input.split(" ");
        for(int i = 0; i < words.length; i++) {
        	output += translateWord(words[i]) + " ";
        }
        System.out.println(output);
	}
	
	public static String translateWord(String word) {
		String translated = "";
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		//if the word starts with a vowel
		for(int i = 0; i < vowels.length; i++) {
    		if(word.charAt(0) == vowels[i]) {
    			translated = word + "-yay";
    			return translated;
    		}
		}
		//if the word starts with a consonant or consonant cluster
		for(int i = 0; i < word.length(); i++) {
			for(int j = 0; j < vowels.length; j++) {
	    		if(word.charAt(i) == vowels[j] || word.charAt(i) == 'y') {
	    			translated = word.substring(i) + "-" + word.substring(0, i) + "ay";
	    			return translated;
	    		}
			}
		}
		return translated;
	}

}
