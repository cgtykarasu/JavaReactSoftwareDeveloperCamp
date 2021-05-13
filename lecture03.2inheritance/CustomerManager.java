package day03_2inheritance;

public class CustomerManager {
    public void add(Customer customer) {
        System.out.println(customer.getCustomerNumber() + " kaydedildi.");
    }

    //bulk insert
    public void addMultiple(Customer[] customers) {
        for (Customer customer : customers) {
            this.add(customer);
        }
    }

}
