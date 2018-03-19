package financeiro.util;

import financeiro.usuario.UsuarioDAO;
import financeiro.usuario.UsuarioDAOHibernate;

public class DAOFactory {
<<<<<<< HEAD
	
=======
>>>>>>> master
	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
<<<<<<< HEAD

=======
>>>>>>> master
}
