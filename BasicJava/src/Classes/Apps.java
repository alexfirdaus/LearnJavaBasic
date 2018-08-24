package Classes;
import java.util.Scanner;

public class Apps {
	public static void main(String []args) {
		String greet = "Hello World!";
		System.out.println(greet); 
	
		Human men = new Mens("Alex");
		men.Walk("");
		
		System.out.println("Who??"); 
		System.out.println(men.getName());
		
		System.out.println("I've some number in my backpack, would you check it for me? please.");
		Integer[] Numbers = {12, 32, 10, 5, 20};
		
		System.out.println("Yes, ofcourse.");
		System.out.println("tell me the numbers.");
		System.out.println("There is:");
		for (int i = 0; i < Numbers.length; i++) {
			System.out.println(Numbers[i]);
			
		}
		
		System.out.println("Wow. can you tell the index for :");
		Integer aa = 0; 
		Scanner scanner = new Scanner(System.in);
		
	    aa = Integer.parseInt(scanner.nextLine());
	    scanner.close();   
	    
	    CheckIdx(Numbers, aa);
	    
	    Mens mens = new Mens("Sialex");
	    System.out.println("--------------------------");
	    System.out.println("Who are you?");
	    System.out.println("My name is " + mens.getName());
	    System.out.print("I'm a men. and ");
		mens.Walk("");
		System.out.println("and " + mens.Breath());
		
		mens.setPosition("manager");
		mens.setSalary(3600);
		
		try {
			System.out.println("I'm also an employee as " + mens.getPosition() + " with salary " + mens.getSalary());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception thrown  :" + e);
		} finally {
			System.out.println("That's my story.." );
		}
		
	}
	
	public static class Mens extends Human implements Employee
	{
		private String Name;
		private String Position;
		private Integer Salary;
		
		public Mens() {
			// TODO Auto-generated constructor stub
		}
		
		public Mens(String name) {
			this.Name = name;
		}
		
		@Override
		public void setPosition(String position) {
			// TODO Auto-generated method stub
			this.Position = position;
		}
		
		@Override
		public void setSalary(Integer salary) {
			// TODO Auto-generated method stub
			this.Salary = salary;
		}
		
		@Override
		public String getName () { return this.Name;}
		
		@Override
		public void Walk(String going ) {
			if (going != "") {
				System.out.println(this.Name + " walking faster to" + going);
			} else {
				System.out.println(this.Name + " just walking faster");
			}
			
		}

		@Override
		public String getPosition() {
			// TODO Auto-generated method stub
			return this.Position;
		}

		@Override
		public Integer getSalary() {
			// TODO Auto-generated method stub
			return this.Salary;
		}
	}
	
	public static void CheckIdx(Integer[] Numbers, Integer aa) {
		int j = 0;
	    Boolean found = false;
	    while ((j < Numbers.length) && (found == false)) {
	    	if (Numbers[j] == aa) {
	    		System.out.println("The index for " + aa + " is " + j);
	    		found = true;
	    	}
	    	j++;
	    }
	    
	}
}
