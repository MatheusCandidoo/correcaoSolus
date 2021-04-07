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
public class CorrecaoPotassio {
    
    public double participacaoAtualPotassioCTC(double ctc, double potassioAtual) {
        if ((ctc != 0) && (potassioAtual != 0)) {
            return (potassioAtual / ctc) / 100.0;
        }
        return 0.0;
    }

    public double participacaoPosCorrecaoPotasioCTC(double participacaoPotassioDesejada) {
        if (participacaoPotassioDesejada > 0.01) {
            return participacaoPotassioDesejada;
        }

        return 0;
    }

    public double necessidadeAdicionarPotassio(double potassioNoSolo, double participacaoPotassioDesejada, double partificaoAtualPotassioCtc) {
        return ((potassioNoSolo * participacaoPotassioDesejada) / partificaoAtualPotassioCtc) - potassioNoSolo;
    }

    public double transformarCmolEmMg(double necessidadePotassio) {
        return ((necessidadePotassio) * 39.1) * 10;
    }

    public double transformarMgEmKgHa(double potassioEmMg) {
        return potassioEmMg * 2;
    }

    public double transformarKgEmK2O(double potassioKgHa) {
        return potassioKgHa * 1.2;
    }
    
    public double calculaKgPorHaDeK2OComEficienciaDoPotassio(double quantidadePotassioEmK2O, double eficienciaPotassio){
        return quantidadePotassioEmK2O*100/eficienciaPotassio;
    }

    public double quantidadePotassioAplicar(double kgPorHaDeK2O, double enumPotassio) {
        return (kgPorHaDeK2O * 100) / enumPotassio;
    }

    public double custoCorrecaoPotassioPorHectare(double valorFontePotassio, double quantidadePotassioAplicar) {
        if (valorFontePotassio != 0) {
            return ((valorFontePotassio * (quantidadePotassioAplicar * 2.42)) / 1000) / 2.42;
        }
        return 0.0;
    }

}
