package pe.idat.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name="musicas")
public class Musica implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer musicaId;
	
	@Column(unique=true)
	private String nombre;
	
	@Column
	private String genero;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fecha;
	
	@Column
	private String total_dias;
	
	@OneToOne
	@JoinColumn(name="imagen_id",nullable=false,unique=true,
			foreignKey=@ForeignKey(foreignKeyDefinition="foreign key(imagen_id) references imagenes(imagen_id)"))
	
	private Imagen imagen;
	
	@ManyToOne
	@JoinColumn(name="categoriaId",nullable=false,
		foreignKey=@ForeignKey(foreignKeyDefinition="foreign key(categoria_id) references categorias(categoria_id)"))
	private Categoria categoria;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="musicas_productores",
			joinColumns=@JoinColumn(name="musica_id",nullable=false,
			foreignKey=@ForeignKey(foreignKeyDefinition="foreign key(musica_id) references musicas(musica_id)")),
			inverseJoinColumns=@JoinColumn(name="productor_id",nullable=false,
			foreignKey=@ForeignKey(foreignKeyDefinition="foreign key(productor_id) references productores(productor_id)")))
	private Set<Productor> itemsProductor=new HashSet<>();
	
	@OneToMany(mappedBy="facturaMusicaId.musica")
	private Set<FacturaMusica> itemsFacturaMusica=new HashSet<>();
	
	public Musica() {
		
	}

	public Musica(Integer musicaId, String nombre, String genero, LocalDate fecha, String total_dias) {
		this.musicaId = musicaId;
		this.nombre = nombre;
		this.genero = genero;
		this.fecha = fecha;
		this.total_dias = total_dias;
	}

	public Integer getMusicaId() {
		return musicaId;
	}

	public void setMusicaId(Integer musicaId) {
		this.musicaId = musicaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<Productor> getItemsProductor() {
		return itemsProductor;
	}

	public void setItemsProductor(Set<Productor> itemsProductor) {
		this.itemsProductor = itemsProductor;
	}

	public String getTotal_dias() {
		return total_dias;
	}

	public void setTotal_dias(String total_dias) {
		this.total_dias = total_dias;
	}

	public Set<FacturaMusica> getItemsFacturaMusica() {
		return itemsFacturaMusica;
	}

	public void setItemsFacturaMusica(Set<FacturaMusica> itemsFacturaMusica) {
		this.itemsFacturaMusica = itemsFacturaMusica;
	}
	
	
}
