package fizzbuzz;

public class Fizzbuzz {
	
	public String fizzbuzz(int numero){
		if (numero % 3 == 0){
			return "Fizz";
		}
		else{
			return String.valueOf(numero);
		}
	}

}
