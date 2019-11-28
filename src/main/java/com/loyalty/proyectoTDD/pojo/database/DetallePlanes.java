package com.loyalty.proyectoTDD.pojo.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="CL_DETALLE_PLANES")
public class DetallePlanes {
	@Id
	@Column(name="DET_ID")
	@GeneratedValue
	private int det_id;
	
	@Column(name="DET_PLN_ID")
	private int planId;
	
	@Column(name="DET_PPM")
	private double det_ppm;

	@Column(name="DET_MES")
	private int detMes;
	
	@Column(name="DET_PORCENTAJE_BONO")
	private double det_porcentaje_bono;

//	@JsonManagedReference
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PLAN_ID", referencedColumnName ="PLAN_ID", insertable = false, updatable = false)
//	private Plan plan; 
//	public Plan getPlan() {
//		return plan;
//	}

	public int getPlan_id() {
		return planId;
	}
	
	public void setPlan_id(int planId) {
		this.planId = planId;
	}

	public int getDet_id() {
		return det_id;
	}

	public void setDet_id(int det_id) {
		this.det_id = det_id;
	}

	public double getDet_ppm() {
		return det_ppm;
	}

	public void setDet_ppm(double det_ppm) {
		this.det_ppm = det_ppm;
	}

	public int getDetMes() {
		return detMes;
	}

	public void setDetMes(int detMes) {
		this.detMes = detMes;
	}

	public double getDet_porcentaje_bono() {
		return det_porcentaje_bono;
	}

	public void setDet_porcentaje_bono(double det_porcentaje_bono) {
		this.det_porcentaje_bono = det_porcentaje_bono;
	}
	
	public DetallePlanes() {}
	
	public DetallePlanes(int det_id, int plan_id, double det_ppm, int det_mes, double det_porcentaje_bono) {
		this.det_id = det_id;
		this.planId = plan_id;
		this.det_ppm = det_ppm;
		this.detMes = det_mes;
		this.det_porcentaje_bono = det_porcentaje_bono;
	}
		
	public String toString() {
		return "Información del detalle del plan, con id=[" + det_id+"]";
	}	
}

