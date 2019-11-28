package com.loyalty.proyectoTDD.pojo.database;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "CL_COBROS")
public class Cobros {
	@Id
	@Column(name = "COB_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "COB_SUS_ID")
	private Integer susId;
	
	public Integer getSusId() {
		return susId;
	}

	public void setSusId(Integer susId) {
		this.susId = susId;
	}

	@ManyToOne(cascade = CascadeType.ALL  )
	@JoinColumn(name = "cob_sus_id", referencedColumnName = "SUS_ID", insertable = false, updatable = false)
	@JsonIgnore
	private Suscripciones suscripcion_cobro;
	
	@Column(name = "COB_ID_ORION")
	private String idorion;

	@Column(name = "COB_NUM_PAGO")
	private Integer numPago;
	
	@Column(name = "COB_MONTO")
	private Double monto;
	
	@Column(name = "COB_MILLAS")
	private Integer millas;
	
	@Column(name = "COB_ESTADO")
	private Character estado;
	
	@Column(name = "COB_FECHA_COBRO")
	private Date fechacobro;
	
	@Column(name = "COB_FECHA_REGISTRO")
	private Date fechaRegistro;

	@Column(name="COB_REF_NUMBER")
	private String refnumber;

	@Column(name = "COB_RESP")
	private String response;
	
	public Cobros() {
		super(); 
	}

	public Cobros(Integer id, Suscripciones suscripcion_cobro, String idorion, Integer numpago, Double monto, Integer millas, Integer balance, Character estado,
			Date fechacobro, Date fecharegistro, Integer susId) {
		super();
		this.id = id;
		this.suscripcion_cobro = suscripcion_cobro;
		this.idorion = idorion;
		this.numPago = numpago;
		this.monto = monto;
		this.millas = millas;
		this.estado = estado;
		this.fechacobro = fechacobro;
		this.fechaRegistro = fecharegistro;
		this.susId = susId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Suscripciones getSuscripcion_cobro() {
		return suscripcion_cobro;
	}

	public void setSuscripcion_cobro(Suscripciones sus_id) {
		this.suscripcion_cobro = sus_id;
	}

	
	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Integer getMillas() {
		return millas;
	}

	public void setMillas(Integer millas) {
		this.millas = millas;
	}
	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public Integer getNumPago() {
		return numPago;
	}

	public void setNumPago(Integer numPago) {
		this.numPago = numPago;
	}
	

	public String getIdorion() {
		return idorion;
	}

	public void setIdorion(String idorion) {
		this.idorion = idorion;
	}

	public Date getFechacobro() {
		return fechacobro;
	}

	public void setFechacobro(Date fechacobro) {
		this.fechacobro = fechacobro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fechaRegistro = fecharegistro;
	}

	public String getRefnumber() {
		return refnumber;
	}

	public void setRefnumber(String refnumber) {
		this.refnumber = refnumber;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}		
	
	public String toString() {
		return "Información de Cobro [id=" + id+"]";
	}
}
