/*
 *TextProcessor.java
 *@author Henrique Oliveira
 *
*/
import java.util.Arrays;

public class TextProcessor{

	//Data member for Q1
	private String paragraph;//paragraph entered
	private String newParagraph;//paragraph modified after string
	private StringBuffer strBuff;//StringBugg
	private int count;//Count the characters excluding vowels

	//Data member for Q2
	private int wordLength, wordNumber;
	private String word[], longestWord[];


	//Constructor
	public TextProcessor(){
		paragraph = "";//Constructor for Q1
		strBuff = new StringBuffer();//Constructor for Q1
		count = 0;//Constructor for Q1
		wordNumber = 0;
		word = new String[wordNumber];
		wordLength = 0;
		longestWord = new String[wordNumber];

	}


	//Set for Q1 (user insert)
	public void setParagraph(String paragraph){
		this.paragraph = paragraph;
	}

	//Set for Q2 (user insert)
	public void setWordNumber(int wordNumber){
		this.wordNumber = wordNumber;
	}
		public void setWord(String[] word){
			this.word = word;
	}


	//Compute method for Q1
	public void computeParagraph(){

		strBuff = new StringBuffer();

		//For else for ER2 rule of inserting the first letter of my last name twice before each consonant
		for(int i = 0; i < paragraph.length(); i++){

			if(paragraph.charAt(i) == 'a' || paragraph.charAt(i) == 'e' || paragraph.charAt(i) == 'i'
				|| paragraph.charAt(i) == 'o' || paragraph.charAt(i) == 'u' || paragraph.charAt(i) == 'A'
				|| paragraph.charAt(i) == 'E' || paragraph.charAt(i) == 'I' || paragraph.charAt(i) == 'O'
				|| paragraph.charAt(i) == 'U' || paragraph.charAt(i) == ' ' || paragraph.charAt(i) == '.'
				|| paragraph.charAt(i) == '!' || paragraph.charAt(i) == '?'){
				strBuff.append(paragraph.charAt(i));
			}

			else{
				strBuff.append("OO");
				strBuff.append(paragraph.charAt(i));
			}
		}

		newParagraph = strBuff.toString();

		count = 0;

		//For for ER2 rule of counting the number of characters in the initial text excluding the number of vowels
		for(int i = 0; i < paragraph.length(); i++){
			if(paragraph.charAt(i) != 'a' && paragraph.charAt(i) != 'e' && paragraph.charAt(i) != 'i'
				&& paragraph.charAt(i) != 'o' && paragraph.charAt(i) != 'u' && paragraph.charAt(i) != 'A'
				&& paragraph.charAt(i) != 'E' && paragraph.charAt(i) != 'I' && paragraph.charAt(i) != 'O'
				&& paragraph.charAt(i) != 'U'){
					count++;

				}
			}

	}

	//Compute for Q2
	public void computeLongestWord(){
		//not working properly
		for (int i = 0; i > word.length; i++){
			wordLength = word[i].length();

		i = i+1;
		if(wordLength < word[i].length()){
			longestWord[i] = word[i+1];
		}
		else if (word[i].length() == wordLength){
			longestWord[i+1] = word[i];
			longestWord[i] = word[i+1];
		}
		else if ((wordLength > word[i].length())){
			longestWord[i+1] = word[i];
		}
		else{}
		}

	}


	//GET for Q1
	//get newParagraph after ER2 rule of inserting the first letter of my last name twice before each consonant
	public String getNewParagraph(){
		return newParagraph;
	}
	//get count after ER2 rule of counting the number of characters in the initial text excluding the number of vowels
	public int getCount(){
		return count;
	}

	//GET for Q2
	public String [] getLongestWord(){
		return longestWord;
	}



}//class