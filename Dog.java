

public class Dog implements Animal {

	private String DogName ;
	
	public String getDogName() {
		return DogName;
	}

	public void setDogName(String dogName) {
		DogName = dogName;
	}

	public String sound() {
		String sound = "Woof";
		return sound;
	}

	public String eat() {
		// TODO Auto-generated method stub
		String eat ="Meat "; 
		return eat;
	}

	public int speed() {
		// TODO Auto-generated method stub
		return 5;
	}


	
}
