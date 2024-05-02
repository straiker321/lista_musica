package pe.idat.entity;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="facturas_musicas")
@AssociationOverrides({@AssociationOverride(name="facturaMusicaId.factura",joinColumns=@JoinColumn(name="factura_id",nullable=false,
	foreignKey=@ForeignKey(foreignKeyDefinition="foreign key(factura_id)references facturas(factura_id)"))),
	@AssociationOverride(name="facturaMusicaId.musica",
	joinColumns=@JoinColumn(name="musica_id",nullable=false,
			foreignKey=@ForeignKey(foreignKeyDefinition="foreign key(musica_id)references musicas(musicas_id)")))
})
public class FacturaMusica implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FacturaMusica_ID facturaMusicaId=new FacturaMusica_ID();
	
	@Column
	private Integer cantidad;
	
	@Column
	private Double precio_unitario;
	
	@Column
	private Double importe;
	
	public FacturaMusica() {
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((facturaMusicaId == null) ? 0 : facturaMusicaId.hashCode());
		result = prime * result + ((importe == null) ? 0 : importe.hashCode());
		result = prime * result + ((precio_unitario == null) ? 0 : precio_unitario.hashCode());
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
		FacturaMusica other = (FacturaMusica) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (facturaMusicaId == null) {
			if (other.facturaMusicaId != null)
				return false;
		} else if (!facturaMusicaId.equals(other.facturaMusicaId))
			return false;
		if (importe == null) {
			if (other.importe != null)
				return false;
		} else if (!importe.equals(other.importe))
			return false;
		if (precio_unitario == null) {
			if (other.precio_unitario != null)
				return false;
		} else if (!precio_unitario.equals(other.precio_unitario))
			return false;
		return true;
	}

	public FacturaMusica_ID getFacturaMusicaId() {
		return facturaMusicaId;
	}

	public void setFacturaMusicaId(FacturaMusica_ID facturaMusicaId) {
		this.facturaMusicaId = facturaMusicaId;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(Double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	
	public Factura getFactura() {
		return facturaMusicaId.getFactura();
	}

	public void setFactura(Factura factura) {
		this.facturaMusicaId.setFactura(factura);
	}

	public Musica getMusica() {
		return facturaMusicaId.getMusica();
	}

	public void setMusica(Musica musica) {
		this.facturaMusicaId.setMusica(musica);
	}
	
}
