package com.sigma.Dc.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int productId;
	
	private String productName; 
	
	private int volume;
	
	
	private float marketCapital;
	
	
	private float creditRating;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public float getMarketCapital() {
		return marketCapital;
	}

	public void setMarketCapital(float marketCapital) {
		this.marketCapital = marketCapital;
	}

	public float getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(float creditRating) {
		this.creditRating = creditRating;
	}

	public Product(int productId, String productName, int volume, float marketCapital, float creditRating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.volume = volume;
		this.marketCapital = marketCapital;
		this.creditRating = creditRating;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", volume=" + volume
				+ ", marketCapital=" + marketCapital + ", creditRating=" + creditRating + "]";
	}
	
}
