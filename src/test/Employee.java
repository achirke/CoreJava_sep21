package test;

public class Employee extends Person{

	protected int EmpID;
	public int Salary;
	private int empID;
	private int salary;
    static String department = "Technology";
	
	public Employee() {
		
		super();
		
		System.out.println("Inside Emp Cons");
	}

	public Employee(int i, int j) {
		this();
		
        this.EmpID = empID;
        this.Salary = salary;
	}
	
	public Employee(String name, int age, String city, int empID, int salary) {
		
		super(name, age, city);
		
		this.EmpID = empID;
		this.Salary = salary;
	}

	
	

	public void display() {
		
		System.out.println("Emp Id is " + EmpID);
		System.out.println("Salary is " + Salary);
		System.out.println("Dep is " + Employee.department);
	}

}
