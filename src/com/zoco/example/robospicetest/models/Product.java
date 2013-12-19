package com.zoco.example.robospicetest.models;

import java.util.ArrayList;

import org.simpleframework.xml.Element;

import com.google.gson.Gson;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.zoco.example.robospicetest.http.ZocoClientService;

@DatabaseTable(tableName = "Product")
public class Product {

	@DatabaseField(generatedId = true)
	Long id;
	@Element
	Long store_id;
	@Element
	Integer brand_id;
	@Element
	String code;
	@Element
	String sku;
	@Element
	String model;
	@Element
	String name;
	@Element
	Integer stock;
	@Element
	Boolean unlimited;
	@Element
	Boolean digital;
	@Element
	Boolean visible;
	@Element
	String description;
	@Element
	Float price;
	@Element
	Float width;
	@Element
	Float height;
	@Element
	Float weight;
	@Element
	Float depth;
	@Element
	Boolean cylinder;
	String created_at;
	String updated_at;

	@SuppressWarnings("serial")
	public static class List extends ArrayList<Product> {
	}

	public Long getId() {
		return (null == id) ? 0L : id;
	}

	public void setId(Long id) {
		this.id = (null == id) ? 0L : id;
	}

	public Long getStore_id() {
		return (null == store_id) ? 0L : store_id;
	}

	public void setStore_id(Long store_id) {
		this.store_id = (null == store_id) ? 0L : store_id;
	}

	public Integer getBrand_id() {
		return (null == brand_id) ? 0 : brand_id;
	}

	public void setBrand_id(Integer brand_id) {
		this.brand_id = (null == brand_id) ? 0 : brand_id;
	}

	public String getCode() {
		return (null == code) ? "" : code;
	}

	public void setCode(String code) {
		this.code = (null == code) ? "" : code;
	}

	public String getSku() {
		return (null == sku) ? "" : sku;
	}

	public void setSku(String sku) {
		this.sku = (null == sku) ? "" : sku;
		;
	}

	public String getModel() {
		return (null == model) ? "" : model;
	}

	public void setModel(String model) {
		this.model = (null == model) ? "" : model;
	}

	public String getName() {
		return (null == name) ? "" : name;
	}

	public void setName(String name) {
		this.name = (null == name) ? "" : name;
	}

	public Integer getStock() {
		return (null == stock) ? 0 : stock;
	}

	public void setStock(Integer stock) {
		this.stock = (null == stock) ? 0 : stock;
	}

	public Boolean getUnlimited() {
		return (null == unlimited) ? false : unlimited;
	}

	public void setUnlimited(Boolean unlimited) {
		this.unlimited = (null == unlimited) ? false : unlimited;
	}

	public Boolean getDigital() {
		return (null == digital) ? false : digital;
	}

	public void setDigital(Boolean digital) {
		this.digital = (null == digital) ? false : digital;
	}

	public Boolean getVisible() {
		return (null == visible) ? false : visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = (null == visible) ? false : visible;
	}

	public String getDescription() {
		return (null == description) ? "" : description;
	}

	public void setDescription(String description) {
		this.description = (null == description) ? "" : description;
	}

	public Float getPrice() {
		return (null == price) ? 0.0F : price;
	}

	public void setPrice(Float price) {
		this.price = (null == price) ? 0.0F : price;
	}

	public Float getWidth() {
		return (null == width) ? 0.0F : width;
	}

	public void setWidth(Float width) {
		this.width = (null == width) ? 0.0F : width;
	}

	public Float getHeight() {
		return (null == height) ? 0.0F : height;
	}

	public void setHeight(Float height) {
		this.height = (null == height) ? 0.0F : height;
	}

	public Float getWeight() {
		return (null == weight) ? 0.0F : weight;
	}

	public void setWeight(Float weight) {
		this.weight = (null == weight) ? 0.0F : weight;
	}

	public Float getDepth() {
		return (null == depth) ? 0.0F : depth;
	}

	public void setDepth(Float depth) {
		this.depth = (null == depth) ? 0.0F : depth;
	}

	public Boolean getCylinder() {
		return (null == cylinder) ? false : cylinder;
	}

	public void setCylinder(Boolean cylinder) {
		this.cylinder = (null == cylinder) ? false : cylinder;
	}

	public String getCreated_at() {
		return (null == created_at) ? "" : created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = (null == created_at) ? "" : created_at;
	}

	public String getUpdated_at() {
		return (null == updated_at) ? "" : updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = (null == updated_at) ? "" : updated_at;
	}

	public Product() {
	}

	@Override
	public String toString() {
		return String.format("%s \n %s", this.getName(), this.getCode());
	}

	public String toJSON() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public final String getUrl() {
		return ZocoClientService.API_URL + "products/" + this.id;
	}
}