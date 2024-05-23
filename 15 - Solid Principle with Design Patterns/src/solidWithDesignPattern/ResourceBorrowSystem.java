package solidWithDesignPattern;

public class ResourceBorrowSystem implements ResourceBorrow{
    @Override
    public void borrowResource(String name, Resource resource){
        System.out.println(name + " is borrowing a " + resource.getResourceType() + " titled '" + resource.getTitle() + ".'" );
    }
}
