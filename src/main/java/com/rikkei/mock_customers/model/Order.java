package com.rikkei.mock_customers.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "customers")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "store_id")
	private int store_id; 
	
	@Column(name = "customer_id")
	private int customer_id;
	
	@Column(name = "receiver_name")
	private String receiver_name;
	
	@Column(name = "receiver_phone")
	private int receiver_phone;
	
	@Column(name = "receiver_address")
	private String receiver_address; 
	
	@Column(name = "promotion_id")
	private int promotion_id; 
	
	@Column(name = "shipping_unit_id")
	private int shipping_unit_id; 
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "payment_method")
	private int payment_method;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "payment_status")
	private int payment_status;
	
	@Column(name = "created_at")
	@CreationTimestamp
    private Timestamp created_at;
	
    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updated_at;
}
