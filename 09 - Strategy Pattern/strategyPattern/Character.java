package strategyPattern;

public class Character {
    private CharacterType type;

    public Character(CharacterType type) {
        this.type = type;
    }

    public void attack(){
        type.attack();
    }

    public void defend(){
        type.defend();
    }
}

