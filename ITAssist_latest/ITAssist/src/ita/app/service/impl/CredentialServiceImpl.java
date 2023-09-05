/**
 * 
 */
package ita.app.service.impl;

import ita.app.collection.Departments;
import ita.app.dto.Employee;
import ita.app.service.CredentialService;
import ita.app.utils.ITAssistUtil;

/**
 * Service implementation of Credentials Generation service
 * @author Varun Kaushik
 */
public class CredentialServiceImpl implements CredentialService {

	private String employeePassword;
	private String employeeEmail;

	@Override
	public void generateEmailAddress(Employee employee) {

		StringBuilder employeeEmail = new StringBuilder();

		employeeEmail.append(employee.getFirstName().toLowerCase());
		employeeEmail.append(employee.getLastName().toLowerCase());
		employeeEmail.append("@");
		employeeEmail.append(getDepartmentEmailAbbreviationFromId(employee.getDepartment()).toLowerCase()).append(".");
		employeeEmail.append("abc.com");

		setEmployeeEmail(employeeEmail.toString());
	}

	@Override
	public String showCredentials() {
		StringBuilder displayCredentials = new StringBuilder();
		displayCredentials.append("Email --> " + getEmployeeEmail() + " \n");
		displayCredentials.append("Password --> " + getEmployeePassword() + " \n");
		return displayCredentials.toString();
	}

	@Override
	public void generatePassword() {
		StringBuilder employeePassword = new StringBuilder();

		// 8 Characters
		for (int i = 0; i < 2; i++) {
			employeePassword.append(ITAssistUtil.getRandomLowerCaseChar());
			employeePassword.append(ITAssistUtil.getRandomUpperCaseChar());
			employeePassword.append(ITAssistUtil.getRandomSpecialChar());
			employeePassword.append(ITAssistUtil.getRandomNumericChar());
		}

		setEmployeePassword(employeePassword.toString());
	}

	private String getDepartmentEmailAbbreviationFromId(int employeeDepartmentId) {
		switch (employeeDepartmentId) {
		case 1:
			return Departments.TECHNICAL.fetchEmailAbbreviation();
		case 2:
			return Departments.ADMIN.fetchEmailAbbreviation();
		case 3:
			return Departments.HUMAN_RESOURCE.fetchEmailAbbreviation();
		case 4:
			return Departments.LEGAL.fetchEmailAbbreviation();
		default:
			return "NA";
		}
	}

	/**
	 * @return the employeePassword
	 */
	public String getEmployeePassword() {
		return employeePassword;
	}

	/**
	 * @param employeePassword the employeePassword to set
	 */
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	/**
	 * @return the employeeEmail
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}

	/**
	 * @param employeeEmail the employeeEmail to set
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

}
