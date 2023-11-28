package com.springrest.springrest.repository;

import com.springrest.springrest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    //crud db methods to interact with db

}
