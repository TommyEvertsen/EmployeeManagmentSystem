package net.javaguides.ems_backend.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.ems_backend.dto.EmployeeDto;
import net.javaguides.ems_backend.entity.Employee;
import net.javaguides.ems_backend.mapper.EmployeeMapper;
import net.javaguides.ems_backend.respository.EmployeeRespository;
import net.javaguides.ems_backend.service.EmpolyeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceimpl implements EmpolyeeService {

    private EmployeeRespository employeeRespository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
      Employee savedEmployee =  employeeRespository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(employee);
    }

}
