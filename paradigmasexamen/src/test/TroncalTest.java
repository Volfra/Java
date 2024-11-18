package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import co.edu.poli.examen.model.Troncal;

class TroncalTest {

	Troncal x = new Troncal('i', null, 0, null);

	@Test
	void test() throws Exception {

		Method m;
		m = Troncal.class.getDeclaredMethod("factorial", int.class);
		m.setAccessible(true);

		int r = (int) m.invoke(x, 5);

		assertEquals(r, 120);

	}

}
