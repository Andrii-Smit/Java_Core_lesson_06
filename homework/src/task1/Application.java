package task1;

public class Application {
	
	public static void main(String[] args) {
		
		FixedSalaryWorker fsw = new FixedSalaryWorker(" Mary ", 1000); 
		HourlyWageWorker hww = new HourlyWageWorker(" Linda ", 120, 19.15);
		
		fsw.salary();
		hww.salary();
	}
}