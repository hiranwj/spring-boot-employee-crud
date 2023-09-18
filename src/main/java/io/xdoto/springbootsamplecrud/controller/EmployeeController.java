package io.xdoto.springbootsamplecrud.controller;

import io.xdoto.springbootsamplecrud.dto.Employee;
import io.xdoto.springbootsamplecrud.dto.ResponseStructure;
import io.xdoto.springbootsamplecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ResponseStructure<Employee> saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee/{id}")
    public ResponseStructure<Employee> getStudentById(@PathVariable int id) {
        return employeeService.getStudentById(id);
    }

    @GetMapping("/employee")
    public ResponseStructure<List<Employee>>getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    @PutMapping("/employee/{id}")
    public ResponseStructure<Employee> updateStudent(@RequestBody Employee employee, @PathVariable Integer id) {
        return employeeService.updateEmployee(employee, id);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseStructure<String> deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }

}
