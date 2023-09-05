/**
 * 
 */
package ita.app.boot.start;

import java.util.Scanner;

import ita.app.dto.Employee;
import ita.app.dto.MasterData;
import ita.app.service.CredentialService;
import ita.app.service.impl.CredentialServiceImpl;
import ita.app.utils.DataCollector;

/**
 * 
 */
public final class ITAssistApp implements Runnable {
	@Override
	public void run() {
		
		/**
		 * Creating instances for various classes to be used.
		 */
		Scanner scanner = new Scanner(System.in);
		DataCollector dataCollector = new DataCollector();
		String employeeFirstName = "";
		String employeeLastName = "";
		
		try {					
			
			/**
			 * Step 1. Accept Employee First Name
			 */
			System.out.println("Please enter first name of the employee: ");
			employeeFirstName = scanner.nextLine().toUpperCase();
			
			/**
			 * Step 2. Accept Employee Last Name
			 */
			System.out.println("Please enter last name of the employee: ");
			employeeLastName = scanner.nextLine().toUpperCase();
			
			Employee employee = new Employee(employeeFirstName, employeeLastName);
			
			System.out.println("Please enter user department from the following list:-");
			
			/**
			 * Step 3. Accept Employee Department 
			 */
			System.out.println("List of departments:-");
			displayDepartmentsMenuInfo(dataCollector);
			employee.setDepartment(scanner.nextInt());						
			
			/**
			 * Step 4. Storing User Entered Data 
			 */
			dataCollector.setEmployee(employee);
			
			/**
			 * Step 5. Generating user credentials via Service
			 */
			CredentialService service = new CredentialServiceImpl();
			service.generatePassword();
			service.generateEmailAddress(employee);
			
			/**
			 * Step 6. Displaying the final Output
			 */
			System.out.println("Dear " + employee.getFirstName() + ",");
			System.out.println("Your generated credentials are as follows:-");
			System.out.println(service.showCredentials());
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace()[0] + " " + ex.toString());
		} finally {
			if (null != scanner) {
				scanner.close();
			}
		}

	}

	private void displayDepartmentsMenuInfo(DataCollector dataCollector) {
		MasterData masterData = dataCollector.shareMasterData();
		for (int i = 0; i < masterData.getDepartments().length; i++) {
			System.out.println(masterData.getDepartments()[i].displayUIMenuInfo());
		}
	}
}
