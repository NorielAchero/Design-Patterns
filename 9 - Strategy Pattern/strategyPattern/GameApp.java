package strategyPattern;

public class GameApp {

    public static void main(String[] args) {
        Character knight = new Character(new Knight());
        Character wizard = new Character(new Wizard());
        Character archer = new Character(new Archer());
        
        knight.attack();
        System.out.println();
        knight.defend();
        System.out.println();
        wizard.attack();
        System.out.println();
        wizard.defend();
        System.out.println();
        archer.attack();
        System.out.println();
        archer.defend();

    }
   

}
