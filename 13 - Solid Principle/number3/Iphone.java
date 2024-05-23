package number3;
public class Iphone implements MessageDevice, CallDevice, BrowsingDevice, CameraDevice{
    @Override
    public void makeCalls(String number) {
        System.out.println("IPhone is Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone Sending message to " + number + "\nMessage: " + message);
    }


    @Override
    public void browseWeb(String url) {
        System.out.println("IPhone Browsing on the " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("IPhone Took a nyelpie");
    }
}
