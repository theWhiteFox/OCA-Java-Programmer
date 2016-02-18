/*
If you invoke a method passing it an Animal reference to a Horse object, the compiler knows only
about the Animal, so it chooses the overloaded version of the method that takes an
Animal. It does not matter that at runtime a Horse is actually being passed.
*/

class Animal { }

class Horse extends Animal { }

public class UseAnimals
{
	public void doStuff(Animal a)
	{
		System.out.println("In the Animal version");
	}
	
	public void doStuff(Horse h)
	{
		System.out.println("In the Horse version");
	}
	
	public static void main(String [] args)
	{
		UseAnimals ua = new UseAnimals();
		Animal animalObject = new Animal();
		Animal animalRefToHorse = new Horse(); // which method is invoked?
		Horse horseObject = new Horse();
		ua.doStuff(animalObject);
		ua.doStuff(animalRefToHorse);
		ua.doStuff(horseObject);
	}
}

/*
In the Animal version
In the Horse version
*/
