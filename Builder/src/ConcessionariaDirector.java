public class ConcessionariaDirector {
    
	protected FiatBuilder montadora;
 
    public ConcessionariaDirector(FiatBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirCarro() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }
 
    public CarroProduct getCarro() {
        return montadora.getCarro();
    }
    
    public static void main(String[] args) {
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(
                new FiatBuilder());
     
        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);
     
        System.out.println();
     
        concessionaria = new ConcessionariaDirector(new FiatBuilder());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora
                + "\nAno: " + carro.anoDeFabricacao + "\nMotor: "
                + carro.dscMotor + "\nValor: " + carro.preco);
    }
}
