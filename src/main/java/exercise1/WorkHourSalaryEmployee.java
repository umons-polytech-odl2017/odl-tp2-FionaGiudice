package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private String name;
	private int hourRate;
	private static int hours=0;

	public WorkHourSalaryEmployee(String name, int hourRate) {
		this.name = name;
		this.hourRate = hourRate;
		hours=0;
	}


	public int computeSalary(){
		return (hourRate*hours);
	}

	public void workOneHour(){
		hours++;
	}

	public void sell(){}

	public String getName(){return name;}
}

