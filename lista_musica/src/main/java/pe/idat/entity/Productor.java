package pe.idat.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="productores")
public class Productor implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer productorId;
	
	@Column
	private String nombre;
	
	@Column
	private Integer telefono;
	
	@ManyToMany(mappedBy="itemsProductor",fetch=FetchType.EAGER)
	private Set<Musica> itemsMusicas=new HashSet<>();
	
	public Productor() {
		
	}

	public Productor(Integer productorId, String nombre, Integer telefono) {
		this.productorId = productorId;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Integer getProductorId() {
		return productorId;
	}

	public void setProductorId(Integer productorId) {
		this.productorId = productorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Set<Musica> getItemsMusicas() {
		return itemsMusicas;
	}

	public void setItemsMusicas(Set<Musica> itemsMusicas) {
		this.itemsMusicas = itemsMusicas;
	}
	
}
