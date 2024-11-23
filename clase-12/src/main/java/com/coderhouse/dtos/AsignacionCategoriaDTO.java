package com.coderhouse.dtos;

public class AsignacionCategoriaDTO {
	//el DTO es el encargado de recibir los ID de categoria y curso
	private Long categoriaId;
	private Long cursoId;
	public Long getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}
	public Long getCursoId() {
		return cursoId;
	}
	public void setCursoID(Long cursoID) {
		this.cursoId = cursoID;
	}
	
	
}
