/**
 * ITAssist library for loading the master data for the ITAssist application
 */
package ita.app.boot.dataload.generic;



import ita.app.dto.MasterData;
import ita.app.utils.MasterDataFiller;

/**
 * Super most class defining APIs to be implemented by MasterDataLoader sub class at runtime
 * @author Varun Kaushik
 */
public abstract class DataLoader {
 
    private final MasterData masterData;
	
	protected DataLoader() {
		masterData = MasterDataFiller.loadMasterData();
	}

	/**
	 * @return the masterData
	 */
	public final MasterData getMasterData() {
		return masterData;
	}
	
}
