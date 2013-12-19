package com.zoco.example.robospicetest.models;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.zoco.example.robospicetest.http.ZocoClientService;

@DatabaseTable(tableName = "User")
public class User {

	@DatabaseField(generatedId = true)
	private Long id;
	@DatabaseField(dataType=DataType.STRING)
	private Long country_id;
	@DatabaseField
	private Long language_id;
	@DatabaseField
	private Long timezone_id;
	@DatabaseField
	private String code;
	@DatabaseField
	private String username;
	@DatabaseField
	private String first_name;
	@DatabaseField
	private String password;
	@DatabaseField
	private String last_name;
	@DatabaseField
	private String email;
	@DatabaseField
	private String birth_date;
	@DatabaseField
	private Boolean gender;
	@DatabaseField
	private Boolean terms_accepted;

	public User() {
	}

	@SuppressWarnings({ "serial" })
	public static class List extends ArrayList<User> {

	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the country_id
	 */
	public Long getCountry_id() {
		return country_id;
	}

	/**
	 * @param country_id
	 *            the country_id to set
	 */
	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	/**
	 * @return the language_id
	 */
	public Long getLanguage_id() {
		return language_id;
	}

	/**
	 * @param language_id
	 *            the language_id to set
	 */
	public void setLanguage_id(Long language_id) {
		this.language_id = language_id;
	}

	/**
	 * @return the timezone_id
	 */
	public Long getTimezone_id() {
		return timezone_id;
	}

	/**
	 * @param timezone_id
	 *            the timezone_id to set
	 */
	public void setTimezone_id(Long timezone_id) {
		this.timezone_id = timezone_id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name
	 *            the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name
	 *            the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the birth_date
	 */
	public String getBirth_date() {
		return birth_date;
	}

	/**
	 * @param birth_date
	 *            the birth_date to set
	 */
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	/**
	 * @return the gender
	 */
	public Boolean getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	/**
	 * @return the terms_accepted
	 */
	public Boolean getTerms_accepted() {
		return terms_accepted;
	}

	/**
	 * @param terms_accepted
	 *            the terms_accepted to set
	 */
	public void setTerms_accepted(Boolean terms_accepted) {
		this.terms_accepted = terms_accepted;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String
				.format("%s %s", this.getFirst_name(), this.getLast_name());
	}

	public String toJSON() {
		Gson gson = new Gson();
		System.out.println("\n" + gson.toJson(this) + "\n");
		return "{\"user\":" + gson.toJson(this) + "}";
	}

	public String getUrl() {
		return ZocoClientService.API_URL + "users/" + this.id;
	}

	public Boolean isNew() {
		return (this.getId() == null) ? true : false;
	}

}
