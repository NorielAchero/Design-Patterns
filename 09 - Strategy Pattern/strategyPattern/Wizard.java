package strategyPattern;

public class Wizard implements CharacterType{
    
    @Override
    public void attack(){
        CastSpell castSpell = new CastSpell();
        System.out.println("Wizard " + castSpell.attack());
    }

    @Override
    public void  defend(){
        Barrier barrier = new Barrier();
        System.out.println("Wizard " +  barrier.defend());
    }
}
    

