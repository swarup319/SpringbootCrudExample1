package com.crud.Example2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data     //imports lombok which creates getter,setter automatically
@AllArgsConstructor
@Entity    // represents the class as entity
@Table(name="product_table")   // creates table in DB
public class Product {
	@Id                        // Represents as primary key
	@GeneratedValue            // automatically generates the id 
	private int id;
	private String name;
	private int quantity;
	private double price;
	public Product(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
