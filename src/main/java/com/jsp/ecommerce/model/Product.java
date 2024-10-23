package com.jsp.ecommerce.model;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

//import lombok.Data;
//import lombok.AllArgsConstructor;
//
//import lombok.NoArgsConstructor;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor

@Entity
//@Table(name= "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String brand;
	private double price; 
	private String category;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	private java.sql.Date releaseDate;
	private boolean productAvaliable;
	private int StockQuantity;
	private String imageName;
	private String imageType;
	@Lob
	private byte[] imageDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public java.sql.Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(java.sql.Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isAvaliable() {
		return productAvaliable;
	}
	public void setAvaliable(boolean avaliable) {
		this.productAvaliable = avaliable;
	}
	public int getQuantity() {
		return StockQuantity;
	}
	public void setQuantity(int quantity) {
		this.StockQuantity = quantity;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public byte[] getImageDate() {
		return imageDate;
	}
	public void setImageDate(byte[] imageDate) {
		this.imageDate = imageDate;
	}
	public Product(String name, String description, String brand, double price, String category,
			java.sql.Date releaseDate, boolean avaliable, int quantity, String imageName, String imageType,
			byte[] imageDate) {
		super();
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.releaseDate = releaseDate;
		this.productAvaliable = avaliable;
		this.StockQuantity = quantity;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imageDate = imageDate;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", price="
				+ price + ", category=" + category + ", releaseDate=" + releaseDate + ", avaliable=" + productAvaliable
				+ ", quantity=" + StockQuantity + ", imageName=" + imageName + ", imageType=" + imageType + ", imageDate="
				+ Arrays.toString(imageDate) + "]";
	}	
	
	
}
