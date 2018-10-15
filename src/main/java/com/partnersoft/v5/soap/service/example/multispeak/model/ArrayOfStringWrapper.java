package com.partnersoft.v5.soap.service.example.multispeak.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.partnersoft.v5.soap.service.example.multispeak.model.ArrayOfString;



/**
 * Wrapper for the {@link ArrayOfString18} object.
 * <br><br>
 * Copyright 2017 Partner Software, Inc.
 * @author Lane Chasteen
 */
public class ArrayOfStringWrapper {
	//-- properties --//
	private final List<String> resultList;
	
	//-- constructors --//
	/**
	 * Creates a new GetMethodsResponseArray. 
	 * @param array - {@link ArrayOfString18} for result values.
	 */
	public ArrayOfStringWrapper(ArrayOfString array) {
		this(array.getString());
	}
	
	/**
	 * Creates a new GetMethodsResponseArray. 
	 * @param values - {@link List} for result values.
	 */
	public ArrayOfStringWrapper(List<String> values) {
		List<String> tempList = new ArrayList<>();
		if (values != null && !values.isEmpty()) {
			tempList.addAll(values);
		}
		if (tempList.isEmpty()) {
			resultList = Collections.emptyList();
		}
		else {
			resultList = Collections.unmodifiableList(tempList);
		}
	}
	
	//-- GetMethodsResponseArray methods --//
	/**
	 * Returns the unmodifiable {@link List} of {@code String} 
	 * results or an {@link Collections#emptyList()} if no 
	 * results are found.
	 * @return The unmodifiable {@link List} of {@code String} 
	 * results or an {@link Collections#emptyList()} if no 
	 * results are found.
	 */
	public List<String> getList() {
		return resultList;
	}
	
	/**
	 * Returns the {@link ArrayOfString18} object for this
	 * container.
	 * @return The {@link ArrayOfString18} object for this
	 * container.
	 */
	public ArrayOfString getValue() {
		ArrayOfString value = new ArrayOfString();
		value.string = new ArrayList<>(resultList);
		return value;
	}
}
