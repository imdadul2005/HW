/**
 * 
 */
package variable;

import java.util.Scanner;


/**
 * @author Imdadul Hoq
 *
 */
public class TestClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Type your name ");
		
		
		String userName = input.nextLine();
		System.out.println("Your name is "+userName);
		
		
		System.out.println("Type your number that will be comared with a random number ");
		int poolcounter = input.nextInt();
		
		System.out.println("Give a max limit");
		int maxLimit = input.nextInt();
		
		doWhile doWhileTest = new doWhile();
		forClass forTest = new forClass();
		whileClass whileTest = new whileClass();
		
		
		doWhileTest.loopPool(poolcounter,maxLimit);
		forTest.loopPool(poolcounter,maxLimit);
		whileTest.loopPool(poolcounter,maxLimit);
		input.close();
	}		
}