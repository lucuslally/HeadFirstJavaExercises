class Dog {
	
	int size;
	String breed;
	String name;

	void bark(){
		System.out.println("Ruff! Ruff!");

	}//method

}//class 

class DogTestDrive {
	public static void main (String[] args){
	// Doggie test code goes here

	Doggie d = new Doggie(); // make a new object

	d.size = 40; // set its size using the dot operator
	d.bark(); // tell it to bark using the dot operator


	}//method

}//class