package strategyPattern;

public class Knight implements CharacterType{
    
    @Override
    public void attack(){
        SwingSword swingSword = new SwingSword();
        System.out.println("Knight " + swingSword.attack());
    }

    @Override
    public void defend(){
        Shield shield = new Shield();
        Dodge dodge = new Dodge();
        Barrier barrier = new Barrier();
        System.out.println("Knight " + shield.defend());
        System.out.println("Knight " + dodge.defend());
        System.out.println("Knight " + barrier.defend());

    }
}
