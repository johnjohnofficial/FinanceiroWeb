package financeiro.web;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import financeiro.usuario.Usuario;
import financeiro.usuario.UsuarioRN;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private String confirmaSenha;
	private List<SelectItem> idiomas;
	
	public List<SelectItem> getIdiomas() {
		if (idiomas == null) {
			this.idiomas = new ArrayList<SelectItem>();
			idiomas.add(new SelectItem("pt_BR", "PortuguÃªs"));
			idiomas.add(new SelectItem("en_US", "English"));
			idiomas.add(new SelectItem("es_ES", "Espanol"));
		}
		return idiomas;
	}
	public String novo() {
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		return "usuario";
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
	
	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		String senha = this.usuario.getSenha();
		
		if(!senha.equals(this.confirmaSenha)) {
			FacesMessage facesMessage = new FacesMessage("A senha não foi confirmada corretamente");
			context.addMessage(null, facesMessage);
			return null;
		}
		
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(this.usuario);
		
		return "usuarioSucesso";
	}
}
