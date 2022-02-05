package com.example.SystemEmployee.controller;

import com.example.SystemEmployee.model.Employee;
import com.example.SystemEmployee.model.Manager;
import com.example.SystemEmployee.service.EmployeeService;
import com.example.SystemEmployee.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ManagerController {
//    @Autowired
//    private ManagerService managerService;
//
//    @GetMapping("/")
//    public String viewAdminPage(Model model){
//        List<Manager> listManager=managerService.listAll();
//        model.addAttribute("listManager",listManager);
//        System.out.print("Get/ ");
//        return "index";
//    }
//    @GetMapping("new")
//    public String add(Model model){
//        model.addAttribute("Manager", new Manager());
//        return "newManager";
//    }
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String saveManager(@ModelAttribute("manager") Manager manager){
//        managerService.save(manager);
//        return "redirect/";
//    }
//    @RequestMapping("/edit/{id}")
//    public ModelAndView showEditAminPage(@PathVariable(name="id") Long id){
//        ModelAndView mav=new ModelAndView("new");
//        Manager manager=managerService.get(id);
//        return mav;
//    }
}
