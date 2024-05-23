package solidWithDesignPattern;

public class Thesis implements Resource{
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "thesis";
    }

    @Override
    public String getTitle() {
        return title;
    }
}
