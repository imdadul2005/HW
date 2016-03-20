/**
 * 
 */
package variable;


/**
 * @author Imdadul Hoq
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		doWhile doWhileTest = new doWhile();
		forClass forTest = new forClass();
		whileClass whileTest = new whileClass();
		
		doWhileTest.loopPool(10);
		forTest.loopPool(13);
		whileTest.loopPool(5);
	}		
}