<<<<<<< HEAD
=======
/**
 * 
 */
>>>>>>> master
package financeiro.usuario;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

<<<<<<< HEAD
public class UsuarioDAOHibernate implements UsuarioDAO {
	private Session session;
	
=======
/**
 * @author joao.ferreira
 *
 */
public class UsuarioDAOHibernate implements UsuarioDAO {
	private Session session;

>>>>>>> master
	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Usuario usuario) {
		this.session.save(usuario);
	}

	public void atualizar(Usuario usuario) {
		this.session.update(usuario);
	}

	public void excluir(Usuario usuario) {
		this.session.delete(usuario);
	}

	public Usuario carregar(Integer codigo) {
		return (Usuario) this.session.get(Usuario.class, codigo);
	}

	public Usuario buscarPorLogin(String login) {
<<<<<<< HEAD
		String hql = "select u from usuario u where u.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login", login);
=======
		String hql = "select u from Usuario u where u.login = :login";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("login", login);		
>>>>>>> master
		return (Usuario) consulta.uniqueResult();
	}

	public List<Usuario> listar() {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> master
		return this.session.createCriteria(Usuario.class).list();
	}
}
