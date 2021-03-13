package arquiteturaCorrecaoSolo.mavem;

import java.util.Scanner;

public class App {

	public static void main( String[] args ){
		App app = new App();
    	Dados dados = new Dados();
    	dados = app.lerDados();
    	
    	
    	app.escreverDados(dados);
    }

	private Dados lerDados() {
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
       dados.getElementosAtuais().setEnxofre(ler.nextDouble());
       
       System.out.println("\nQuantidade de Aluminio: ");
       dados.getElementosAtuais().setAluminio(ler.nextDouble());
       
       System.out.println("\nQuantidade de H+AL: ");
       dados.getElementosAtuais().sethAl(ler.nextDouble());
       
       ler.close();
       
       dados.setElementosIdeais(defineIdeal(dados.getTexturaSolo()));
       
       return dados;
	}
	
	
	private void escreverDados(Dados dados) {
		System.out.print("Textura do solo: "+dados.getTexturaSolo()+(dados.getTexturaSolo()==1?" Argiloso + 40% de argila":"Textura Média 25 a 40% de argila"));
		System.out.println("\tSistema de Cultivo: "+dados.getSistemaCultivo()+(dados.getSistemaCultivo() == 1 ? " Plantio Direto":" Convencional"));
		
		System.out.println("Responsável Técnico: "+dados.getResponsavelTecnico()+"\tProfundidade da amostra de solos: "+dados.getProfundidadeAmostra()+" cm");
		
		System.out.println("Resultado da análise de solos Nº: "+dados.getNumeroAnalise());
		
		System.out.println("\n----Teores dos elementos no solo e Ideais!----\n");

		System.out.println("Fósforo; No solo: "+dados.getElementosAtuais().getFosforo()+ " Ideal: "+dados.getElementosIdeais().getFosforo());
		
		System.out.println("Potássio: "+dados.getElementosAtuais().getPotassio()+" Ideal: "+dados.getElementosIdeais().getPotassio());
		
		System.out.println("Calcio: "+dados.getElementosAtuais().getCalcio()+ " Ideal: "+dados.getElementosIdeais().getCalcio());
		
		System.out.println("Magnésio: "+dados.getElementosAtuais().getMagnesio()+ "Ideal: "+dados.getElementosIdeais().getMagnesio());
		
		System.out.println("Enxofre: "+dados.getElementosAtuais().getEnxofre()+ " Ideal: "+dados.getElementosIdeais().getEnxofre());
		
		System.out.println("Aluminio: "+dados.getElementosAtuais().getAluminio()+" Ideal: "+dados.getElementosIdeais().getAluminio());
		
		System.out.println("H+AL: "+dados.getElementosAtuais().gethAl()+" Ideal: "+dados.getElementosIdeais().gethAl());
		
		System.out.println("S cmol: "+calculaSCmol(dados.getElementosAtuais()));
		System.out.println("CTC cmol: "+calculaCTCCmol(dados.getElementosAtuais()));
		System.out.println("v% atual: "+calculaVAtual(dados.getElementosAtuais()));
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
		return 100*calculaSCmol(elementoAtual)/calculaCTCCmol(elementoAtual);
	}
	
	public double fosforoCorrecao() {
		return 0.0;
	}
	
	public double potassioCorrecao(Elemento elementoAtual) {
		if(elementoAtual.getPotassio() > 0.5) {
			return elementoAtual.getPotassio();
		} else {
			if (conta1(0,elementoAtual) < 0.01) {
				return elementoAtual.getPotassio();
			} else {
				return conta1(0,elementoAtual) +elementoAtual.getPotassio();
			}
		}
	}
	
	public double conta1(double participacaoDesejada, Elemento elementoAtual ) {
		return (elementoAtual.getPotassio() * (participacaoDesejada /100) /
			(elementoAtual.getPotassio()/calculaCTCCmol(elementoAtual)*100)) - elementoAtual.getPotassio();
	}
}
