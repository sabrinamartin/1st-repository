
public class Main {
	
	Pigeon fluffy = new Pigeon();
	Animal charlie = new Animal();
	fluffy.fly(4);

}

class Animal {
	

}

class Pigeon extends Animal implements FlyingBirdRequirements {
	
	int height = 0; 
	int ruffles = 3;
	
	public void fly(int newHeight) {
		height += newHeight;
	}
	
	public void ruffles(int moreRuffles) {
		ruffles += moreRuffles;
	}
	
}

interface FlyingBirdRequirements {
	
	public void fly(int height);
	public void ruffles(int moreRuffles);
	
}