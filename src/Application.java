class Frog{
	
	private int id;
	private String name;
	
	public Frog (int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" ").append(name);
		return sb + " says ribbit.";
		//that's more complicated than it needs to be
		//but you're practicing stuff from previous lessons
	}
}

//what's the toString method for?
//it creates a string representation of your object to help you id it
//ie, you can easily print something each time you create an object
//good for debugging

//as you can see in your example, you can make toString really simple or complicated
//but it's an easy way to make strings with variables.

public class Application {
	
	public static void main(String[] args) {
		
		//in java, Object is a built-in class
		Object obj = new Object();
		
		//if you type obj. you will automatically get a dropdown list
		//of some of the common methods in the object class
		
		//your Frog class above is treated just like the Object class
		//when you type frog1. you'll get the same menu!
		
		Frog frog1 = new Frog(6, "Fred");
		//frog1.  that was to see the menu only
		
		Frog frog2 = new Frog(8, "Betty");
		
		System.out.println(frog1);
		System.out.println(frog2);
	}

}
