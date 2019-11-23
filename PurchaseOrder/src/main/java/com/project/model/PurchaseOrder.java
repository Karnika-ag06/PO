  
package com.project.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Table_Purchaseorder")
public class PurchaseOrder {
	
	@Id
	@GeneratedValue
	@Column(name="purchaseorder_id")
	private int poId;
	
	@Column(name="purchaseorder_name")
    private String poName;
	
	@Column(name="products_id")
    private int productsId;
    
	@Column(name="buyer_id")
    private int buyerId;

	@Column(name="purchaseorder_status")
    private String status;
    
	@Column(name="created_date")
    private LocalDate createdDate;

	@Column(name="purchaseorder_quantity")
    private int quantity;

	@Override
	public String toString() {
		return "PurchaseOrder [poId=" + poId + ", poName=" + poName + ", productsId=" + productsId + ", buyerId="
				+ buyerId + ", status=" + status + ", createdDate=" + createdDate + ", quantity=" + quantity + "]";
	}

	public int getPoId() {
		return poId;
	}

	public void setPoId(int poId) {
		this.poId = poId;
	}

	public String getPoName() {
		return poName;
	}

	public void setPoName(String poName) {
		this.poName = poName;
	}

	public int getProductsId() {
		return productsId;
	}

	public void setProductsId(int productsId) {
		this.productsId = productsId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
    