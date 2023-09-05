/**
 * 
 */
package ita.app.dto;

import ita.app.dto.generic.Data;
import ita.app.interfaces.Acceptable;

/**
 * ITAssist User acceptable dto
 * 
 * @author Varun Kaushik
 */
public final class Employee extends Data implements Acceptable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String firstName;
	private final String lastName;
	private int department;

	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the department
	 */
	public int getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(int department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + "]";
	}

	
}
