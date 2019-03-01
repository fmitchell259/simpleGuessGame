/* 
	Simple java game where the user must guess 
	a number. Giving the user more clues regarding
	upper or lower case. 
*/

class guessGameWithIf{
	public static void main(String args[])
	throws java.io.IOException {
		
		char ch, answer = 'K';
		boolean foundAnswer = false;
		
		System.out.println("Java for beginners guessing program.");
		
		while (foundAnswer == false){
			System.out.println("-------------------------------------------");
			System.out.println("I'm thinking of a letter, can you guess it?");
			ch = (char) System.in.read();
			if (ch == answer){
				System.out.println("That's right!"); // I tried to add foundAnswer = true here but
				foundAnswer = true;
			}
			else {
				if ( ch >= 97 & ch <= 122){
				
					System.out.println("Try Again! You have the wrong case!");				  
					System.out.println("===========");
					ch = (char) System.in.read();
				}
			
				else {
					if (answer < ch){
						System.out.println("--------------------"); 	
					System.out.println("Wrong Answer, try lower in the alphabet! Try Again!");				  
					System.out.println("===========");
					ch = (char) System.in.read();
					}
				
					else {
						System.out.println("---------------------");
						System.out.println("Wrong Answer, try higher in the alphabet! Try Again!");				  
						System.out.println("===========");
						ch = (char) System.in.read();
					}
				}
			}
		}
	}
}	

