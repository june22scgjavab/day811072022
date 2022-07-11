
public class Department {
private int deptId;
private String deptName;
private Employee manager;
public Department(int deptId, String deptName, Employee manager) {
	super();
	this.deptId = deptId;
	this.deptName = deptName;
	this.manager = manager;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public Employee getManager() {
	return manager;
}
public void setManager(Employee manager) {
	this.manager = manager;
}

}
