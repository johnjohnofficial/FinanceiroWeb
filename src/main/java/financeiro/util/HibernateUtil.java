package financeiro.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		} catch(Throwable e) {
<<<<<<< HEAD
			System.out.println("Criação inicial do objeto SessionFactory falhou. Erro: " + e);
=======
			System.out.println("Cria��o inicial do objeto SessionFactory falhou. Erro: " + e);
>>>>>>> master
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
