package persistencia;
import java.util.List;
import negocio.Contato;


public interface IContatoDAO {

	public void salvar(Contato c); //salva os dados de um contato em um arquivo de texto
	public void atualizar(Contato c); //altera os dados de um contato que está no arquivo de texto
	public void deletar(int id); //Apaga os dados de um contato que está no arquivo de texto
	public Contato getById(int id); // Dado o id, recupera os dados de um contato
	public List<Contato> getAll(); //Recupera todos os dados de um contato e retorna uma lista
	    
	}	 
	
	    
	    
	    

