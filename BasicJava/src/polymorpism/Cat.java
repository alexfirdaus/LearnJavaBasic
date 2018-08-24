package polymorpism;

public class Cat extends Animals {
	@Override
    public void sound(){
        System.out.println("Meow");
    }
	@Override
    public void eat(){
        System.out.println("Omnivor");
    }
	
}
