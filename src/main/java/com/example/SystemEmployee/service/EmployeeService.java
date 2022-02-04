package com.example.SystemEmployee.service;

import com.example.SystemEmployee.model.Employee;
import com.example.SystemEmployee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public List<Employee> listAll(){
        return employeeRepo.findAll();

    }

    public void save(Employee employee){
        employeeRepo.save(employee);
    }

    public Employee get(Long id){
        return employeeRepo.findById(id).get();
    }
    public  void delete(Long id){
        employeeRepo.deleteById(id);
    }

}
