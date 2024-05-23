package strategyPattern;

public class Archer implements CharacterType{
    
    @Override
    public void attack(){
        ShootArrow shootArrow = new ShootArrow();
        System.out.println("Archer " + shootArrow.attack());
    }

    @Override
    public void  defend(){
        Shield shield = new Shield();
        System.out.println("Archer " + shield.defend());
    }
} 
    

