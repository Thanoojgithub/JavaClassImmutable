package com.corejava;

import java.util.Calendar;
import java.util.HashMap;

public class CorejavaOne {

	public static void main(String[] args) {

		Address address = Address.createNewInstance(100, "Harishchandra Ghat",
				"Varanasi", "Uttar Pradesh", "IN");
		HashMap<String, Address> addr = new HashMap<String, Address>();
		addr.put("1", address);
		CustImmutable custImmutable = CustImmutable.createNewInstance(10,
				"Thanooj Kalathuru", Calendar.getInstance().getTime(), addr);

		System.out.println(custImmutable.getDoj());
		custImmutable.getDoj().setTime(100000);
		System.out.println(custImmutable.getDoj());
		custImmutable.getaddr().put("1", address);
	}

}
