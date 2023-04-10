package com.Shoppingmall.OM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class OrderModule {

	
	private int id;
	private String dateofpurchase;
	private float total;
	private String customerId;
	private String paymentmode;
	private  String shopId;
	
	
	
	
	
	public OrderModule() {
		super();
	}





	public OrderModule(int id, String dateofpurchase, float total, String customerId, String paymentmode, String shopId) {
		super();
		this.id = id;
		this.dateofpurchase = dateofpurchase;
		this.total = total;
		this.customerId = customerId;
		this.paymentmode = paymentmode;
		this.shopId = shopId;
	}




	@Id
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getDateofpurchase() {
		return dateofpurchase;
	}





	public void setDateofpurchase(String dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}





	public float getTotal() {
		return total;
	}





	public void setTotal(float total) {
		this.total = total;
	}





	public String getCustomerId() {
		return customerId;
	}





	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}





	public String getPaymentmode() {
		return paymentmode;
	}





	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}





	public String getShopId() {
		return shopId;
	}





	public void setShopId(String shopId) {
		this.shopId = shopId;
	}





	@Override
	public String toString() {
		return "Order [id=" + id + ", dateofpurchase=" + dateofpurchase + ", total=" + total + ", customerId="
				+ customerId + ", paymentmode=" + paymentmode + ", shopId=" + shopId + "]";
	}






























}
