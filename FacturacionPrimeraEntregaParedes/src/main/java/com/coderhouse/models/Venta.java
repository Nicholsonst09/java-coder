package com.coderhouse.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ventas")
public class Venta {
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long id;	
	
	@Column(name = "Importe", nullable = false)
	private double importe;
	
	@Column(name = "Sucursal")
	private String sucursal;	
	
	@ManyToOne
	@JoinColumn(name = "producto_id",referencedColumnName = "id", nullable = false)
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id",referencedColumnName = "id", nullable = false)
	private Cliente cliente;

	public Venta() {
		super();
	}

	public Venta(double importe, String sucursal, Producto producto, String cliente) {
		super();
		this.importe = importe;
		this.sucursal = sucursal;
		this.producto = producto;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", importe=" + importe + ", sucursal=" + sucursal + ", producto=" + producto
				+ ", cliente=" + cliente + "]";
	}
	
	
	
	/*Ver despues si el id puede ser el numero de factura y aparte puede haber una letra de factura
	Analizar también si es necesario crear otra tabla que sea el detalle de la factura (ahora pongo todos los datos en esta tabla) 
	Todo esto sirve para poder registrar la venta de más de un producto en la misma factura y no solo uno y otros detalles*/
	
	
}
