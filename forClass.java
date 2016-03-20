package variable;

import java.util.Random;

/**
 * @author Imdadul
 *
 */

public class forClass extends randomGenerator {
	
	/**
	 * 
	 * @param forStartPoint This parameter will be compared with number 20 with for loop
	 * 
	 */

	public void loopPool(int forStartPoint,int maxLimit ){
		int compareWith = randGen(maxLimit);
		int lineCounter = 1;
		for (int forLoop=forStartPoint; forLoop<compareWith;forLoop++ ){
			System.out.println("Line number "+ lineCounter +   " For Loop comparing " + forLoop + " with "+compareWith);
			lineCounter++;
		}
	}
	
	public int randGen(int maxLimit) {
		Random rand = new Random();
		int number = rand.nextInt(maxLimit);
		System.out.println("For loop will compare your value with "+ number);
		return number ;
	}
}
