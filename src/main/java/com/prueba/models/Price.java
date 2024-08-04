package com.prueba.models;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prices")
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int brandId;
	private Timestamp startDate;
	private Timestamp endDate;
	private int priceList;
	private int productId;
	private int priority;
	private double price;
	private String curr;
	
	public Price(int brandId, Timestamp start_date, Timestamp end_date, int priceList, int product_id, int priority,
			double price, String curr) {
		super();
		this.brandId = brandId;
		this.startDate = start_date;
		this.endDate = end_date;
		this.priceList = priceList;
		this.productId = product_id;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}
	
	

	public Price() {
		super();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public int getPriceList() {
		return priceList;
	}

	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}



	@Override
	public String toString() {
		return "Price [id=" + id + ", brandId=" + brandId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", priceList=" + priceList + ", productId=" + productId + ", priority=" + priority + ", price="
				+ price + ", curr=" + curr + "]";
	}
	
	
	
		
}
