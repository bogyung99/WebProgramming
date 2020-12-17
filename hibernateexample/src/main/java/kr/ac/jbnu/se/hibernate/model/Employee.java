package kr.ac.jbnu.se.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="address")
	private String address;
	
	public Employee() {
	}

	public Employee(Integer id, String name, Integer age, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Employee(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee: " + this.id + ", " + this.name + ", " + this.age + ", " + this.address; 
	}
	
}
