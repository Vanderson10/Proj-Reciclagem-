import java.util.ArrayList;

public class Residuo {
	
	private String nome;
	private Integer id;
	private ArrayList<Coleta>coletas;
	private ArrayList<TipoResiduo>tiposresiduos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ArrayList<Coleta> getColetas() {
		return coletas;
	}
	public void setColetas(ArrayList<Coleta> coletas) {
		this.coletas = coletas;
	}
	public ArrayList<TipoResiduo> getTiposresiduos() {
		return tiposresiduos;
	}
	public void setTiposresiduos(ArrayList<TipoResiduo> tiposresiduos) {
		this.tiposresiduos = tiposresiduos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coletas == null) ? 0 : coletas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tiposresiduos == null) ? 0 : tiposresiduos.hashCode());
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
		Residuo other = (Residuo) obj;
		if (coletas == null) {
			if (other.coletas != null)
				return false;
		} else if (!coletas.equals(other.coletas))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tiposresiduos == null) {
			if (other.tiposresiduos != null)
				return false;
		} else if (!tiposresiduos.equals(other.tiposresiduos))
			return false;
		return true;
	}
	public Residuo(String nome, Integer id, ArrayList<Coleta> coletas, ArrayList<TipoResiduo> tiposresiduos) {
		super();
		this.nome = nome;
		this.id = id;
		this.coletas = coletas;
		this.tiposresiduos = tiposresiduos;
	}
	@Override
	public String toString() {
		return "Residuo [nome=" + nome + ", id=" + id + ", coletas=" + coletas + ", tiposresiduos=" + tiposresiduos
				+ "]";
	}
	
	

}
