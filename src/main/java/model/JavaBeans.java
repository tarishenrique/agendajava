package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String fone;
	private String mail;
	
	
	
	public JavaBeans(String idcon, String nome, String fone, String mail) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.fone = fone;
		this.mail = mail;
	}
	public JavaBeans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
