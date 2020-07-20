package task1;

public class FixedSalaryWorker extends Worker implements Salary {

	private double monthRate;
	
	public FixedSalaryWorker(String name, double monthRate) {
		super(name);
		this.monthRate = monthRate;
	}


	@Override
	public void salary() {
		double salary = this.monthRate;
		System.out.println(" Employee salary " + super.getName() + " = " + salary + " USD ");		
	}

}
