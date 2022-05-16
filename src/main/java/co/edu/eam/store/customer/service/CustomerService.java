package co.edu.eam.store.customer.service;

import co.edu.eam.store.customer.entity.City;
import co.edu.eam.store.customer.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> listAllCustomers();
    public Customer getCustomer(Long id);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Long id);
    public List<Customer> findCustomerByCity(City city);
}
