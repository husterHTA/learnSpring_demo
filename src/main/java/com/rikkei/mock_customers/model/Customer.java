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
@Table(name = "customers")	//Nếu không có thì tên class đồng nghĩa với tên bảng trong database
@Data		//bao gồm các tính năng của @ToString, @EqualsAndHashCode , @Getter / @Setter và @RequiredArgsConstructor
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
}

