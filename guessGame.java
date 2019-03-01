/* 
	Simple java game where the user must guess 
	a number. 
*/

class guessGame{
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
				System.out.println("That's right!"); 
				foundAnswer = true;
			}
			else {
				System.out.println("Try Again!");				  
				System.out.println("===========");
				ch = (char) System.in.read();
			}
		}
	}
}
	
