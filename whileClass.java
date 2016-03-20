package variable;
/**
 * @author Imdadul
 *
 */
public class whileClass {

	public void loopPool(int whileLoop){
		int lineCounter =1;
		while(whileLoop<20){
			System.out.println("Line number "+ lineCounter +   " printing from dowhile Loop with Value " + whileLoop);
			whileLoop++;
			lineCounter++;
		}
	}
}
