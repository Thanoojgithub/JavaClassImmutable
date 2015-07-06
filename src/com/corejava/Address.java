package com.corejava;

public final class Address {

	private final Integer Dno;
	private final String street;
	private final String city;
	private final String sate;
	private final String country;

	private Address(Integer dno, String street, String city, String sate, String country) {
		super();
		Dno = dno;
		this.street = street;
		this.city = city;
		this.sate = sate;
		this.country = country;
	}

	/**
	 * create a new instance of Address
	 * @param dno
	 * @param street
	 * @param city
	 * @param sate
	 * @param country
	 * @return
	 */
	public static Address createNewInstance(Integer dno, String street,
			String city, String sate, String country) {
		return new Address(dno, street, city, sate, country);
	}

	public Integer getDno() {
		return Dno;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getSate() {
		return sate;
	}

	public String getCountry() {
		return country;
	}
}
