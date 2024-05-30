package ar.edu.unju.fi.model;

public class Carrera {
	
	private String codigo;
	private String nombre;
	private Integer cantidadAnios;
	private Boolean estado;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	public Carrera(String codigo, String nombre, Integer cantidadAnios, Boolean estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadAnios = cantidadAnios;
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCantidadAnios() {
		return cantidadAnios;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCantidadAnios(Integer cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}
