/**
 * Utility Lib to be used among various APIs of ITAssist application
 */
package ita.app.utils;

import ita.app.collection.Departments;
import ita.app.dto.MasterData;

/**
 * MasterDataFiller class having capability to load MasterData at runtime on
 * boot up of application
 * 
 * @author Varun Kaushik
 */
public final class MasterDataFiller {

	public final static MasterData loadMasterData() {
		return new MasterData(new Departments[] { Departments.TECHNICAL, Departments.ADMIN, Departments.HUMAN_RESOURCE,
				Departments.LEGAL });
	}

}
