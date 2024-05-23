package number3;

public class BasicPhone implements MessageDevice, CallDevice{

    @Override
    public void makeCalls(String number) {
        System.out.println("Basic Phone is Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending message to " + number + "\nMessage: " + message);
    }
}
