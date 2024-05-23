package number2;

public class Main {
    public static void main(String[] args) {
        Customer student = new Customer("Noriel", "Student", 500.00);
        Customer senior = new Customer("Cesar", "Senior Citizen", 500.00);
        Customer regular = new Customer("Ronan", "Regular", 500.00);
    
        System.out.println("Student Discounted Price is " + student.applyDiscount(student.getAmount()));
        System.out.println("Senior Discounted Price is " + senior.applyDiscount(senior.getAmount()));
        System.out.println("Regular Discounted Price is " + regular.applyDiscount(regular.getAmount()));
    }



}
