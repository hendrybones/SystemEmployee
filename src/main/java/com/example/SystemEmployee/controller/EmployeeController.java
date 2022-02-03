package com.example.SystemEmployee.controller;

import com.example.SystemEmployee.model.Employee;
import com.example.SystemEmployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public String viewHomePage(Model model){
        List<Employee> listEmployee=employeeService.listAll();
        model.addAttribute("listEmployee",listEmployee);
        System.out.print("Get/{id}");
        return "index";
    }
    @GetMapping("new{id}")
    public String add(Model model){
        model.addAttribute("Employee", new Employee());
        return "new";
    }
    @RequestMapping(value = "/save{id}", method = RequestMethod.POST)
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect/";
    }
    @RequestMapping("/edit{id}")
    public ModelAndView showEditEmployeePage(@PathVariable(name = "id") Long id){
        ModelAndView mav=new ModelAndView("new");
        Employee employee=employeeService.get(id);
        return mav;
    }
//    @RequestMapping("delete/{id}")
//    public String deleteStudent(@PathVariable(name = "id") Long id){
//    }




}
