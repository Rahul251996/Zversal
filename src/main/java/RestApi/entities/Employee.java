package RestApi.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee
{
	private long ID;
	private String name;
	private String company;
	
	
	public Employee() {
		super();
	}

	public Employee(long iD, String name, String company)
	{
		super();
		ID = iD;
		this.name = name;
		this.company = company;
	}


	public long getID() {
		return ID;
	}


	public void setID(long iD) {
		ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", company=" + company + "]";
	}
}
