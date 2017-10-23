package com.vines.mybatis.pojo;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Component
@JsonRootName(value = "user")
@JacksonXmlRootElement(localName = "user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2675335889337363162L;
	
	private int id;
	private String name;
	private String sex;
	
	public User() {
		super();
	}
	public User(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", sex=" + sex + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
