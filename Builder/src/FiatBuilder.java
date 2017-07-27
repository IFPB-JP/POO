public class FiatBuilder{

	private CarroProduct carro;
	
	public FiatBuilder(){
		carro = new CarroProduct();	
	}
	
	public void buildPreco() {
        // Operação complexa. 
        carro.preco = 25000.00;
    }
 
    public void buildDscMotor() {
        // Operação complexa.
        carro.dscMotor = "Fire Flex 1.0";
    }
 
    public void buildAnoDeFabricacao() {
        // Operação complexa.
        carro.anoDeFabricacao = 2011;
    }
    
    public void buildModelo() {
        // Operação complexa.
        carro.modelo = "Palio";
    }
 
    public void buildMontadora() {
        // Operação complexa.
        carro.montadora = "Fiat";
    }
    
    public CarroProduct getCarro() {
        return carro;
    }
}
