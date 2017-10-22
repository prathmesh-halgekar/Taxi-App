package com.example.taxiapp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "bookings" )
public class Booking extends BaseEntity{
	
	@Id
	private int id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Customer_id")
	private Customer customer;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Source_id")
	private Address sourceId;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Destination_id")
	private Address destinationId;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Payment_id")
	private Payment payment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getSourceId() {
		return sourceId;
	}
	public void setSourceId(Address sourceId) {
		this.sourceId = sourceId;
	}
	public Address getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(Address destinationId) {
		this.destinationId = destinationId;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((destinationId == null) ? 0 : destinationId.hashCode());
		result = prime * result + id;
		result = prime * result + ((payment == null) ? 0 : payment.hashCode());
		result = prime * result + ((sourceId == null) ? 0 : sourceId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Booking other = (Booking) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (destinationId == null) {
			if (other.destinationId != null)
				return false;
		} else if (!destinationId.equals(other.destinationId))
			return false;
		if (id != other.id)
			return false;
		if (payment == null) {
			if (other.payment != null)
				return false;
		} else if (!payment.equals(other.payment))
			return false;
		if (sourceId == null) {
			if (other.sourceId != null)
				return false;
		} else if (!sourceId.equals(other.sourceId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", customer=" + customer + ", sourceId=" + sourceId + ", destinationId="
				+ destinationId + ", payment=" + payment + "]";
	}
	
	
}
