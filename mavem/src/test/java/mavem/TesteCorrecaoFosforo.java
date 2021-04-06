/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavem;

import arquiteturaCorrecaoSolo.mavem.App;
import arquiteturaCorrecaoSolo.mavem.CorrecaoFosforo;
import arquiteturaCorrecaoSolo.mavem.EnumFosforo;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author candido
 */
public class TesteCorrecaoFosforo {

    @Test
    public void testeNecessidadeAdicionar(){
        assertEquals(1.41, new CorrecaoFosforo().necessidadeAdicionar(8.59, 10.0), 0.1);
    }
    
    @Test
    public void testeTransformaMgdmEmKgha(){
        assertEquals(2.82, new CorrecaoFosforo().transformaMgdmEmKgha(1.41), 0.0);
    }
    
    @Test
    public void testeTransformandoFosforoEmP2O5(){ 
        assertEquals(6.4578, new CorrecaoFosforo().transformandoFosforoEmP2O5(2.82), 0.0);
    }
    
    @Test
    public void testeNecessidadeP2O5EmKgHa(){
        assertEquals(9.23, new CorrecaoFosforo().necessidadeP2O5EmKgHa(6.4578, 70), 0.1);
    }
    
    @Test
    public void testeQuantidadeFosforoAplicar(){
        assertEquals(51.25, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.SUPERFOSFATO.valorFonteFosforo()), 0.2);
    }
    
    @Test
    public void testeValorCorrecaoPorHectare(){
        assertEquals(0.77, new CorrecaoFosforo().custoCorrecaoPorHectare(15.00, 51.25), 0.1);
    }
}
