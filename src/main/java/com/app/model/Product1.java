package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product1 {

	@Id
	private Integer prodId;
	private String prodCode;
	private String prodModel;
	private String prodVendor;
	private Double prodCost;
	
	public Product1() {
		super();
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdModel() {
		return prodModel;
	}

	public void setProdModel(String prodModel) {
		this.prodModel = prodModel;
	}

	public String getProdVendor() {
		return prodVendor;
	}

	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	@Override
	public String toString() {
		return "Product1 [prodId=" + prodId + ", prodCode=" + prodCode + ", prodModel=" + prodModel + ", prodVendor="
				+ prodVendor + ", prodCost=" + prodCost + "]";
	}

	
}
