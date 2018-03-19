package financeiro.usuario;

<<<<<<< HEAD
import java.util.List;

import financeiro.util.DAOFactory;

=======
import financeiro.util.DAOFactory;

import java.util.List;

>>>>>>> master
public class UsuarioRN {
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	
	public Usuario carregar(Integer codigo) {
		return this.usuarioDAO.carregar(codigo);
	}
	
<<<<<<< HEAD
	public Usuario buscaPorLogin(String login) {
		return this.usuarioDAO.buscarPorLogin(login);
	}
	
=======
>>>>>>> master
	public void salvar(Usuario usuario) {
		Integer codigo = usuario.getCodigo();
		
		if(codigo == null || codigo == 0) {
			this.usuarioDAO.salvar(usuario);
		} else {
			this.usuarioDAO.atualizar(usuario);
		}
	}
	
	public void excluir(Usuario usuario) {
		this.usuarioDAO.excluir(usuario);
	}
	
	public List<Usuario> listar() {
		return usuarioDAO.listar();
	}
}
