package fizzbuzz;

public class main {

	public static void main(String[] args) {
		Fizzbuzz fb = new Fizzbuzz();
		
		for(int i = 1; i <= 30; i++){
			System.out.println(fb.fizzbuzz(i));
		}

	}

}
