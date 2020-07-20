package task2;

public class Application {
	
   public static void main(String[] args) {
		
		MyCalculator calc = new MyCalculator();
		calc.a = 1;
		calc.b = 2;
		
		MyCalculator.viewCalcResult(calc.plus());
		MyCalculator.viewCalcResult(calc.minus());
		MyCalculator.viewCalcResult(calc.multiply());
		MyCalculator.viewCalcResult(calc.devide());

		System.out.println();
		
		MyCalculator calc2 = new MyCalculator(1.11, 2.22);
		
		MyCalculator.viewCalcResult(calc2.plus());
		MyCalculator.viewCalcResult(calc2.minus());
		MyCalculator.viewCalcResult(calc2.multiply());
		MyCalculator.viewCalcResult(calc2.devide());
		
	}
	
}
