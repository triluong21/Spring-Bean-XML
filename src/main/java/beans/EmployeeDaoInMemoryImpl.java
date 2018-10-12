package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao{
	// Use this code to load data from Beans.xml 	
	
	private Map<Long, Employee> employeesMap;
	
	
	// Use this code to load data from EmployeeDaoInMemoryImpl.java 
/*
	private Map<Long, Employee> employeesMap = new HashMap<Long, Employee>();
	{
		Employee employee1 = new Employee(1L, "Tri Luong", 20000);
		Employee employee2 = new Employee(2L, "John Does", 25000);
		Employee employee3 = new Employee(3L, "Jane Noah", 32000);
		Employee employee4 = new Employee(4L, "Tom Smith", 21000);
		
		
		employeesMap.put(employee1.getId(), employee1);
		employeesMap.put(employee2.getId(), employee2);
		employeesMap.put(employee3.getId(), employee3);
		employeesMap.put(employee4.getId(), employee4);
		
	}
	*/
	
	
	// Use this code to load data from Beans.xml 	
	public Map<Long, Employee> getEmployeesMap() {
		return employeesMap;
	}
	// Use this code to load data from Beans.xml 	
	public void setEmployeesMap(Map<Long, Employee> employeesMap) {
		this.employeesMap = employeesMap;
	}

	public void insert(Employee employee) {
		employeesMap.put(employee.getId(), employee);
	}
	
	public void update(Employee employee) {
		employeesMap.put(employee.getId(), employee);
	}

	public void update(List<Employee> employees) {
		for(Employee employee: employees) {
			update(employee);
		}
	}
	
	public void delete(long employeeId) {
		employeesMap.remove(employeeId);
	}
	
	public Employee find(long employeeId) {
		return employeesMap.get(employeeId);
	}
	
	public List<Employee> find(List<Long> employeeIds){
		List<Employee> employees = new ArrayList<Employee>();
		for(Long id: employeeIds) {
			employees.add(employeesMap.get(id));
		}
		return employees;
	}
	
	public List<Employee> find(String employeeName){
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(employeeName.equals(employee.getEmployeeName())) {
				employees.add(employee);
			}
		}
		 
		return employees;
	}
	
	public List<Employee> find(boolean locked){
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values()) {
			if(locked == (employee.isLocked())) {
				employees.add(employee);
			}
		}
		
		return employees;
	}


}
