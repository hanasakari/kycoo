package com.kycoo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author ����
 *
 *	�����࣬�������еĻ�����Ϣ
 */

@Entity
@Table(name="tb_city")
public class City {
	
	@Id
	@Column(length=10)
	private String id;//����id
	
	private String cityName;//��������
	
	private Double longitude;//����
	private Double latitude;//γ��
	
	@ManyToOne
	@JoinColumn(name="pid")
	private Province province; //ʡ

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	
	
	
}