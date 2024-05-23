package solidPrincipleAssignment;

public class Main {
    public static void main(String[] args) {
        OrderCalculator orderCalculator = new OrderCalculator();
        OrderPlacer orderPlacer = new OrderPlacer();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        EmailSender emailSender = new EmailSender();

        Order orderProcessor = new OrderProcessor(orderCalculator, orderPlacer, invoiceGenerator, emailSender);

        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setPrice(10.0);
        orderInfo.setQuantity(2);
        orderInfo.setCustomerName("Noriel Achero");
        orderInfo.setAddress("Sa bahay namin");
        orderInfo.setInvoiceFileName("test.jpg");
        orderInfo.setEmail("noriel.achero.com");

        orderProcessor.processOrder(orderInfo);
    }
}
