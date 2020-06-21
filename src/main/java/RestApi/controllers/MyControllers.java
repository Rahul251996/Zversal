package RestApi.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestApi.Services.ServiceProvider;
import RestApi.entities.Employee;

@RestController
@RequestMapping("/home")
public class MyControllers
{
	
	// object of the Service InterFace
	@Autowired
	ServiceProvider service;
	
	// getting the home page for Employyee api
	@RequestMapping
	public String home()
	{
		return "this is a homePage for employee Api";
	}
	
	@RequestMapping(value = "/abc",headers= {"content-type=application/json"},consumes = {"application/json"} )
	public String home2()
	{
		return "this is method of the headers";
	}
	
	
	
	// getting the list of s employee
	
	@GetMapping("/emp" )
      public List<Employee> getEmp()
      {
		return this.service.getEmp();
    	  
      }
	
	// getting the single employee
	
	@GetMapping("/emp1/{empId}")
	public Employee getSingleEmp(@PathVariable String empId) 
	{
		 return this.service.getSingleEmp(Long.parseLong(empId));
	}
	
	// adding the employee in the list of employee
	
	@PostMapping("/emp")
	public Employee addEmp(@RequestBody Employee emp)
	{
			return this.service.addEmp(emp);
	}
	  
	@PutMapping("/emp")
    public Employee update(@RequestBody Employee emp)
    {
    	return this.service.update(emp);
    }
	
/*	@DeleteMapping("/emp/{empId}")
	public Employee delete(@RequestBody String empId)
	{
		return this.service.delete(Long.parseLong(empId));
	}
	*/
}
