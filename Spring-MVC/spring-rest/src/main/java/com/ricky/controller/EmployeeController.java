package com.ricky.controller;

import com.ricky.dao.EmployeeDao;
import com.ricky.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee")
    public ModelAndView getAllEmployees() {
        ModelAndView mv = new ModelAndView();
        Collection<Employee> employeeList = employeeDao.getAll();
        mv.addObject("employeeList", employeeList);
        mv.setViewName("employee_list");
        return mv;

    }

    /*@DeleteMapping("/employee/{id}")
    public String deleteById(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }*/

    @DeleteMapping("/employee/{id}")
    public ModelAndView deleteById(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/employee");
        return modelAndView;
    }

    @PostMapping("/employee")
    public String add(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String getById(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public ModelAndView update(Employee employee) {
        employeeDao.save(employee);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/employee");
        return modelAndView;
    }


}
