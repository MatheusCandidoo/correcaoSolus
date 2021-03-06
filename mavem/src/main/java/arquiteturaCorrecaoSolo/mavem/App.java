package arquiteturaCorrecaoSolo.mavem;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    }

    public Elemento defineIdeal(int tipoSolo) {
        Elemento elementosIdeais = new Elemento();

        switch (tipoSolo) {
            case 1:
                elementosIdeais.setFosforo(9.0);
                elementosIdeais.setPotassio(0.35);
                elementosIdeais.setCalcio(6.0);
                elementosIdeais.setMagnesio(1.5);
                elementosIdeais.setEnxofre(9.0);
                elementosIdeais.setAluminio(0.0);
                elementosIdeais.sethAl(0.0);
                return elementosIdeais;

            case 2:
                elementosIdeais.setFosforo(12.0);
                elementosIdeais.setPotassio(0.25);
                elementosIdeais.setCalcio(4.0);
                elementosIdeais.setMagnesio(1.0);
                elementosIdeais.setEnxofre(6);
                elementosIdeais.setAluminio(0.0);
                elementosIdeais.sethAl(0.0);

                return elementosIdeais;
            default:
                System.out.println("Textura de solo inválida!" + "\nPor favor insira um valor válido.");

                return elementosIdeais;
        }
    }

    public double calculaSCmol(Elemento elementoAtual) {
        return elementoAtual.getPotassio() + elementoAtual.getCalcio() + elementoAtual.getMagnesio();
    }

    public double calculaCTCCmol(Elemento elementoAtual) {
        return calculaSCmol(elementoAtual) + elementoAtual.gethAl();
    }

    public double calculaVAtual(Elemento elementoAtual) {
        return 100 * calculaSCmol(elementoAtual) / calculaCTCCmol(elementoAtual);
    }

    public double fosforoCorrecao() {
        return 0.0;
    }

    public double potassioCorrecao(Elemento elementoAtual) {
        if (elementoAtual.getPotassio() > 0.5) {
            return elementoAtual.getPotassio();
        } else {
            if (conta1(0, elementoAtual) < 0.01) {
                return elementoAtual.getPotassio();
            } else {
                return conta1(0, elementoAtual) + elementoAtual.getPotassio();
            }
        }
    }

    public double conta1(double participacaoDesejada, Elemento elementoAtual) {
        return (elementoAtual.getPotassio() * (participacaoDesejada / 100)
                / (elementoAtual.getPotassio() / calculaCTCCmol(elementoAtual) * 100)) - elementoAtual.getPotassio();
    }

    public double calculaMoPercentual(double mo) {
        if (mo > 0) {
            return mo / 10;
        } else {
            return 0.0;
        }
    }

    public double calculaCarbono(double moPercentual) {
        if (moPercentual > 0) {
            return moPercentual / 1.72 * 10;
        } else {
            return 0.0;
        }
    }

}
