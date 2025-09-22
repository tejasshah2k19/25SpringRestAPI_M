package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Entity
@Table(name="products3")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductEntity {

	//pk ? 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer productId;
	
	String productName;
	
	Integer price;
	Integer qty;
	@Column(length = 50,unique = true,nullable = false)
	String category;
}
