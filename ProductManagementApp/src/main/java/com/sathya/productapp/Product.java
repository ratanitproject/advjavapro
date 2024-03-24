package com.sathya.productapp;

import java.sql.Date;

public class Product {
	private String proId;
    private String ProName;
    private double proPrice;
    private String proBrand;
    private String proMadeIn;
    private Date proMfgDate;
    private Date proExpDate;
    private byte[] proImage;
    
	/*
	 * //To work with image data private byte[] imageWork;
	 * 
	 * public String getImageWork() { //conversion of byte[] to String return
	 * Base64.getEncoder().encodeToString(imageWork); } public void
	 * setImageWork(byte[] imageWork) { this.imageWork = imageWork; }
	 */
	
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getProMfgDate() {
		return proMfgDate;
	}
	public void setProMfgDate(Date proMfgDate) {
		this.proMfgDate = proMfgDate;
	}
	public Date getProExpDate() {
		return proExpDate;
	}
	public void setProExpDate(Date proExpDate) {
		this.proExpDate = proExpDate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}    
}
