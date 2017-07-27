package exemploXML;

import java.util.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import java.io.*;

public class CadastroPessoas {
	
	private List<Pessoa> lista;
	
	public CadastroPessoas(){
		
		lista = new ArrayList<Pessoa>();
				
	}
	
	public void adicionaPessoa(Pessoa a){
		lista.add(a);
	}
	
	public Pessoa buscaPessoaPeloCPF(String cpf) throws Exception{
		for (Pessoa p:lista){
			if (p.getCpf().equals(cpf)){
				return p;
			}
		}
		throw new Exception("Não existe uma pessoa com o cpf " + cpf);
	}
	
	public void removePessoasPorCEP(String cep){
		for (Pessoa p:lista){
			if (p.getEndereco().getCep().equals(cep)){
				lista.remove(p);
			}
		}
	}
	
	public void salvaEmXML(){
		XStream xStream = new XStream(new StaxDriver());
        xStream.alias("pessoa", Pessoa.class);
        xStream.alias("endereco", Endereco.class);
        xStream.alias("lista", List.class);
 
        File arquivo = new File("pessoas.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xStream.toXML(lista).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
		
	} 
	
	public void lerDoXML(){
		try {
			XStream xStream = new XStream(new StaxDriver());
			//Questões de segurança
			XStream.setupDefaultSecurity(xStream);
			xStream.addPermission(AnyTypePermission.ANY); 
			xStream.alias("lista", List.class);
			xStream.processAnnotations(Pessoa.class);
			xStream.processAnnotations(Endereco.class);
			BufferedInputStream input = new BufferedInputStream(new FileInputStream("pessoas.xml"));
			List<Pessoa> pessoas1 = (List<Pessoa>) xStream.fromXML(input);
			input.close();
			for (Pessoa pessoa : pessoas1) {
				System.out.println("Endereço: " + pessoa.getCpf() + " - " + pessoa.getNome() + " - " + pessoa.getEndereco());
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
