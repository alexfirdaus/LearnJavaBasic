package polymorpism;

public class Horse extends Animals{
	@Override
    public void sound(){
        System.out.println("Neigh");
    }
	@Override
    public void eat(){
        System.out.println("Herbivore");
    }
	
}
