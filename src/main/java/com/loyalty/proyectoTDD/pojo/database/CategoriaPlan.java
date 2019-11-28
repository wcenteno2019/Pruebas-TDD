package com.loyalty.proyectoTDD.pojo.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="CL_CATEGORIAS_PLANES")
public class CategoriaPlan {
	@Id
	@GeneratedValue
	@Column(name="CAT_ID")
	private int cat_id;
	
	@Column(name="CAT_NOMBRE")
	private String cat_codigo;
	
	@Column(name="CAT_FECHA_CREACION")
	private Date cat_fecha_creacion;
	
	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_codigo() {
		return cat_codigo;
	}

	public void setCat_codigo(String cat_codigo) {
		this.cat_codigo = cat_codigo;
	}

	public Date getCat_fecha_creacion() {
		return cat_fecha_creacion;
	}

	public void setCat_fecha_creacion(Date cat_fecha_creacion) {
		this.cat_fecha_creacion = cat_fecha_creacion;
	}
	public String toString() {
		return "Información de Categoría de plan [id=" + cat_id+"]";
	}		
}


