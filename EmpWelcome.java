package oopsamples;

public class EmpWelcome {

	public static void main(String[] args) {
		System.out.println("Welcome to the Employee Wage Computation");
		
		Main jioCompany = new Main(10, 20, 30, "Jio");
		jioCompany.calcEmpWageFor();
		
		Main tataCompany = new Main(20, 40, 50, "Tata");
		tataCompany.calcEmpWageFor();

	}
}		
