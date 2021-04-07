package mavem;

import arquiteturaCorrecaoSolo.mavem.CorrecaoPotassio;
import arquiteturaCorrecaoSolo.mavem.EnumPotassio;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author candido
 */
public class TesteCorrecaoPotassio {
    
    @Test
    public void testeNecessidadeAdicionarPotassio() {
        assertEquals(0.225, new CorrecaoPotassio().necessidadeAdicionarPotassio(0.15, 3.0, 1.2), 0.0);
    }

    @Test
    public void testeTransformarCmolEmMg() {
        assertEquals(93.84, new CorrecaoPotassio().transformarCmolEmMg(0.24), 0.0);
    }
    
    @Test
    public void testeTransformarMgEmKgHa(){
        assertEquals(187.68, new CorrecaoPotassio().transformarMgEmKgHa(93.84) , 0.0);
    }
    
    @Test
    public void testeTransformarKgEmK2O(){
        assertEquals(225.216, new CorrecaoPotassio().transformarKgEmK2O(187.68),0.0);
    }

    @Test
    public void testeCalculaKgPorHaDeK2OComEficienciaDoPotassio(){
        assertEquals(264.96, new CorrecaoPotassio().calculaKgPorHaDeK2OComEficienciaDoPotassio(225.216, 85) ,0.1);
    }
    
    @Test
    public void testeQuantidadePotassioAplicar(){
        assertEquals(456.82, new CorrecaoPotassio().quantidadePotassioAplicar(264.96, EnumPotassio.CLORETO_DE_POTASSIO.valorElemento()),0.1);
        assertEquals(509.53, new CorrecaoPotassio().quantidadePotassioAplicar(264.96, EnumPotassio.SULFATO_DE_POTASSIO.valorElemento()),0.1);
        assertEquals(1204.36, new CorrecaoPotassio().quantidadePotassioAplicar(264.96, EnumPotassio.SULFATO_DE_POTASSIO_E_MAGNESIO.valorElemento()),0.1);
    }
    
    @Test
    public void testeCustoCorrecaoPotassioPorHectare(){
        assertEquals(1142.05, new CorrecaoPotassio().custoCorrecaoPotassioPorHectare(2500.00, 456.82), 0.1);
        assertEquals(1273.825, new CorrecaoPotassio().custoCorrecaoPotassioPorHectare(2500.00, 509.53), 0.1);
        assertEquals(3010.9, new CorrecaoPotassio().custoCorrecaoPotassioPorHectare(2500.00, 1204.36), 0.1);
       }
}