package co.uniquindio.mundo;

public class Usuario {
	
	private String id;
	private String contrase�a;
	
	public Usuario(String id, String contrase�a) {
		super();
		this.id = id;
		this.contrase�a = contrase�a;
	}
	
	public Usuario () {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
