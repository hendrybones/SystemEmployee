package com.example.SystemEmployee.service;

import com.example.SystemEmployee.model.Employee;
import com.example.SystemEmployee.model.Manager;
import com.example.SystemEmployee.repository.EmployeeRepo;
import com.example.SystemEmployee.repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepo managerRepo;
    public List<Manager> listAll(){
        return managerRepo.findAll();

    }

    public void save(Manager manager){
        managerRepo.save(manager);
    }

    public Manager get(Long id){
        return managerRepo.findById(id).get();
    }
    public  void delete(Long id){
        managerRepo.deleteById(id);
    }

}
