package polinomioComplejidadTest;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import polinomioComplejidad.Polinomio;

public class probandoPolinomios {

	Polinomio pol;
	
	@Before
	public void setUp () {
		double [ ] coeficientes = new double [] {3.0,2.0,0.0};
		pol = new Polinomio (2,coeficientes);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaPow() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarPow(1));
		System.out.println(System.currentTimeMillis());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaMsucesivas() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarMsucesivas(1));
		System.out.println(System.currentTimeMillis());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaHorner() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarHorner(1));
		System.out.println(System.currentTimeMillis());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaRecursiva() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarRecursiva(1));
		System.out.println(System.currentTimeMillis());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaRecursivaPar() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarRecursivaPar(1));
		System.out.println(System.currentTimeMillis());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaRecursivaParImpar() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarRecursivaParImpar(1));
		System.out.println(System.currentTimeMillis());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluapotenciaConRecursion() {
		System.out.println(System.currentTimeMillis());
//		Assert.assertEquals(5.0, pol.potenciaConRecursion(1));
		System.out.println(System.currentTimeMillis());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluapotenciaConRecursionPar() {
		System.out.println(System.currentTimeMillis());
//		Assert.assertEquals(5.0, pol.potenciaConRecursion(1));
		System.out.println(System.currentTimeMillis());
	}	

	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaProgDinamica() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarProgDinamica(1));
		System.out.println(System.currentTimeMillis());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void queEvaluaMejorada() {
		System.out.println(System.currentTimeMillis());
		Assert.assertEquals(5.0, pol.evaluarMejorada(1));
		System.out.println(System.currentTimeMillis());
	}
	
}
