package polymorpism;

public class Apps {

	public static void main(String args[]){
    	Animals obj = new Horse();
    	System.out.print("Horses are ");
    	obj.eat();
    	System.out.print("making sound ");
    	obj.sound();
    	
    	Animals obj1 = new Cat();
    	System.out.print("Cats are ");
    	obj1.eat();
    	System.out.print("making sound ");
    	obj1.sound();
    	System.out.println("----------------------------");
        
    	//Example for overloads in polymorphism.
    	Overloads Obj = new Overloads();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    
	}
    
}
