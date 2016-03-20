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
		
		
			/*	String fileLocation = "C:\\Users\\Imdadul\\Desktop\\sample.txt"; 
				
				FileReader fr = null;
				try {
					fr = new FileReader(fileLocation);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				BufferedReader br =new BufferedReader(fr);
				
				
				
				
				
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
				
				// Use Random Class
				
	/*			Random rm = new Random();
				int temp = rm.nextInt(100);
			
				
				int [] array = new int [10];
				for (int i =0;i<10;i++)
					{
					while(randomNumber(50,100,temp))
						array[i]=temp;
						break;
					}
				
				for (int i =0;i<10;i++)
					System.out.println(array[i]);
				
				
			}
			
//		}

		public static boolean randomNumber(int x, int y, int z){
			return (x<y)||(y>z); 
		}
	*/
		
	


