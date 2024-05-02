package pe.idat.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class FacturaMusica_ID implements Serializable{
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Factura factura;
	@ManyToOne
	private Musica musica;
	
	public FacturaMusica_ID(){
	}

	public FacturaMusica_ID(Factura factura, Musica musica) {
		this.factura = factura;
		this.musica = musica;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		result = prime * result + ((musica == null) ? 0 : musica.hashCode());
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
		FacturaMusica_ID other = (FacturaMusica_ID) obj;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		if (musica == null) {
			if (other.musica != null)
				return false;
		} else if (!musica.equals(other.musica))
			return false;
		return true;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}
	
	
}
