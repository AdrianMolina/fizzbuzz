package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class fizzbuzztdd {

	@Test
	public void retornarUnNumero(){
		Fizzbuzz fb = new Fizzbuzz();
		assertEquals("1",fb.fizzbuzz(1));
	}

}
