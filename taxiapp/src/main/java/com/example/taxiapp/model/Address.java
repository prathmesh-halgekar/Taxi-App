package com.example.taxiapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "address" )
public class Address extends BaseEntity{
	
	@Id
	private int id;
	@Column(name = "Street_number")
	private String streetNumber;
	@Column(name = "Zip_code")
	private String zipCode;
	@Column(name = "Location_Detail")
	private String locationDetail;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Suburb_id")
	private Suburb suburb;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getLocationDetail() {
		return locationDetail;
	}
	public void setLocationDetail(String locationDetail) {
		this.locationDetail = locationDetail;
	}
	public Suburb getSuburb() {
		return suburb;
	}
	public void setSuburb(Suburb suburb) {
		this.suburb = suburb;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id;
		result = prime * result + ((locationDetail == null) ? 0 : locationDetail.hashCode());
		result = prime * result + ((streetNumber == null) ? 0 : streetNumber.hashCode());
		result = prime * result + ((suburb == null) ? 0 : suburb.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		Address other = (Address) obj;
		if (id != other.id)
			return false;
		if (locationDetail == null) {
			if (other.locationDetail != null)
				return false;
		} else if (!locationDetail.equals(other.locationDetail))
			return false;
		if (streetNumber == null) {
			if (other.streetNumber != null)
				return false;
		} else if (!streetNumber.equals(other.streetNumber))
			return false;
		if (suburb == null) {
			if (other.suburb != null)
				return false;
		} else if (!suburb.equals(other.suburb))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", streetNumber=" + streetNumber + ", zipCode=" + zipCode + ", locationDetail="
				+ locationDetail + ", suburb=" + suburb + "]";
	}
	
	

}
