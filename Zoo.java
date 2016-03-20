

public class Zoo {

	static int counter =0; //static is being used here as an ID number
	final int max = 5  ;
	private Dog [] array = new Dog [max];
	public void addPet(Dog newDog){
		array[counter] = newDog;
		counter = counter+1;	
	}

	public void getZooInfo(){
	
		for (int i= 0; i<counter; i++)
			System.out.println("Dog "+array[i].getDogName() + " is in zoo ");
	}
	
	
	
}
