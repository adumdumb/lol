
// Cat is a Subclass of Animal
// You create subclasses with the extends keyword
// Now Cat has all the Methods and Fields that Animal defined
// This is known as inheritance because Cat inherits all
// the methods and fields defined in Animal

public  class Kyle extends Animal{
	
	
	// You can add new fields to the subclass
	public String favToy = "Big mac";
	
	// You can add new methods
	public void playWith(){
		
		System.out.println("mmmmmmmmm " + favToy);
		
	}
	
	// Here I overrode the Animal walkAround method
	public void walkAround(){
		
		// this refers to a specific object created of type Cat
		
		System.out.println(this.getName() + " takes five steps and falls asleep");
		
	}
	
	public String getToy(){
		
		return this.favToy;
		
	}
	
	public Kyle(){
		
	}
	
	public Kyle(String name, String favFood, String favToy){
		
		// super calls the constructor for the super class Animal
		
		super(name, favFood);
		
		// We set the favToy value in Cat because it doesn't 
		// exist in the Animal class
		
		this.favToy = favToy;
		
	}
	
}
