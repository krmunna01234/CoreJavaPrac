package com.mk.general;

import java.util.Date;

public class Employee {

	private String id;
	private String FirstName;
	private String LastName;
	private String email;
	private long phone;
	private Date DOB;

	public Employee(String id, String firstName, String lastName, String email,
			long phone, Date dOB) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.phone = phone;
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", email=" + email + ", phone="
				+ phone + ", DOB=" + DOB + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		Employee emp = (Employee) obj;
		return (emp.id == this.id || emp.id.equals(this.id))
				&& (emp.FirstName == this.FirstName || emp.FirstName
						.equals(this.FirstName));
	}

	@Override
	public int hashCode() {
		int hash = (this.id == null ? 0 : this.id.hashCode())
				+ (this.FirstName == null ? 0 : this.FirstName.hashCode());
		return hash;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

}
