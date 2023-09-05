/**
 * Collection Lib to be used in ITAssist Application
 */
package ita.app.collection;

/**
 * Departments Enum defined as a part of Master Data of ITAssist application
 * @author Varun Kaushik
 */
public enum Departments {

	TECHNICAL(1, "Technical") {
		@Override
		public String fetchEmailAbbreviation() {
			return "tech";
		}
	},
	ADMIN(2, "Admin") {
		@Override
		public String fetchEmailAbbreviation() {
			return "admin";
		}
	},
	HUMAN_RESOURCE(3, "Human Resource") {
		@Override
		public String fetchEmailAbbreviation() {
			return "hr";
		}
	},
	LEGAL(4, "Legal") {
		@Override
		public String fetchEmailAbbreviation() {
			return "legal";
		}
	};

	private int departmentId;
	private String departmentName;

	
	Departments(final int departmentId, final String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public final String displayDepartmentDetails() {
		return "The employee belongs to " + getDepartmentName() + "[Id." + getDepartmentId() + "] ";
	}
	
	public final String displayUIMenuInfo() {
		return getDepartmentId() + ". " + getDepartmentName() + " ";
	}

	public abstract String fetchEmailAbbreviation();

	/**
	 * @return the departmentId
	 */
	public final int getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId the departmentId to set
	 */
	public final void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the departmentName
	 */
	public final String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public final void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
