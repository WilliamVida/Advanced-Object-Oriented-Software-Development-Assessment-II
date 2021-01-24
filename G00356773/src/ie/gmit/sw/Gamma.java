package ie.gmit.sw;

/**
 * This class returns a byte.
 * 
 * @author William Vida
 */

public class Gamma {

	/**
	 * Takes in a byte and returns a byte.
	 * 
	 * @param b
	 * @return
	 */
	public byte gamma(byte b) {
		return (byte) (Integer.reverse(b));
	}

}
