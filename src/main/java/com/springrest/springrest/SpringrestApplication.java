package com.springrest.springrest;

import com.springrest.springrest.model.Employee;
import com.springrest.springrest.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringrestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}
	@Autowired
	private EmployeeRepo EmployeeRepo;

	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstname("Ramesh");
		employee.setLastname("suzuki");
		employee.setEmailId("ramesh@gmail.com");
		EmployeeRepo.save(employee);

		Employee Employee1 =new Employee();
		Employee1.setFirstname("seema");
		Employee1.setLastname("sharma");
		Employee1.setEmailId("seema@gmail.com");
		EmployeeRepo.save(Employee1);


	}
}
