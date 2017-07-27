package exemploXML;

public class Teste {

	public static void main(String[] args) {
		
		CadastroPessoas cadastro = new CadastroPessoas();
		cadastro.adicionaPessoa(new Pessoa("Ana","111",new Endereco("Rua X","Bairro X", 34, "3456")));
		cadastro.adicionaPessoa(new Pessoa("Carlos","222",new Endereco("Rua Y","Bairro Y", 35, "2222")));
		cadastro.adicionaPessoa(new Pessoa("Paula","333",new Endereco("Rua Z","Bairro Z", 36, "1111")));
		cadastro.adicionaPessoa(new Pessoa("Antonio","444",new Endereco("Rua P","Bairro P", 37, "6789")));
		
		cadastro.salvaEmXML();
		cadastro.lerDoXML();

	}

}
