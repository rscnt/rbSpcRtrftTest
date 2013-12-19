package com.zoco.example.robospicetest.models;

import com.google.gson.Gson;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Country")
public class Country {

	@DatabaseField(generatedId = true)
	private Long id;
	@DatabaseField
	private Currency_value currency_value;
	@DatabaseField
	private String name;
	@DatabaseField
	private String code;

	/**
	 * @return the id
	 */
	public synchronized Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public synchronized void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the currency_value
	 */
	public synchronized Currency_value getCurrency_value() {
		return currency_value;
	}

	/**
	 * @param currency_value
	 *            the currency_value to set
	 */
	public synchronized void setCurrency_value(Currency_value currency_value) {
		this.currency_value = currency_value;
	}

	/**
	 * @return the name
	 */
	public synchronized String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public synchronized void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public synchronized String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public synchronized void setCode(String code) {
		this.code = code;
	}

	public String toJSON() {
		return new Gson().toJson(this);
	}
}
