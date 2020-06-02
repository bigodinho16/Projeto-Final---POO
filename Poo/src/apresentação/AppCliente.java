package apresentação;
import negocio.Contato;
import persistencia.ContatoDAO;
import persistencia.IContatoDAO;

public class AppCliente {

	public static void main(String[] args) {
		Contato c = new Contato(1, "João","da Silva","joao@email.com","(21) 98765-4321", "Família" );
				IContatoDAO dao = new ContatoDAO();
		
		dao.salvar(c);
		
		System.out.print(c);

	}
}
	
