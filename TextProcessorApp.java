/*
 *TextProcessorApp.java
 *@author Henrique Oliveira
 *
*/

import java.util.Scanner;
import java.util.Arrays;

public class TextProcessorApp{

	public static void main (String args[]){

		//Declare  variables for Q1
		String paragraph;//paragraph entered
		String newParagraph;//paragraph modified after string
		int count;//Count the characters excluding vowels
		String repeat;//Insert more paragraphs
		int menu;//Insert menu option


		//Declare objects for Q1
		Scanner sc = new Scanner (System.in);
		TextProcessor myT = new TextProcessor();


		//Do While to set the menu options
		do{

		//Input for menu
		System.out.println("\n ____________________________________________________" +
						"\n|Welcome to the Programming Society Application Menu!|" +
						"\n|                                                    |" +
						"\n|1 - Encode paragraphs                               |" +
						"\n|2 - Enter words and find the longest one            |" +
						"\n|3 - Exit Application                                |" +
						"\n|Enter your choice (1, 2 or 3):                      |" +
						"\n|____________________________________________________|" +
						"\n ");
		menu = Integer.parseInt(sc.nextLine());

			if(menu == 1){
				//Do While for input and output for Q1 MPA2
				do{
					//Input for Q1
					System.out.println("\n " + "Please enter paragraph");
					paragraph = sc.nextLine();

					//Set for Q1 (user input)
					myT.setParagraph(paragraph);

					//Process for Q1
					myT.computeParagraph();

					//Fetch results and Output for Q1
					newParagraph = myT.getNewParagraph();
					count = myT.getCount();

					//Output for Q1
					System.out.println("\n " + "Your encoded paragraph is " + newParagraph + count);

					//Repeat for inserting more paragraphs for Q1 MPA2
					System.out.println("\n " +  "Would you like to encode another paragraph?(yes or no)");
					repeat = sc.nextLine();
				}

				while (!repeat.equalsIgnoreCase("no"));
			}

			else if(menu == 2){
				System.out.println("\n " + "How many words would you like to enter?");
				int wordNumber = Integer.parseInt(sc.nextLine());
				String word[] = new String [wordNumber];
				myT.setWordNumber(wordNumber);


				for(int i = 0; i < word.length; i++){
					System.out.println("\n " + "Please enter word " + "(" + (i+1) + "):");
					word[i] = sc.nextLine();
				}

				myT.setWord(word);

				String longestWord[] = new String[wordNumber];

		System.out.println("the longest is: " + Arrays.deepToString(longestWord));


			}

			else if(menu == 3){
				System.out.println("Thank you");
			}

			else{
				System.out.println("Not a valid function.");
			}
		}

		while(menu != 3);

	}//Main
}//Class