package pe.idat.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer categoriaId;
	
	@Column
	private String descripcion;
	
	@OneToMany(mappedBy="categoria")
	private Collection<Musica> itemsMusicas=new ArrayList<>();
	
	public Categoria() {
		
	}

	public Categoria(Integer categoriaId, String descripcion) {
		this.categoriaId = categoriaId;
		this.descripcion = descripcion;
	}

	public Integer getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Collection<Musica> getItemsMusicas() {
		return itemsMusicas;
	}

	public void setItemsMusicas(Collection<Musica> itemsMusicas) {
		this.itemsMusicas = itemsMusicas;
	}
}

