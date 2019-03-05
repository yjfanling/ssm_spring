package com.catherine.bean;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class MyCollection {
	//Array
	private Object[] array;
	//List
	private List list;
	//Set
	private Set set;
	//Map
	private Map map;
	//Properties
	private Properties properties;
	public Object[] getArray() {
		return array;
	}
	public void setArray(Object[] array) {
		this.array = array;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "MyCollection [array=" + Arrays.toString(array) + ", list=" + list + ", set=" + set + ", map=" + map
				+ ", properties=" + properties + "]";
	}
	
}
