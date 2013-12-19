package com.zoco.example.robospicetest.models;

import org.simpleframework.xml.Element;

import com.google.gson.Gson;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

// TODO: Implement a base Model for Entities
@DatabaseTable(tableName = "Store")
public class Store {

	@DatabaseField(generatedId = true)
	private Long id;
	@Element
	private String code;
	@Element
	private String tag_name;
	@Element
	private String name;
	@Element
	private String logo;
	@Element
	private String description;
	@Element
	private Boolean active;
	@Element
	private Boolean visible;

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
	 * @return the tag_name
	 */
	public synchronized String getTag_name() {
		return tag_name;
	}

	/**
	 * @param tag_name
	 *            the tag_name to set
	 */
	public synchronized void setTag_name(String tag_name) {
		this.tag_name = tag_name;
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
	 * @return the logo
	 */
	public synchronized String getLogo() {
		return logo;
	}

	/**
	 * @param logo
	 *            the logo to set
	 */
	public synchronized void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the description
	 */
	public synchronized String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public synchronized void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the active
	 */
	public synchronized Boolean getActive() {
		return active;
	}

	/**
	 * @param active
	 *            the active to set
	 */
	public synchronized void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * @return the visible
	 */
	public synchronized Boolean getVisible() {
		return visible;
	}

	/**
	 * @param visible
	 *            the visible to set
	 */
	public synchronized void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public String toJSON() {
		return new Gson().toJson(this);
	}

}
