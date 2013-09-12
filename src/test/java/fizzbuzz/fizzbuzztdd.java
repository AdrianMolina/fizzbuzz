package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzbuzztdd {
	
	Fizzbuzz fb = new Fizzbuzz();

	@Test
	public void retornarUnNumero(){
		assertEquals("1",fb.fizzbuzz(1));
	}
	
	@Test
	public void retornarFizzCuandoNumeroSeaMultiploDeTres(){
		assertEquals("Fizz",fb.fizzbuzz(3));
	}
	
	@Test
	public void retornarBuzzCuandoNumeroSeaMultiploDeCinco(){
		assertEquals("Buzz",fb.fizzbuzz(5));
	}
	
	@Test
	public void retornarFizzBuzzCuandoNumeroSeaMultiploDeTresyCinco(){
		assertEquals("FizzBuzz",fb.fizzbuzz(15));
	}

}
