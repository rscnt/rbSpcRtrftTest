package com.zoco.example.robospicetest.models;

import org.simpleframework.xml.Element;

import com.google.gson.Gson;
import com.j256.ormlite.field.DatabaseField;

public class Currency_value {

	@DatabaseField(generatedId = true)
	private String name;
	@DatabaseField(unique = true)
	private String code;
	@Element
	private String symbol;

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

	/**
	 * @return the symbol
	 */
	public synchronized String getSymbol() {
		return symbol;
	}

	/**
	 * @param symbol
	 *            the symbol to set
	 */
	public synchronized void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String toJSON() {
		return new Gson().toJson(Currency_value.class);
	}

}
