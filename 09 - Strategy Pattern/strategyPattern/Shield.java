package strategyPattern;

public class Shield implements DefenseStategy{
    @Override
    public String defend(){
        return "using a shield to defend!";
    }
}
