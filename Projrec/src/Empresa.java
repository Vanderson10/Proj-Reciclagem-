import java.util.ArrayList;

public class Empresa {
	
	private String nome;
	private String CNPJ;
	private String endereco;
	private String email;
	private ArrayList<Usuario>usuarios;
	private ArrayList<Coleta>coletas;
	private ArrayList<TipoResiduo>tiposderesiduos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public ArrayList<Coleta> getColetas() {
		return coletas;
	}
	public void setColetas(ArrayList<Coleta> coletas) {
		this.coletas = coletas;
	}
	public ArrayList<TipoResiduo> getTiposderesiduos() {
		return tiposderesiduos;
	}
	public void setTiposderesiduos(ArrayList<TipoResiduo> tiposderesiduos) {
		this.tiposderesiduos = tiposderesiduos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		result = prime * result + ((coletas == null) ? 0 : coletas.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tiposderesiduos == null) ? 0 : tiposderesiduos.hashCode());
		result = prime * result + ((usuarios == null) ? 0 : usuarios.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		if (coletas == null) {
			if (other.coletas != null)
				return false;
		} else if (!coletas.equals(other.coletas))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tiposderesiduos == null) {
			if (other.tiposderesiduos != null)
				return false;
		} else if (!tiposderesiduos.equals(other.tiposderesiduos))
			return false;
		if (usuarios == null) {
			if (other.usuarios != null)
				return false;
		} else if (!usuarios.equals(other.usuarios))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", CNPJ=" + CNPJ + ", endereco=" + endereco + ", email=" + email
				+ ", usuarios=" + usuarios + ", coletas=" + coletas + ", tiposderesiduos=" + tiposderesiduos + "]";
	}
	public Empresa(String nome, String cNPJ, String endereco, String email, ArrayList<Usuario> usuarios,
			ArrayList<Coleta> coletas, ArrayList<TipoResiduo> tiposderesiduos) {
		super();
		this.nome = nome;
		CNPJ = cNPJ;
		this.endereco = endereco;
		this.email = email;
		this.usuarios = usuarios;
		this.coletas = coletas;
		this.tiposderesiduos = tiposderesiduos;
	}
	
	

}
