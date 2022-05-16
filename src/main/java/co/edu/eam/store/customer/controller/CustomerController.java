package co.edu.eam.store.customer.controller;

import co.edu.eam.store.customer.entity.City;
import co.edu.eam.store.customer.entity.Customer;
import co.edu.eam.store.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> listar(@RequestParam(name = "cityId", required = false) Long cityId){
        List<Customer> customers;

        if(cityId == null){
            customers = customerService.listAllCustomers();
            if(customers.isEmpty()){
                return ResponseEntity.noContent().build();
            }
        } else {
            City city = new City();
            city.setId(cityId);
            customers = customerService.findCustomerByCity(city);
            if(customers.isEmpty()){
                return ResponseEntity.noContent().build();
            }
        }

        return ResponseEntity.ok(customers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> obtener(@PathVariable("id") Long id){
        Customer customer = customerService.getCustomer(id);
        if(customer == null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(customer);
    }

}
