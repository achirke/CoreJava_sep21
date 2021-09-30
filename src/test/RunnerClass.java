package test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		
		emp1.EmpID = 4567;
		emp1.Salary = 5000;
		emp1.display();
		
		Employee emp2 = new Employee(3214,4000);
		emp2.display();
		

		
		Employee emp3 = new Employee("Raj",40,"Hyd",3214,4000);
		
		emp3.display();
		
		PolymorphismExample obj1 = new PolymorphismExample();
		
		obj1.add(12, 18);
		obj1.add(5, 5,7);
		obj1.add(12.3, 34.6);
		
		Account objAccount = new Account();
		
		objAccount.setBalance(3000);
		
		System.out.println(objAccount.getBalance);
		

	}

}
