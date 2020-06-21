package RestApi.Services;

import java.util.List;

import RestApi.entities.Employee;

public interface ServiceProvider {

	public List<Employee> getEmp();

	public Employee getSingleEmp(Long empId);

	public Employee addEmp(Employee emp);

	public Employee update(Employee emp);

	//public Employee delete(Long empId);
    


}
