
public class LessonFourteen{
	
public static void main(String[] args){
		
		// I create a Animal object named genericAnimal
	
		Animal genericAnimal = new Animal();
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
	
		// I create a Cat class like any other
		Kyle morris = new Kyle("Daniel", "Crap", "Complaining");
		
		// Print out the name, favFood and favToy
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		// You can also create classes based on the super class
		
		Animal Jamie = new Kyle("Kyle", "Bigmac", "Maccas");
		
		// You pass objects like any other field
		acceptAnimal(Jamie);
		
	}
	
	public static void acceptAnimal(Animal randAnimal){
		
		// Gets the name and favFood for the Animal passed
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		
		// This is Polymorphism
		// The interpreter automatically figures out what type
		// of Animal it's dealing with and checks to make sure
		// if methods were overwritten that they are called 
		// instead
		randAnimal.walkAround();
		
		// The interpreter won't find anything that doesn't 
		// originally exist in the Animal class however
		// System.out.println(randAnimal.favToy); Throws an ERROR
		
		// If you want access to fields or methods only found
		// in the Cat class you have to cast the object to
		// that specific class first
		Kyle tempCat = (Kyle) randAnimal;
		
		System.out.println(tempCat.favToy);
		
		// You could also cast the object directly like this
		System.out.println(((Kyle) randAnimal).favToy);
		
		// You can use instanceof to check what type of object
		// you have. This results in a positive for Animal 
		// and for Cat
		if (randAnimal instanceof Kyle)
		{
			System.out.println(randAnimal.getName() + " is a Snorlax");
		}
		
	}
	
}