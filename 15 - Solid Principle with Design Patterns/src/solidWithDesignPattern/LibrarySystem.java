package solidWithDesignPattern;

public class LibrarySystem {
    public static void main(String[] args) {
        Student noriel = new Student("Noriel");
        Student achero = new Student("Achero");

        Book book1 = new Book("SkulBOOKul");
        Journal journal1 = new Journal("Ajourn");
        Journal journal2 = new Journal("Michael Journal");
        Thesis thesis1 = new Thesis("The Effectiveness of the Attendance Form for Classes 2024");

        ResourceBorrow resourceBorrow = new ResourceBorrowSystem();

        resourceBorrow.borrowResource(noriel.getName(), book1);
        resourceBorrow.borrowResource(noriel.getName(), journal1);

        resourceBorrow.borrowResource(noriel.getName(), journal2);

        resourceBorrow.borrowResource(achero.getName(), thesis1);



    }
}
