package io.xdoto.springbootsamplecrud.repository;

import io.xdoto.springbootsamplecrud.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
