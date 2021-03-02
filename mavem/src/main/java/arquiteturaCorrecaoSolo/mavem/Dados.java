package arquiteturaCorrecaoSolo.mavem;

public class Dados {
	private String produtor;
	private String data;
	private String municipio;
	private int talhao;
	private double areaTalhao;
	private double areaTotal;
	private String matrculaLote;
	private int texturaSolo;
	private int sistemaCultivo;
	private String responsavelTecnico;
	private double profundidadeAmostra;
	private int numeroAnalise;
	private Elemento elementosAtuais = new Elemento();
	private Elemento elementosIdeais = new Elemento();

	public String getProdutor() {
		return produtor;
	}
	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public int getTalhao() {
		return talhao;
	}
	public void setTalhao(int talhao) {
		this.talhao = talhao;
	}
	
	public double getAreaTalhao() {
		return areaTalhao;
	}
	public void setAreaTalhao(double areaTalhao) {
		this.areaTalhao = areaTalhao;
	}
	
	public double getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	
	public String getMatrculaLote() {
		return matrculaLote;
	}
	public void setMatrculaLote(String matrculaLote) {
		this.matrculaLote = matrculaLote;
	}
	
	public int getTexturaSolo() {
		return texturaSolo;
	}
	public void setTexturaSolo(int texturaSolo) {
		this.texturaSolo = texturaSolo;
	}
	
	public int getSistemaCultivo() {
		return sistemaCultivo;
	}
	public void setSistemaCultivo(int sistemaCultivo) {
		this.sistemaCultivo = sistemaCultivo;
	}
	
	public String getResponsavelTecnico() {
		return responsavelTecnico;
	}
	public void setResponsavelTecnico(String responsavelTecnico) {
		this.responsavelTecnico = responsavelTecnico;
	}
	
	public double getProfundidadeAmostra() {
		return profundidadeAmostra;
	}
	public void setProfundidadeAmostra(double profundidadeAmostra) {
		this.profundidadeAmostra = profundidadeAmostra;
	}
	
	public int getNumeroAnalise() {
		return numeroAnalise;
	}
	public void setNumeroAnalise(int numeroAnalise) {
		this.numeroAnalise = numeroAnalise;
	}
	
	public Elemento getElementosAtuais() {
		return elementosAtuais;
	}
	public void setElementosAtuais(Elemento elementosAtuais) {
		this.elementosAtuais = elementosAtuais;
	}
	
	public Elemento getElementosIdeais() {
		return elementosIdeais;
	}
	public void setElementosIdeais(Elemento elementosIdeais) {
		this.elementosIdeais = elementosIdeais;
	}
	
}
