package number3;

public class User{

    public static void main (String[] args){
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        System.out.println("Basic Phone:");
        basicPhone.makeCalls("099999999");
        basicPhone.sendSMS("099999999", "Kumusta diyan sa Dubai?");
        
        System.out.println();

        System.out.println("Samsung:");
        samsung.makeCalls("099999999");
        samsung.sendSMS("099999999", "Kumusta diyan sa Dubai?");
        samsung.browseWeb("fb.com");
        samsung.takePicture();

        System.out.println();

        System.out.println("Iphone:");
        iphone.makeCalls("099999999");
        iphone.sendSMS("099999999", "Kumusta diyan sa Dubai?");
        iphone.browseWeb("fb.com");
        iphone.takePicture();
    
    }
}