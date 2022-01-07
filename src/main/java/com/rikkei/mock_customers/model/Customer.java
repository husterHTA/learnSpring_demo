package com.rikkei.mock_customers.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

//Tạo 1 polo để kết nối với database
@Entity		//
@Table(name = "customers")	//Nếu không có thì tên class đồng nghĩa với tên bảng trong database	//bao gồm các tính năng của @ToString, @EqualsAndHashCode , @Getter / @Setter và @RequiredArgsConstructor
public class Customer {
	@Id		//set primary-key trong db
	@GeneratedValue(strategy = GenerationType.AUTO)		//set auto crement trong db
	@Column(name = "id")		//set column
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "point")
	private int point;
	
	@Column(name = "created_at")
	@CreationTimestamp
	private Timestamp created_at;
	
	@Column(name = "updated_at")
	@UpdateTimestamp
	private Timestamp updated_at;
	
	public Customer() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
}

