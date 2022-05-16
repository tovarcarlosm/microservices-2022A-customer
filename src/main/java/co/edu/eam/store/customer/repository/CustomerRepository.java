package co.edu.eam.store.customer.repository;

import co.edu.eam.store.customer.entity.City;
import co.edu.eam.store.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Customer findByIdDocument(String idDocument);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByCity(City city);
}
