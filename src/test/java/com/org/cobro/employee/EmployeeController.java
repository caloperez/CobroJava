package com.org.cobro.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.cobro.model.Employee;

@RestController
public class EmployeeController {
	
	  // Aggregate root
	  // tag::get-aggregate-root[]
	  @GetMapping("/employees")
	  List<Employee> all() {
		  List<Employee> emp = new ArrayList<>();
	    return emp;
	  }
	  // end::get-aggregate-root[]

	  @PostMapping("/employees")
	  Employee newEmployee(@RequestBody Employee newEmployee) {
		  
	    return newEmployee;
	  }
 
 

	  @DeleteMapping("/employees/{id}")
	  void deleteEmployee(@PathVariable Long id) {
	    
		  
		  
	  }

}
