

import java.util.Random;

/**
 * @author Imdadul
 *
 */
public class whileClass extends randomGenerator {

	/**
	 * 
	 * @param whileLoop This number will be compared with 20 in while loop
	 */
	public void loopPool(int whileLoop, int maxLimit){
		int compareWith = randGen(maxLimit);
		int lineCounter =1;
		while(whileLoop<compareWith){
			System.out.println("Line number "+ lineCounter +   " do while Loop comparing " + whileLoop + " with "+compareWith);
			whileLoop++;
			lineCounter++;
		}
	}

	
	public int randGen(int maxLimit) {
		Random rand = new Random();
		int number = rand.nextInt(maxLimit);
		System.out.println("while loop will compare your value with "+ number);
		return number;
	}
	
}
