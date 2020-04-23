package statisticOfWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Wortstatistik {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int amountOfWords = 0;
		String eingabeString;
		String newWordString = "";
		
		System.out.println("Bitte geben Sie Wörter oder Buchstaben ein; jeweils durch ein Leerzeichen getrennt:");
		eingabeString = br.readLine();
		System.out.println("Du hast '" + eingabeString + "' eingegeben.");
		System.out.println("Länge des Strings: " + eingabeString.length());
		
		
		ArrayList<Wort> words = new ArrayList<>();
		
		if (eingabeString.equals("")) {
			eingabeString = "Fehler!";
		}
		
		
		// String in Wörter aufteilen
		int i = 0;
		do {
		  String buchstabe = "" + eingabeString.charAt(i);
			
			
			
			if (buchstabe.equals(" ")) {
				if (newWordString != "") {
					words.add(new Wort(i, newWordString));
					amountOfWords++;
					newWordString = "";
				} else {
					newWordString = "";
				}
				
			} else {
				newWordString = newWordString + buchstabe;
			}
		  i++;
		}
		while (i < eingabeString.length());
		words.add(new Wort(i, newWordString));
		amountOfWords++;
		
		System.out.println("amount of Words: " + amountOfWords);
		
		
		// Vergleich der Wörter
		for (int j = 0; j < amountOfWords-1; j++) {
			for (int m = j+1; m < amountOfWords; m++) {
				
				if ((words.get(j).getNumberOfWord() != 0) && Wort.compareWords(words.get(j).getWordString(), words.get(m).getWordString())) {
					// words are the same
					words.get(j).setNumberOfWord(words.get(j).getNumberOfWord() + 1);
					words.get(m).setNumberOfWord(0);
				} 	
			}
		}
		
		
		// ausgeben der Liste...
		for (int j = 0; j < amountOfWords; j++) {
			if (words.get(j).getNumberOfWord() != 0 && !words.get(j).getWordString().equals("")) {
				System.out.println(words.get(j).getWordString() + ": " +words.get(j).getNumberOfWord());
				
			}	
		}
	}
	

}

/* regular expression 
 * 
 * ---> Nachschlagen! --> https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
 */





