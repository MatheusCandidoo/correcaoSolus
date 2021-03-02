package arquiteturaCorrecaoSolo.mavem;

import java.util.Scanner;

public class App {

	public static void main( String[] args ){
		App app = new App();
    	Dados dados = new Dados();
    	Scanner ler = new Scanner(System.in);
       
    	System.out.println("Por favor entre com os dados da analise:");
       

    	System.out.println("\nSistema de cultivo (1 - Plantio Direto; 2 - Convencional): ");
    	dados.setSistemaCultivo(ler.nextInt());
       

       System.out.println("\nResponsavel tecnico: ");
       dados.setResponsavelTecnico(ler.next());
       

       System.out.println("\nProfundidade da amostra: ");
       dados.setProfundidadeAmostra(ler.nextDouble());
       

       System.out.println("\nAnalise de solo nº: ");
       dados.setNumeroAnalise(ler.nextInt());
       

       System.out.println("\nAgora insira os dados do solo: ");

       System.out.println("\nTextetura do solo (1 - Argiloso; 2 - Textura média): ");
       dados.setTexturaSolo(ler.nextInt());
       
       System.out.println("\nQuantidade de Fósforo (mg.dm³ | mehlich): ");
       dados.getElementosAtuais().setFosforo(ler.nextDouble());
       
       System.out.println("\nQuantidade de Potássio (cmol): ");
       dados.getElementosAtuais().setPotassio(ler.nextDouble());
       
       System.out.println("\nQuantidade de Cálcio (cmol): ");
       dados.getElementosAtuais().setCalcio(ler.nextDouble());
       
       System.out.println("\nQuantidade de Magnésio (cmol): ");
       dados.getElementosAtuais().setMagnesio(ler.nextDouble());
       
       System.out.println("\nQuantidade de Enxofre (mg.dm³): ");
       dados.getElementosAtuais().setMagnesio(ler.nextDouble());
       
       System.out.println("\nQuantidade de Enxofre: ");
       dados.getElementosAtuais().setAluminio(ler.nextDouble());
       
       System.out.println("\nQuantidade de H+AL: ");
       dados.getElementosAtuais().sethAl(ler.nextDouble());
       
       dados.setElementosIdeais(app.defineIdeal(dados.getTexturaSolo()));
    }

	private Elemento defineIdeal(int tipoSolo) {
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

}
