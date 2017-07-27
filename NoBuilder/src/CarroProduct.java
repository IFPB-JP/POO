public class CarroProduct {
    
	private double preco;
	private String dscMotor;
    private int anoDeFabricacao;
    private String modelo;
    private String montadora;
    
    public CarroProduct(double preco, String dscMotor, int anoDeFabricacao, String modelo, String montadora) {
		this.preco = preco;
		this.dscMotor = dscMotor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelo = modelo;
		this.montadora = montadora;
	}
    
    public CarroProduct(double preco, String dscMotor, int anoDeFabricacao, String modelo) {
		this.preco = preco;
		this.dscMotor = dscMotor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelo = modelo;
	}
    
    public CarroProduct(double preco, String dscMotor, String montadora) {
		this.preco = preco;
		this.dscMotor = dscMotor;
		this.montadora = montadora;
	}
    
    public CarroProduct(double preco, String dscMotor, String modelo, String montadora) {
		this.preco = preco;
		this.dscMotor = dscMotor;
		this.modelo = modelo;
		this.montadora = montadora;
	}
    
    public CarroProduct(String dscMotor, int anoDeFabricacao, String modelo, String montadora) {
		this.dscMotor = dscMotor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelo = modelo;
		this.montadora = montadora;
	}
    
    public CarroProduct(double preco) {
		this.preco = preco;
	}
    
    public CarroProduct(String dscMotor) {
		this.dscMotor = dscMotor;
	}
    
    public CarroProduct(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
    
    public CarroProduct(String dscMotor, int anoDeFabricacao) {
		this.dscMotor = dscMotor;
		this.anoDeFabricacao = anoDeFabricacao;
	}
    
    public CarroProduct(double preco,int anoDeFabricacao) {
		this.preco = preco;
		this.anoDeFabricacao = anoDeFabricacao;
	}
    
    public CarroProduct(String dscMotor, String montadora) {
		this.dscMotor = dscMotor;
		this.montadora = montadora;
	}
    
    public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDscMotor() {
		return dscMotor;
	}

	public void setDscMotor(String dscMotor) {
		this.dscMotor = dscMotor;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	@Override
	public String toString() {
		return "CarroProduct [preco=" + preco + ", dscMotor=" + dscMotor + ", anoDeFabricacao=" + anoDeFabricacao
				+ ", modelo=" + modelo + ", montadora=" + montadora + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoDeFabricacao;
		result = prime * result + ((dscMotor == null) ? 0 : dscMotor.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((montadora == null) ? 0 : montadora.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarroProduct other = (CarroProduct) obj;
		if (anoDeFabricacao != other.anoDeFabricacao)
			return false;
		if (dscMotor == null) {
			if (other.dscMotor != null)
				return false;
		} else if (!dscMotor.equals(other.dscMotor))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (montadora == null) {
			if (other.montadora != null)
				return false;
		} else if (!montadora.equals(other.montadora))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}
	
	
    
    
    
}
