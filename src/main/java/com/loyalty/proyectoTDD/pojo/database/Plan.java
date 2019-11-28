package com.loyalty.proyectoTDD.pojo.database;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name="CL_PLANES")
public class Plan {
	@Id
	@GeneratedValue
	@Column(name="pln_id")
	private int planId;
	
	@OneToMany
	@JoinColumn(name="SUS_ID")
	@JsonIgnore
	private List<Suscripciones> suscripciones = new ArrayList<>();
	
	@Column(name="pln_cat_id")
	private int catId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pln_cat_id", referencedColumnName ="CAT_ID", insertable = false, updatable = false)
	private CategoriaPlan catplan; 
	public CategoriaPlan getCategoriaPlan() {
		return catplan;
	}
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="det_pln_id")
	@OrderBy("DET_MES")
	private List<DetallePlanes> detallePlanes = new ArrayList<>();
	
	
	
	@Column(name="PLN_NOMBRE")
	private String plan_codigo;
	
	@Column(name="PLN_PRECIO")
	private Double plan_precio;
	
	@Column(name ="PLN_MILLAS_MENSUALES")
	private int plan_millas_mensuales; 

	@Column(name ="PLN_MILLAS_BONO")
	private int plan_millas_bono;
	
	@Column(name ="PLN_MILLAS_TOTALES")
	private int plan_millas_totales; 
	
	@Column(name = "PLN_ORDEN")
	private int plan_order;
	
	@Column(name ="PLN_FECHA_CREACION")
	private Date plan_fecha_creacion; 
	
	@Column(name ="PLN_ESTADO")
	private char plan_estado;
	
	

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public List<Suscripciones> getSuscripciones() {
		return suscripciones;
	}

	public void setSuscripciones(List<Suscripciones> suscripciones) {
		this.suscripciones = suscripciones;
	}

	public String getPlan_codigo() {
		return plan_codigo;
	}

	public void setPlan_codigo(String plan_codigo) {
		this.plan_codigo = plan_codigo;
	}

	public Double getPlan_precio() {
		return plan_precio;
	}

	public void setPlan_precio(Double plan_precio) {
		this.plan_precio = plan_precio;
	}

	public int getPlan_millas_mensuales() {
		return plan_millas_mensuales;
	}

	public void setPlan_millas_mensuales(int plan_millas_mensuales) {
		this.plan_millas_mensuales = plan_millas_mensuales;
	}

	public int getPlan_millas_bono() {
		return plan_millas_bono;
	}

	public void setPlan_millas_bono(int plan_millas_bono) {
		this.plan_millas_bono = plan_millas_bono;
	}

	public int getPlan_millas_totales() {
		return plan_millas_totales;
	}

	public void setPlan_millas_totales(int plan_millas_totales) {
		this.plan_millas_totales = plan_millas_totales;
	}

	public int getPlan_order() {
		return plan_order;
	}

	public void setPlan_order(int plan_order) {
		this.plan_order = plan_order;
	}

	public Date getPlan_fecha_creacion() {
		return plan_fecha_creacion;
	}

	public void setPlan_fecha_creacion(Date plan_fecha_creacion) {
		this.plan_fecha_creacion = plan_fecha_creacion;
	}

	public char getPlan_estado() {
		return plan_estado;
	}

	public void setPlan_estado(char plan_estado) {
		this.plan_estado = plan_estado;
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true, noRollbackFor=Exception.class)
	public List<DetallePlanes> getDetallePlanes() {
		return detallePlanes;
	}

	public void setDetallePlanes(List<DetallePlanes> detallePlanes) {
		this.detallePlanes = detallePlanes;
	}

	public Plan(int plan_id, List<Suscripciones> suscripciones, CategoriaPlan catplan, String plan_codigo,
			double plan_precio, int plan_millas_mensuales, int plan_millas_bono, int plan_millas_totales,
			Date plan_fecha_creacion, char plan_estado, List<DetallePlanes> detallePlanes) {
		super();
		this.planId = plan_id;
		this.suscripciones = suscripciones;
		this.catplan = catplan;
		this.plan_codigo = plan_codigo;
		this.plan_precio = plan_precio;
		this.plan_millas_mensuales = plan_millas_mensuales;
		this.plan_millas_bono = plan_millas_bono;
		this.plan_millas_totales = plan_millas_totales;
		this.plan_fecha_creacion = plan_fecha_creacion;
		this.plan_estado = plan_estado;
		this.detallePlanes = detallePlanes;
	}

	public Plan() {
		
	}

	public String toString() {
		return "Información del plan [id=" + planId+"]";
	}	
	
	
	
}


