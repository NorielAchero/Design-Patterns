package solidWithDesignPattern;

public class Journal implements Resource{
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "journal";
    }

    @Override
    public String getTitle() {
        return title;
    }
}
