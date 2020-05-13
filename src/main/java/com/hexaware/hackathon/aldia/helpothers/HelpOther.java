package com.hexaware.hackathon.aldia.helpothers;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Help_Others")
public class HelpOther {
	@Id
	@Column(name="help_other")
	private String idHelpOther;
	
	@Column(name="name_person")
	private String namePerson;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="address")
	private String address;
	
	@Column(name="help_other_date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateHelpOther;
	
	@Column(name="street_left")
	private String streetLeft;
	
	@Column(name="street_right")
	private String streetRight;
	
	@Column(name="street_indicator")
	private String streetIndicator;
	
	@Column(name="ticket_status")
	private String ticketStatus;
	
	@ManyToOne
	@JoinColumn(name="curp", insertable=true, updatable=false)
	private String curp;
	
	@ManyToOne
	@JoinColumn(name="id_social_worker", insertable=true, updatable=false)
	private String idSocialWorker;
	
	public HelpOther()
	{
	}


	public HelpOther(String idHelpOther, String namePerson, String phone, String address, Date dateHelpOther,
			String streetLeft, String streetRight, String streetIndicator, String ticketStatus, String curp,
			String idSocialWorker) {
		super();
		this.idHelpOther = idHelpOther;
		this.namePerson = namePerson;
		this.phone = phone;
		this.address = address;
		this.dateHelpOther = dateHelpOther;
		this.streetLeft = streetLeft;
		this.streetRight = streetRight;
		this.streetIndicator = streetIndicator;
		this.ticketStatus = ticketStatus;
		this.curp = curp;
		this.idSocialWorker = idSocialWorker;
	}


	public String getIdHelpOther() {
		return idHelpOther;
	}


	public void setIdHelpOther(String idHelpOther) {
		this.idHelpOther = idHelpOther;
	}


	public String getNamePerson() {
		return namePerson;
	}


	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Date getDateHelpOther() {
		return dateHelpOther;
	}


	public void setDateHelpOther(Date dateHelpOther) {
		this.dateHelpOther = dateHelpOther;
	}


	public String getStreetLeft() {
		return streetLeft;
	}


	public void setStreetLeft(String streetLeft) {
		this.streetLeft = streetLeft;
	}


	public String getStreetRight() {
		return streetRight;
	}


	public void setStreetRight(String streetRight) {
		this.streetRight = streetRight;
	}


	public String getStreetIndicator() {
		return streetIndicator;
	}


	public void setStreetIndicator(String streetIndicator) {
		this.streetIndicator = streetIndicator;
	}


	public String getTicketStatus() {
		return ticketStatus;
	}


	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}


	public String getCurp() {
		return curp;
	}


	public void setCurp(String curp) {
		this.curp = curp;
	}


	public String getIdSocialWorker() {
		return idSocialWorker;
	}


	public void setIdSocialWorker(String idSocialWorker) {
		this.idSocialWorker = idSocialWorker;
	}


	@Override
	public String toString() {
		return "HelpOther [idHelpOther=" + idHelpOther + ", namePerson=" + namePerson + ", phone=" + phone
				+ ", address=" + address + ", dateHelpOther=" + dateHelpOther + ", streetLeft=" + streetLeft
				+ ", streetRight=" + streetRight + ", streetIndicator=" + streetIndicator + ", ticketStatus="
				+ ticketStatus + ", curp=" + curp + ", idSocialWorker=" + idSocialWorker + "]";
	}
	
}
