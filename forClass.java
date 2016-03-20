package variable;

/**
 * @author Imdadul
 *
 */

public class forClass {

	public void loopPool(int forStartPoint ){
		int lineCounter = 1;
		for (int forLoop=forStartPoint; forLoop<15;forLoop++ ){
			System.out.println("Line number "+ lineCounter +   " printing from For Loop with Value "+ forLoop);
			lineCounter++;
		}
	}
}
