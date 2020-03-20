package com.jeepin.cache.app;

import java.io.Serializable;
/**
 * Note: 
 * 	Only Objects implement  the Serializable interface  can  have any of their state serialized or deserialized. 
 * @author Flint
 *
 */
public class TestVO implements Serializable{
		/**
		 * serialVersionUID
		 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Po [name=" + name + "]";
	}
	
}
