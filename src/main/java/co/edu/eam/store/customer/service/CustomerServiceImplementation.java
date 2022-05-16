package co.edu.eam.store.customer.service;

import co.edu.eam.store.customer.entity.City;
import co.edu.eam.store.customer.entity.Customer;
import co.edu.eam.store.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class CustomerServiceImplementation implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> listAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Customer myCustomer = customerRepository.findByIdDocument(customer.getIdDocument());
        if(myCustomer != null){
            return myCustomer;
        }
        customer.setStatus("CREATED");
        customer.setCreateAt(new Date());
        myCustomer = customerRepository.save(customer);
        return myCustomer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer myCustomer = getCustomer(customer.getId());
        if(myCustomer == null){
            return null;
        }
        myCustomer.setName(customer.getName());
        myCustomer.setLastName(customer.getLastName());
        myCustomer.setEmail(customer.getEmail());

        return customerRepository.save(myCustomer);
    }

    @Override
    public Customer deleteCustomer(Long id) {
        Customer myCustomer = getCustomer(id);
        if(myCustomer == null){
            return null;
        }
        myCustomer.setStatus("DELETED");
        return customerRepository.save(myCustomer);
    }

    @Override
    public List<Customer> findCustomerByCity(City city) {
        return customerRepository.findByCity(city);
    }
}
