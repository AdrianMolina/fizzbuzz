package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzbuzztdd {

	@Test
	public void retornarUnNumero(){
		Fizzbuzz fb = new Fizzbuzz();
		assertEquals("1",fb.fizzbuzz(1));
	}
	
	@Test
	public void retornarFizzCuandoNumeroSeaMultiploDeTres(){
		Fizzbuzz fb = new Fizzbuzz();
		assertEquals("Fizz",fb.fizzbuzz(3));
	}
	
	@Test
	public void retornarBuzzCuandoNumeroSeaMultiploDeCinco(){
		Fizzbuzz fb = new Fizzbuzz();
		assertEquals("Buzz",fb.fizzbuzz(5));
	}
	
	@Test
	public void retornarFizzBuzzCuandoNumeroSeaMultiploDeTresyCinco(){
		Fizzbuzz fb = new Fizzbuzz();
		assertEquals("FizzBuzz",fb.fizzbuzz(15));
	}

}
