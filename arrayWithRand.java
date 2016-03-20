

import java.util.Random;
import java.util.Scanner;

public class arrayWithRand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
     	System.out.println("Type a max random number ");
		int maxLimit = input.nextInt();
		Random rand = new Random();
	
		
		int [] array = new int[10];
		for (int i=0; i<array.length;i++)
			array[i]=rand.nextInt(maxLimit);
		
		int counter = 0;
		while(counter<array.length){
			System.out.println("array["+  counter +"] = "+ array[counter] );
			counter++;
		}
		input.close();
	}
	

}
