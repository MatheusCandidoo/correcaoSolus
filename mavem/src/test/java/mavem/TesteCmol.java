package mavem;

import static org.junit.Assert.*;

import org.junit.Before;

import arquiteturaCorrecaoSolo.mavem.*;
import junit.framework.Assert;

import org.junit.Test;

// Implementando teste de unidade dos campos SCmol, CTCMol e V% Atual

public class TesteCmol {

	Elemento elementoAtual;
	App app;
	
	@Before
	public void setUp() {
		elementoAtual = new Elemento();
		elementoAtual.setFosforo(8.59);
		elementoAtual.setPotassio(0.15);
		elementoAtual.setCalcio(5.76);
		elementoAtual.setMagnesio(1.63);
		elementoAtual.setEnxofre(3.67);
		elementoAtual.setAluminio(0.0);
		elementoAtual.sethAl(5.35);
		
		app = new App();
		
	}
	
	// Teste Unitário de CSmol
	@Test
	public void testeCSmol() {
		double valorEsperado = 7.54;
		
		Assert.assertEquals(valorEsperado, app.calculaSCmol(elementoAtual),0);
	}

	// Teste Unitário de CTCMol
	@Test
	public void testeCTCMol() {
		double valorEsperado = 12.89;
		
		Assert.assertEquals(valorEsperado, app.calculaCTCCmol(elementoAtual),0);
	}
	
	// Teste Unitário de V% Atual
	public void testeVAtual() {
		double valorEsperado = 58.49;
		Assert.assertEquals(valorEsperado, app.calculaVAtual(elementoAtual));
	}
}
