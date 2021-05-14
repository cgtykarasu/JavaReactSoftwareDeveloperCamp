package day04interfaces;

/**
 * @author Çağatay KARASU
 * @since 05.2021
 **/

public class Main {

    public static void main(String[] args) {

        Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};

//      CustomerManager customerManager = new CustomerManager(new EmailLogger());

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer engin = new Customer(1,"Engin","Demiroğ");

        customerManager.add(engin);
    }
}
