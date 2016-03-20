/**
 * 
 */
package variable;

import java.util.Random;

/**
 * @author Imdadul Hoq
 * @
 */
public class doWhile extends randomGenerator {

	/**
	 * 
	 * @param doWhile This parameter will be compared with number 20
	 * 
	 */
	public void loopPool(int doWhile, int maxLimit){
	
	int compareWith = randGen(maxLimit);
	int lineCounter = 1;
		do{
			System.out.println("Line number "+ lineCounter +   " do while Loop comparing " + doWhile + " with "+compareWith);
			doWhile++;
			lineCounter++;
		}while(doWhile<compareWith);
	}

	public int randGen(int maxLimit) {
		Random rand = new Random();
		int number = rand.nextInt(maxLimit);
		System.out.println("Do while will compare your value with "+ number);
		return number ;
		
	}
}
