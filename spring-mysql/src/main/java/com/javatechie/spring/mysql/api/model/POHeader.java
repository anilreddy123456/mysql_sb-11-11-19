package com.javatechie.spring.mysql.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "header")

public class POHeader {
	@Id
	@GeneratedValue
	@Column(name="ebeln")
	private int pONumber;
	
	@Column(name="logsy")
	private String logicalSystem;
	
	@Column(name="bsart")
	private String pOType;	
	
	@Column(name="ernam")
	private String pOCreatedBy;
	
	@Column(name="bedat")
	@Temporal(TemporalType.TIMESTAMP)
	private Date poDate;
	
	@Column(name="waers")
	private String currency;
	
	@Column(name="lifnr", nullable = false)
	private String vendorID;
	
	@Column(name="zterm")
	private String paymentTerms;
	
	@Column(name="inco1")
	private String incoTerms;

	public int getpONumber() {
		return pONumber;
	}

	public void setpONumber(int pONumber) {
		this.pONumber = pONumber;
	}

	public String getLogicalSystem() {
		return logicalSystem;
	}

	public void setLogicalSystem(String logicalSystem) {
		this.logicalSystem = logicalSystem;
	}

	public String getpOType() {
		return pOType;
	}

	public void setpOType(String pOType) {
		this.pOType = pOType;
	}

	public String getpOCreatedBy() {
		return pOCreatedBy;
	}

	public void setpOCreatedBy(String pOCreatedBy) {
		this.pOCreatedBy = pOCreatedBy;
	}

	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getVendorID() {
		return vendorID;
	}

	public void setVendorID(String vendorID) {
		this.vendorID = vendorID;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getIncoTerms() {
		return incoTerms;
	}

	public void setIncoTerms(String incoTerms) {
		this.incoTerms = incoTerms;
	}

	@Override
	public String toString() {
		return "Ticket [pONumber=" + pONumber + ", logicalSystem=" + logicalSystem + ", pOType=" + pOType
				+ ", pOCreatedBy=" + pOCreatedBy + ", poDate=" + poDate + ", currency=" + currency + ", vendorID="
				+ vendorID + ", paymentTerms=" + paymentTerms + ", incoTerms=" + incoTerms + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private int id;
	@Column(nullable = false)
	private String name;
	//@Column(nullable = false)
	@NotNull
	private Date currentdate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(Date currentdate) {
		this.currentdate = currentdate;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", name=" + name + ", currentdate=" + currentdate + "]";
	}
	
*/
}
