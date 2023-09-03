/**
 * 
 */
package ita.app.utils;

import java.util.Random;

/**
 * 
 */
public final class ITAssistUtil {

	public static final char[] SPECIAL_CHARACTERS = {'~','!','@','#','$','%','^','&','*','_','-'};
	
	
	public static char getRandomUpperCaseChar() {
		Random rnd = new Random();
		return (char) ('a' + rnd.nextInt(26));
	}
	
	public static char getRandomLowerCaseChar() {
	    Random rnd = new Random();
		return (char) ('A' + rnd.nextInt(26));
	}
	
	public static char getRandomNumericChar() {
		Random rnd = new Random();
		return (char) ('0' + rnd.nextInt(10));
	}
	
	public static char getRandomSpecialChar() {
		return SPECIAL_CHARACTERS[(int)((Math.random()*11)+1)];
	}
	
}
