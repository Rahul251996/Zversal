package RestApi.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import RestApi.entities.Employee;

@Service
public class ServiceProviderImpl implements ServiceProvider {
	ArrayList<Employee> list;

	public ServiceProviderImpl() {
		list = new ArrayList<Employee>();
		list.add(new Employee(10, "Rahul", "Zversal"));
		list.add(new Employee(11, "Rishabh", "SmartData"));
		list.add(new Employee(12, "Rakesh", "TUV"));
		list.add(new Employee(13, "Bhatiya", "Teleperformance"));

	}

	@Override
	public List<Employee> getEmp() {
		return list;
	}

	@Override
	public Employee getSingleEmp(Long empId) 
	{
		Employee employ = null;

		for (Employee e : list)
		{
			if (e.getID() == empId)
			{
				employ = e;
				break;
			}
		}

		return employ;
	}

	@Override
	public Employee addEmp(Employee emp) {
		this.list.add(emp);

		return emp;
	}

	@Override
	public Employee update(Employee emp) 
	{
		 for(Employee e:list)
		 {
			 if(e.getID()==emp.getID())
			 {
				 e.setName(emp.getName());
				 e.setCompany(emp.getCompany());
				 
			 }
		 }
		
		return emp;
	}

	/*
	@Override
	public Employee delete(Long empId)
	{
		List<Employee> list2=new ArrayList<Employee>();
		
		for(Employee e:list)
		{
			if(e.getID()==empId)
			{
				
			}
		}
		
		return null;
	}*/

}
