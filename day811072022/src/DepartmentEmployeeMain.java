
public class DepartmentEmployeeMain {
public static void main(String[] args) {
	Employee employee=new Employee(1,"Ram","A/122 Delhi");
	Department dept=new Department(111,"HR",employee);
	System.out.println(dept.getDeptId()); //111
	System.out.println(dept.getDeptName()); ///HR
	System.out.println(dept.getManager()); // //Employee@cac736f
	Employee manager=dept.getManager();
	System.out.println(manager.getId());
	System.out.println(manager.getName());
	System.out.println(manager.getAddress());
	
	employee.setId(2);
	employee.setName("Suresh");
	System.out.println(dept.getManager().getId());
	System.out.println(dept.getManager().getName());
	
	
}
}
