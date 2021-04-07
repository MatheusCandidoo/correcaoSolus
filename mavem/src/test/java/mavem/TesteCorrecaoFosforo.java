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
        assertEquals(51.25, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.SUPERFOSFATO_SIMPLES.valorFonteFosforo()), 0.2);
        assertEquals(22.51, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.SUPERFOSFATO_TRIPLO.valorFonteFosforo()), 0.2);
        assertEquals(19.22, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.MAP.valorFonteFosforo()), 0.2);
        assertEquals(20.51, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.DAP.valorFonteFosforo()), 0.2);
        assertEquals(51.27, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.TERMOFOSTATO_YOORIN.valorFonteFosforo()), 0.2);
        assertEquals(27.96 ,new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.FOSFATO_REAT_ARAD.valorFonteFosforo()), 0.2);
        assertEquals(31.82, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.FOSFATO_REATIVO_GAFSA.valorFonteFosforo()), 0.2);
        assertEquals(28.84, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.FOSFATO_REATIVO_DAOUI.valorFonteFosforo()), 0.2);
        assertEquals(38.45, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.FOSF_NAT_PATOS_DE_MINAS.valorFonteFosforo()), 0.2);
        assertEquals(49.89, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.ESCORIA_DE_THOMAS.valorFonteFosforo()), 0.2);
        assertEquals(17.75, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.ACIDO_FOSFORICO.valorFonteFosforo()), 0.2);
        assertEquals(51.27, new CorrecaoFosforo().quantidadeFosforoAplicar(9.23, EnumFosforo.MULTIFOSFATO_MAGNESIANO.valorFonteFosforo()), 0.2);
    }
    
    @Test
    public void testeValorCorrecaoPorHectare(){
        assertEquals(0.77, new CorrecaoFosforo().custoCorrecaoPorHectare(15.00, 51.25), 0.1);
    }
}
