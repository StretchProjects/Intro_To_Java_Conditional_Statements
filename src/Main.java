/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Conditional statements
 * Lecture  : http://youtu.be/MZYonE482B4
 * Tutorial : http://youtu.be/Au8zcAr2irM
 * License  : None.  Do with it as you wish! :)
 */

public class Main {

	public static void main(String[] args) {
		int firstNumber = 2;
//		int secondNumber = 20;
		
		/*if (firstNumber > secondNumber || (firstNumber > 0  && secondNumber < 30)) {
			System.out.println(firstNumber + " is greater than " + secondNumber);
		} else if (firstNumber > 10) {
			System.out.println(firstNumber + " is greater than 10");
		} else {
			System.out.println(firstNumber + " is not greater than " + secondNumber);
		}*/
		
		//if (firstNumber > secondNumber) System.out.println("something");
	
		switch (firstNumber) {
		case 5:
			System.out.println(5);
			break; //remember this!
		case 4:
			System.out.println(4);
			break; //remember this!
		case 3:
			System.out.println(3);
			break; //remember this!

		default:
			System.out.println("Not recognised");
			break; //remember this!
		}
	}

}
