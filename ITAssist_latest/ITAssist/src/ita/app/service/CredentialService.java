/**
 * 
 */
package ita.app.service;

import ita.app.dto.Employee;

/**
 * Service to cater the requirement for ITAssist application user credentials generation
 * @author Varun Kaushik
 */
public interface CredentialService {
   			
	public void generatePassword();
	
	public void generateEmailAddress(Employee employee);
	
	public String showCredentials();
}
