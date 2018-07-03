package com.rest.webservices.restfulwebservices.User;

import java.util.Date;
import javax.validation.constraints.Size;
import javax.validation.constraints.Past;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Details about the user")
public class User {
	
	private Integer id;
	
	@Size(min=2,message="Name should have atleast 2 characters")
	@ApiModelProperty(notes="Name should have atleast 2 characters")
	private String name;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Past
	@ApiModelProperty(notes="Birth date should be in past not in current/future")
	private Date birthDate;
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	

}
