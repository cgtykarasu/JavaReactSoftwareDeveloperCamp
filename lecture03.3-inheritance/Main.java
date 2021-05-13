package day03_3inheritance;

/**
 * @author Çağatay KARASU
 * @since 04.2021
 **/

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new EmailLogger());
        customerManager.add(new DatabaseLogger());
    }

}
