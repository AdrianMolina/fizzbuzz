package fizzbuzz;

public class Fizzbuzz {
	
	public String fizzbuzz(int numero){
		
		if (numero % 3 == 0 && numero % 5 == 0){
			return "FizzBuzz";
		}
		if (numero % 3 == 0){
			return "Fizz";
		}
		if (numero % 5 == 0){
			return "Buzz";
		}
			return String.valueOf(numero);
	}
}
