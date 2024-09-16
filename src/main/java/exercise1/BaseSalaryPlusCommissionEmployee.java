package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private String name;
	private int baseSalary;
	private int commission;
	private static int sales=0;

	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		this.name=name;
		this.baseSalary=baseSalary;
		this.commission=commission;
		sales=0;
	}

	public int computeSalary(){
		return baseSalary + (sales*commission);
	}

	public void workOneHour(){}

	public void sell(){
		sales++;
	}

	public String getName(){return name;}
}


