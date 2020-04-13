package statisticOfWords;

public class Wort {
	
	// attribues
	private int number;
	private String wordString;
	private int numberOfWord;
	
	
	// constructor
	public Wort(int number, String wordString) {
		this.number = number;
		this.wordString = wordString;
		this.numberOfWord = 1;
	}


	// getter and setter
	public int getNumberOfWord() {
		return numberOfWord;
	}


	public void setNumberOfWord(int numberOfWord) {
		this.numberOfWord = numberOfWord;
	}


	public int getNumber() {
		return number;
	}


	public String getWordString() {
		return wordString;
	}
	
	
	//compareWord()
	public static boolean compareWords(String word1, String wordToCompare) {
		
		if (wordToCompare.equals(word1)) {
			return true;
			
		} else {
			return false;

		}
		
		
	}
	
	
	

}


