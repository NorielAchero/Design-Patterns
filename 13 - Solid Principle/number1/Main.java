package number1;

public class Main {
    public static void main(String[] args){
        Pet cat = new Pet("Mowming", "Noriel");
        PetEat petEat = new PetEat();
        PetSound petSound=  new PetSound();

        petEat.eat(cat, "Fish");
        petSound.makeSound(cat, "Meow");

    }
}
