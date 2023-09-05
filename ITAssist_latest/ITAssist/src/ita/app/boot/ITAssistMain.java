/**
 * ITAssist library for booting up the ITAssist application
 */
package ita.app.boot;

import ita.app.boot.start.ITAssistApp;

/**
 * Starting of ITAssist application having main method
 * @Author Varun Kaushik
 */
public class ITAssistMain {


	/**
	 * Main method to start the application
	 * @param args
	 */
	public static void main(String[] args) {
		Thread iTAssistAppThread = new Thread(new ITAssistApp());
		iTAssistAppThread.start();
	}

}
