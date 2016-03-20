/**
 * 
 */
package variable;

/**
 * @author Imdadul Hoq
 *
 */
public class doWhile {

	public void loopPool(int doWhile){
	int lineCounter = 1;
		do{
			System.out.println("Line number "+ lineCounter +   " printing from do while Loop with Value "+ doWhile);
			doWhile++;
			lineCounter++;
		}while(doWhile<20);
	}
}
