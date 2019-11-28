package com.loyalty.proyectoTDD.pojo.database;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="CL_SUSCRIPCIONES")
public class Suscripciones implements Serializable {
	@Id
	@Column(name="SUS_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="sus_pln_id")
	private int planId;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sus_pln_id", referencedColumnName ="pln_id", insertable = false, updatable = false)
	private Plan plan; 
	public Plan getPlan() {
		return plan;
	}

	@OneToMany
	@JoinColumn(name = "COB_SUS_ID")
	private List<Cobros> cobros = new ArrayList<>();


	public List<Cobros> getCobros() {
		return cobros;
	}

	public void setCobros(List<Cobros> cobros) {
		this.cobros = cobros;
	}

	@Column(name = "sus_codigo_cliente")
	private String membershipNumber;

	@Column(name = "sus_token_cyb")
	private String token_cyb;

	@Column(name = "SUS_FECHA_INGRESO")
	private Date fecha_ingreso;

	@Column(name = "SUS_FECHA_CANCELACION")
	private Date fecha_cancelacion;

	
	@Column(name = "SUS_FECHA_INICIO")
	private Date fechaInicio;
	
	@Column(name = "SUS_ESTADO")
	private String estado;

	@Column(name = "SUS_FECHA_PROX_COBRO")
	private Date fechaproxcobro;

	@Column(name = "SUS_BALANCE")
	private int sus_balance;
	
	@Column(name = "sus_pais")
	private String country;
	
	@Column(name = "SUS_IP_CLIENTE")
	private String ip;
	
	@Column(name = "SUS_DEV_FINGERPRINT_ID")
	private String fingerprint;
	
	@Column(name = "SUS_MONEDA")
	private String moneda;
	
	@Column(name = "SUS_SERVICE_TYPE")
	private String serviceType;
	@Column(name = "SUS_TAX_CODE")
	private String taxCode;
	@Column(name = "SUS_TAX_VALUE")
	private double taxValue;
	
	
	@Column(name = "SUS_TRANSACTION_ID")
	private String transactionid;

	

	public Suscripciones(int id, int planId, Plan plan, List<Cobros> cobros, String membershipNumber, String token_cyb,
                         Date fecha_ingreso, Date fecha_cancelacion, Date fechaInicio, String estado, Date fechaproxcobro,
                         int sus_balance, String country, String ip, String fingerprint, String moneda, String serviceType,
                         String taxCode, double taxValue, String transactionid) {
		super();
		this.id = id;
		this.planId = planId;
		this.plan = plan;
		this.cobros = cobros;
		this.membershipNumber = membershipNumber;
		this.token_cyb = token_cyb;
		this.fecha_ingreso = fecha_ingreso;
		this.fecha_cancelacion = fecha_cancelacion;
		this.fechaInicio = fechaInicio;
		this.estado = estado;
		this.fechaproxcobro = fechaproxcobro;
		this.sus_balance = sus_balance;
		this.country = country;
		this.ip = ip;
		this.fingerprint = fingerprint;
		this.moneda = moneda;
		this.serviceType = serviceType;
		this.taxCode = taxCode;
		this.taxValue = taxValue;
		this.transactionid = transactionid;
	}

	public Suscripciones() {
		super();
	}
	
	 

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlan_id(int planId) {
		this.planId = planId;
	}

	public String getMembership_number() {
		return membershipNumber;
	}

	public void setMembership_number(String membership_number) {
		this.membershipNumber = membership_number;
	}

	public String getToken_cyb() {
		return token_cyb;
	}

	public void setToken_cyb(String token_cyb) {
		this.token_cyb = token_cyb;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Date getFecha_cancelacion() {
		return fecha_cancelacion;
	}

	public void setFecha_cancelacion(Date fecha_cancelacion) {
		this.fecha_cancelacion = fecha_cancelacion;
	}



	

	public Date getFechaproxcobro() {
		return fechaproxcobro;
	}

	public void setFechaproxcobro(Date fechaproxcobro) {
		this.fechaproxcobro = fechaproxcobro;
	}

	
	public int getSus_balance() {
		return sus_balance;
	}

	public void setSus_balance(int sus_balance) {
		this.sus_balance = sus_balance;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public String toString() {
		return "Información de suscripción [id=" + id+"]";
	}

	public String getMembershipNumber() {
		return membershipNumber;
	}

	public void setMembershipNumber(String membershipNumber) {
		this.membershipNumber = membershipNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public double getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(double taxValue) {
		this.taxValue = taxValue;
	}
	
	
	

}
