package net.javaguides.ems_backend.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.ems_backend.entity.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Long>{

}
