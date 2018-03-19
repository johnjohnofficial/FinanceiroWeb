package financeiro.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import financeiro.usuario.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private String confirmaSenha;
	private List<SelectItem> idiomas;
	
	public List<SelectItem> getIdiomas() {
		if (idiomas == null) {
			this.idiomas = new ArrayList<SelectItem>();
			idiomas.add(new SelectItem("pt_BR", "Português"));
			idiomas.add(new SelectItem("en_US", "English"));
			idiomas.add(new SelectItem("es_ES", "Espanol"));
		}
		return idiomas;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getConfirmaSenha() {
		return confirmaSenha;
	}
	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	public void salvar() {
		
	}
}
