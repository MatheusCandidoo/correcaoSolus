package mavem;


import org.junit.Assert;
import org.junit.Before;
import arquiteturaCorrecaoSolo.mavem.App;
import org.junit.Test;

// Aplicando teste unitário sobre a função defineIdeal;

public class ElementosIdeaisTeste {	
	App app;
	
	@Before
	public void setUp() {
		app = new App();
	}
	
	// teste unitário do valor ideal do fósforo com textura 1 (argiloso)
	@Test
	public void testeFosforoTextura1() {
		double fosforoEsperado = 9.0;
		Assert.assertEquals(fosforoEsperado, app.defineIdeal(1).getFosforo(),0);
	}
	
	// teste unitário do valor ideal do fosforo com textura 2 (Textura Média)
	@Test
	public void testeFosforoTextura2() {
		double fosforoEsperado = 12.0;
		Assert.assertEquals(fosforoEsperado, app.defineIdeal(2).getFosforo(),0);
	}
	
	// teste unitário do valor ideal do potássio com textura 1 (argiloso)
	@Test
	public void testePotassioTextura1() {
		double potassioEsperado = 0.35;
		Assert.assertEquals(potassioEsperado, app.defineIdeal(1).getPotassio(),0);
	}
	
	// teste unitário do valor ideal do potássio com textura 2 (Textura Média)
	@Test
	public void testePotassioTextura2() {
		double potassioEsperado = 0.25;
		Assert.assertEquals(potassioEsperado, app.defineIdeal(2).getPotassio(),0);
	}
	
	// teste unitário do valor ideal do Cálcio com textura 1 (argiloso)
	@Test
	public void testeCalcioTextura1() {
		double calcioEsperado = 6.0;
		Assert.assertEquals(calcioEsperado, app.defineIdeal(1).getCalcio(),0);
	}
	
	// teste unitário do valor ideal do Cálcio com textura 2 (Textura Média)
	@Test
	public void testeCalcioTextura2() {
		double calcioEsperado = 4.0;
		Assert.assertEquals(calcioEsperado, app.defineIdeal(2).getCalcio(),0);
	}
	
	// teste unitário do valor ideal do Magnésio com textura 1 (argiloso)
	@Test
	public void testeMagnesioTextura1() {
		double magnesioEsperado = 1.5;
		Assert.assertEquals(magnesioEsperado, app.defineIdeal(1).getMagnesio(),0);
	}
	
	// teste unitário do valor ideal do Magnésio com textura 2 (Textura Média)
	@Test
	public void testeMagnesioTextura2() {
		double magnesioEsperado = 1.0;
		Assert.assertEquals(magnesioEsperado, app.defineIdeal(2).getMagnesio(),0);
	}
	
	// teste unitário do valor ideal do Enxofre com textura 1 (argiloso)
	@Test
	public void testeEnxofreTextura1() {
		double enxofreEsperado = 9.0;
		Assert.assertEquals(enxofreEsperado, app.defineIdeal(1).getEnxofre(),0);
	}
	
	// teste unitário do valor ideal do Enxofre com textura 2 (Textura Média)
	@Test
	public void testeEnxofreTextura2() {
		double enxofreEsperado = 6.0;
		Assert.assertEquals(enxofreEsperado, app.defineIdeal(2).getEnxofre(),0);
	}
	
	// teste unitário do valor ideal do Alumínio com textura 1 (argiloso)
	@Test
	public void testeAluminioTextura1() {
		double aluminioEsperado = 0.0;
		Assert.assertEquals(aluminioEsperado, app.defineIdeal(1).getAluminio(),0);
	}
	
	// teste unitário do valor ideal do Alumínio com textura 2 (Textura Média)
	@Test
	public void testeAluminioTextura2() {
		double aluminioEsperado = 0.0;
		Assert.assertEquals(aluminioEsperado, app.defineIdeal(2).getAluminio(),0);
	}
	
	// teste unitário do valor ideal do HAl com textura 1 (argiloso)
	@Test
	public void testeHAlTextura1() {
		double hAlEsperado = 0.0;
		Assert.assertEquals(hAlEsperado, app.defineIdeal(1).gethAl(),0);
	}
	
	// teste unitário do valor ideal do HAl com textura 2 (Textura Média)
	@Test
	public void testeHAlTextura2() {
		double hAlEsperado = 0.0;
		Assert.assertEquals(hAlEsperado, app.defineIdeal(2).gethAl(),0);
	}
}
