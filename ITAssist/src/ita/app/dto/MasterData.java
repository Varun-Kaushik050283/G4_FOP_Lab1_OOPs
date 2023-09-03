/**
 * Data to be used in ItAssist Application
 */
package ita.app.dto;

import ita.app.collection.Departments;
import ita.app.dto.generic.Data;
import ita.app.interfaces.Loadable;

/**
 * Master Data to be loaded at runtime on boot up of application 
 * @author Varun Kaushik
 */
public final class MasterData extends Data implements Loadable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Departments[] departments;

	public MasterData(Departments[] departments) {
			this.departments = departments;
	}
	
	/**
	 * @return the departments
	 */
	public final Departments[] getDepartments() {
		return departments;
	}

	/**
	 * @param departments the departments to set
	 */
	public final void setDepartments(Departments[] departments) {
		this.departments = departments;
	}
	
	@Override
	public String toString() {
		if(null != getDepartments()) {
			StringBuilder allDepartmentDetails = new StringBuilder(" All Department Details :- \n");
			for(int i = 0; i < getDepartments().length;i++) {
				allDepartmentDetails.append(getDepartments()[i].displayDepartmentDetails()+"\n");
			}
			return allDepartmentDetails.toString();
		}
		return super.toString();	 
	}
		
}
