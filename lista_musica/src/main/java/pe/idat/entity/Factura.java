package pe.idat.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
@Entity
@Table(name="facturas")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY,generator="BoletaGenerator")
	 @TableGenerator(name="BoletaGenerator",initialValue=1020,allocationSize=1)
	 private Integer facturaId;
	 
	 @DateTimeFormat(pattern = "yyyy-MM-dd",iso=ISO.DATE)
	 private LocalDate fecha;
	 
	 @Column
	 private Double subtotal;
	 
	 @Column
	 private Double igv;
	 
	 @Column
	 private Double total;
	 
	 @OneToMany(mappedBy="facturaMusicaId.factura")
	 private Set<FacturaMusica> itemsFacturaMusica=new HashSet<>();
	 
	 public Factura() {
		 
	}

	public Factura(Integer facturaId, LocalDate fecha, Double subtotal, Double igv, Double total) {
		this.facturaId = facturaId;
		this.fecha = fecha;
		this.subtotal = subtotal;
		this.igv = igv;
		this.total = total;
	}

	public Integer getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Integer facturaId) {
		this.facturaId = facturaId;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

	public Double getIgv() {
		return igv;
	}

	public void setIgv(Double igv) {
		this.igv = igv;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Set<FacturaMusica> getItemsFacturaMusica() {
		return itemsFacturaMusica;
	}

	public void setItemsFacturaMusica(Set<FacturaMusica> itemsFacturaMusica) {
		this.itemsFacturaMusica = itemsFacturaMusica;
	}

	
	 
}
