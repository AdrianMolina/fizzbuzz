package fizzbuzz;

public class Fizzbuzz {
	
	public String fizzbuzz(int numero){
		
		if (esMultiploDeTres(numero) && esMultiploDeCinco(numero)){
			return "FizzBuzz";
		}
		if (esMultiploDeTres(numero)){
			return "Fizz";
		}
		if (esMultiploDeCinco(numero)){
			return "Buzz";
		}
			return String.valueOf(numero);
	}
	
	private boolean esMultiploDeTres(int numero){
		boolean resp = false;
		if (numero % 3 == 0){
			resp = true;
		}
			return resp;
	}
	
	private boolean esMultiploDeCinco(int numero){
		boolean resp = false;
		if (numero % 5 == 0){
			resp = true;
		}
			return resp;
	}
}
