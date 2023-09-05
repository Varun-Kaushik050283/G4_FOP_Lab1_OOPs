/**
 * 
 */
package ita.app.utils;

import ita.app.boot.dataload.MasterDataLoader;
import ita.app.dto.Employee;
import ita.app.dto.MasterData;

/**
 * Collection of All ITAssist application related Data
 * 
 * @author Varun Kaushik
 */
public class DataCollector {

	private static MasterDataLoader masterDataLoader;
	private Employee employee;

	/**
	 * Loading ITAssist's Master Data on loading of application in memory at runtime
	 */
	static {
		try {
			masterDataLoader = MasterDataLoader.getInstance();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getStackTrace()[0] + " " + ex.toString());
		}
	}

	/**
	 * Sharing ITAssist application's Master Data
	 * 
	 * @return
	 */
	public MasterData shareMasterData() {
		return masterDataLoader.getMasterData();
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	/**
	 * Sharing ITAssist application's Master Data
	 * 
	 * @return
	 */
	public String shareUserEnteredData() {
		return getEmployee().toString();
	}

}
