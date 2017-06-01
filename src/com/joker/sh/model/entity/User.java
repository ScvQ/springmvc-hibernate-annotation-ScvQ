package com.joker.sh.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_user")
public class User {
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")    
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")   
	@Column(name="c_id",nullable=false,unique=true,length=32)
	private String id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_age")
	private Integer age;
	
	@Column(name="c_sex")
	private Integer sex;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
}
