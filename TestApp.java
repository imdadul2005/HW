

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog g1 = new Dog();
		g1.setDogName("Tom");
		Dog g2 = new Dog();
		g2.setDogName("Jemmy");
		Dog g3 = new Dog();
		g3.setDogName("Henry");
		
		Zoo dogZoo = new Zoo();
		
		dogZoo.addPet(g1);
		dogZoo.addPet(g2);
		dogZoo.addPet(g3);
		
		dogZoo.getZooInfo();
	}

}
