package com.corejava;

import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class CustImmutable {

	/**
	 * Integer class is immutable as it does not provide any setter to change
	 * its content
	 * */
	private final Integer cId;
	/**
	 * String class is immutable as it also does not provide setter to change
	 * its content
	 * */
	private final String cName;
	/**
	 * Date class is mutable as it provide setters to change various date/time
	 * parts
	 * */
	private final Date doj;
	/**
	 * Map class is mutable
	 * */
	private final Map<String, Address> addr;

	// Default private constructor will ensure no unplanned construction of
	// class
	private CustImmutable(Integer cId, String cName, Date doj,
			Map<String, Address> map) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.doj = doj;
		this.addr = map;
	}

	/**
	 * factory method, to create a new instance of CustImmutable
	 * 
	 * @param cId
	 * @param cName
	 * @param doj
	 * @param addr
	 * @return
	 */
	public static CustImmutable createNewInstance(Integer cId, String cName,
			Date doj, HashMap<String, Address> addr) {
		/**
		 * Date class is mutable so we need a little care here. We should not
		 * set the reference of original instance variable. Instead,
		 * Calendar.getInstance(), with content copied to it, should be
		 * returned.
		 *
		 * Map's are mutable so we need a little care here. We should not set
		 * the reference of original instance variable. Instead,
		 * Collections.unmodifiableMap(Map), with content copied to it, should
		 * be returned.
		 * 
		 * */
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(doj.getTime());
		Map<String, Address> addrLoc = Collections.unmodifiableMap(addr);
		return new CustImmutable(cId, cName, calendar.getTime(), addrLoc);
	}

	public Integer getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public Map<String, Address> getaddr() {
		return addr;
	}

	/**
	 * Date class is mutable so we need a little care here. We should not return
	 * the reference of original instance variable. Instead a
	 * Calendar.getInstance(), with content copied to it, should be returned.
	 * */
	public Date getDoj() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(doj.getTime());
		return calendar.getTime();
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "CustImmutable [cId=" + cId + ", cName=" + cName + ", doj="
				+ doj + ", addr="
				+ (addr != null ? toString(addr.entrySet(), maxLen) : null)
				+ "]";
	}

	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext()
				&& i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}

}
