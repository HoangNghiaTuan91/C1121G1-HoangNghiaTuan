package Services;

import Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static List<Customer> getListCustomer() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Choi \"Zeus\" Woo-je", "2004/01/31", "Korea", "zeus.png"));
        customerList.add(new Customer("Moon \"Oner\" Hyeon-joon", "2002/12/24", "Korea", "oner.png"));
        customerList.add(new Customer("Lee \"Faker\" Sang-hyeok ", "1996/05/07", "Korea", "faker.png"));
        customerList.add(new Customer("Lee \"Gumayusi\" Min-hyeong ", "2002/02/06", "Korea", "guma.png"));
        customerList.add(new Customer("Ryu \"Keria\" Min-seok", "2004/10/14", "Korea", "keria.png"));
        return customerList;
    }
}
