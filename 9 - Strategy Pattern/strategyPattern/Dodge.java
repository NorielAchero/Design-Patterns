package strategyPattern;

public class Dodge implements DefenseStategy{
    @Override
    public String defend(){
        return "dodgin to avoid attack!";
    }
}
