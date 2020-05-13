package com.hexaware.hackathon.aldia.socialworker;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="social_worker")
public class SocialWorker {
	@Id
	@Column(name="id_social_worker")
	private String idSocialWorker;
	
	@Column(name="name_social_worker")
	private String nameSocialWorker;
	
	@Column(name="dob")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date DOB;
	
	@Column(name="celular_phone")
	private String celularPhone;
	
	public SocialWorker()
	{
	}

	public SocialWorker(String idSocialWorker, String nameSocialWorker, Date dOB, String celularPhone) {
		super();
		this.idSocialWorker = idSocialWorker;
		this.nameSocialWorker = nameSocialWorker;
		DOB = dOB;
		this.celularPhone = celularPhone;
	}

	public String getIdSocialWorker() {
		return idSocialWorker;
	}

	public void setIdSocialWorker(String idSocialWorker) {
		this.idSocialWorker = idSocialWorker;
	}

	public String getNameSocialWorker() {
		return nameSocialWorker;
	}

	public void setNameSocialWorker(String nameSocialWorker) {
		this.nameSocialWorker = nameSocialWorker;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getCelularPhone() {
		return celularPhone;
	}

	public void setCelular_phone(String celularPhone) {
		this.celularPhone = celularPhone;
	}

	@Override
	public String toString() {
		return "SocialWorker [idSocialWorker=" + idSocialWorker + ", nameWorker=" + nameSocialWorker + ", DOB=" + DOB
				+ ", celularPhone=" + celularPhone + "]";
	}
	
}
