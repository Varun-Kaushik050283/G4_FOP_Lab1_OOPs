/**
 * ITAssist library for loading the master data for the ITAssist application
 */
package ita.app.boot.dataload;

import ita.app.boot.dataload.generic.DataLoader;

/**
 * 
 * MasterDataLoader implementing Singleton Pattern 
 * 
 * @author Varun Kaushik
 */
public class MasterDataLoader extends DataLoader{

	
	private static MasterDataLoader masterDataLoader;
	
	private MasterDataLoader() {
		super();
	}
	
	public static MasterDataLoader getInstance() {
		if(masterDataLoader == null) {
		   masterDataLoader = new MasterDataLoader();	
		}
		return masterDataLoader;
	}
	
		
}
