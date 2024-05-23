package solidWithDesignPattern;

public class Book implements Resource{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "book";
    }

    @Override
    public String getTitle() {
        return title;
    }
}
