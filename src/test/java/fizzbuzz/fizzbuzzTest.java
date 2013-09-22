package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzbuzzTest {
	
	Fizzbuzz fb = new Fizzbuzz();

	@Test
	public void retornarUnNumero(){
		assertEquals("1",fb.fizzbuzz(1));
	}
	
	@Test
	public void generarFizzCuandoNumeroSeaMultiploDeTres(){
		assertEquals("Fizz",fb.fizzbuzz(3));
	}
	
	@Test
	public void generarrBuzzCuandoNumeroSeaMultiploDeCinco(){
		assertEquals("Buzz",fb.fizzbuzz(5));
	}
	
	@Test
	public void generarFizzBuzzCuandoNumeroSeaMultiploDeTresyCinco(){
		assertEquals("FizzBuzz",fb.fizzbuzz(15));
	}
	
	@Test
	public void imprimeUnaSecuenciaDeNumerosConReglasFizzBuzz(){
		String esperado = "1\n"+
						  "2\n"+
						  "Fizz\n"+
						  "4\n"+
						  "Buzz\n"+
						  "Fizz\n";
		assertEquals(esperado, fb.imprimir(6));
	}

}
