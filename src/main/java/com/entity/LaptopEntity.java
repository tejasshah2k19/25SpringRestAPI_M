package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "laptops")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LaptopEntity {

	@Id
	Integer laptopId;
	String modelName;

}
