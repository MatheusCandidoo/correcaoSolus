/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquiteturaCorrecaoSolo.mavem;

/**
 *
 * @author candido
 */
public class CorrecaoFosforo {
    
    public double custoCorrecaoPorHectare(double valorFonteFosforo, double quantidadeFosforoAplicar) {
        return ((valorFonteFosforo * (quantidadeFosforoAplicar * 2.42)) / 1000) / 2.42;
    }

    public double necessidadeAdicionar(double valorAtual, double valorAtingir) {
        return valorAtingir - valorAtual;
    }

    public double transformaMgdmEmKgha(double necessidadeAdicionar) {
        return necessidadeAdicionar * 2;
    }
    
    public double transformandoFosforoEmP2O5(double necessidadeFosforoEmKgHa){
        return necessidadeFosforoEmKgHa * 2.29;
    }
    
    public double necessidadeP2O5EmKgHa(double necessidadeP2O5, double eficaciaFosforo){
        return ((necessidadeP2O5*100)/(eficaciaFosforo/100))/100;
    }
    
    public double quantidadeFosforoAplicar(double necessidadeP2O5, double teorP2O5){
        return necessidadeP2O5*100/teorP2O5;
    }
}
