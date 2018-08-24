package Classes;


public abstract class Human {
	private String Name;
	
	public Human() {
		
	}
	
	public Human(String name) {
		this.Name = name;
	}
	
	public String getName () { return this.Name;}
	
	public void Walk(String going ) {
		if (going != "") {
			System.out.println(this.Name + " walking toward to" + going);
		} else {
			System.out.println(this.Name + " just walking");
		}
		
	}
	
	public String Breath () {
		return "Human need O2 to breath.";
	}
}
