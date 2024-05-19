package retail.manager;

import retail.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customerList;

    public CustomerManager() {
        this.customerList = new ArrayList<>();
    }

    // Method untuk menambah pelanggan ke daftar pelanggan
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    // Method untuk menghapus pelanggan dari daftar pelanggan
    public void removeCustomer(Customer customer) {
        customerList.remove(customer);
    }

    // Method untuk mendapatkan semua pelanggan dari daftar pelanggan
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    // Method untuk mencari pelanggan berdasarkan nama
    public Customer findCustomerByName(String name) {
        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    // Method untuk mencari pelanggan berdasarkan ID
    public Customer findCustomerById(String id) {
        for (Customer customer : customerList) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
