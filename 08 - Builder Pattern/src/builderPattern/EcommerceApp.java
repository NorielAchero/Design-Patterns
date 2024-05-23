package builderPattern;

public class EcommerceApp {

    public static void main (String[]args){

        User Noriel = new User.UserBuilder()
                .firstName("Noriel")
                .lastName("Achero")
                .phone("099999999")
                .address("Quezon City")
                .email("noriel.achero@neu.edu.ph")
                .age(20)
                .build();

        User Angelo = new User.UserBuilder()
                .email("angelo.mallari@neu.edu.ph")
                .age(5)
                .phone("099999999")
                .firstName("Angelo")
                .lastName("Mallari")
                .address("Quezon City")
                .build();


        System.out.println("User's Information");
        System.out.println();
        System.out.println("First Name: " + Noriel.firstName);
        System.out.println("Last Name: " + Noriel.lastName);
        System.out.println("Email: " + Noriel.email);
        System.out.println("Address: " + Noriel.address);
        System.out.println("Phone: " + Noriel.phone);
        System.out.println("Age: " + Noriel.age);

        System.out.println();

        System.out.println("User's Information");
        System.out.println();
        System.out.println("First Name: " + Angelo.firstName);
        System.out.println("Last Name: " + Angelo.lastName);
        System.out.println("Email: " + Angelo.email);
        System.out.println("Address: " + Angelo.address);
        System.out.println("Phone: " + Angelo.phone);
        System.out.println("Age: " + Angelo.age);
    }
}
