package sh.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String mobile;
	@Column
	private String address;
	@Column
	private String email;
	@Column
	private Date birth;

	public Customer() {
	}

	public Customer(int id, String name, String password, String mobile, String address, String email, Date birth) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
		this.birth = birth;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return String.format("Customer [id=%s, name=%s, password=%s, mobile=%s, address=%s, email=%s, birth=%s]", id,
				name, password, mobile, address, email, birth);
	}
}
