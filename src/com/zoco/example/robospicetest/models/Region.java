package com.zoco.example.robospicetest.models;

import org.simpleframework.xml.Element;

import com.google.gson.Gson;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Region")
public class Region {
	@DatabaseField(generatedId = true)
	private Country country;
	@Element
	private String name;
	@Element
	private String code;

	/**
	 * @return the country
	 */
	public synchronized Country getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public synchronized void setCountry(Country country) {
		this.country = country;
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

	// TODO: Implement a base class for models.
	public String toJSON() {
		return new Gson().toJson(this);
	}
}
