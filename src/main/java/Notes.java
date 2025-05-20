
class Notes {
	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		Animal c = new Horse();

		a.talk();
		b.talk();
		c.talk();

		Cat cat = new Cat();
		Dog dog = new Dog();
		Horse horse = new Horse();

		a = cat;
		b = dog;
		c = horse;

		a.talk();
		b.talk();
		c.talk();

		animalTalk(cat);
		animalTalk(a);
		animalTalk(dog);
		animalTalk(b);
		animalTalk(horse);
		animalTalk(c);

		// moveAnimal(a);
		moveAnimal(cat);
		// moveAnimal(b);
		moveAnimal(dog);
		// moveAnimal(c);
		moveAnimal(horse);


		//instanceof
		//returns a boolean if the first object is the same as the second object.  Or if the second object is a subclass of the first object.


		System.out.println(a instanceof Animal); //true
		System.out.println(a instanceof Dog); //false
		System.out.println(a instanceof Cat); //true
		System.out.println(a instanceof Moveable); //true
	}

	public static void animalTalk(Animal a) {
		a.talk();
	}

	public static void moveAnimal(Moveable m) {
		m.move();
	}
}
