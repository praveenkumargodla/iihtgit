package Dao;

import model.Employee;

public interface EmployeeDao {
	public void showEmployees();
	public Employee getEmployee(int id);
	public void updateEmployee(Employee emp);

}
