package ie.gmit.sw;

/**
 * Beta, Epsilon and Zeta have been combined into one class Lambda. Lambda
 * implements the interface Mu. All of the methods return a value.
 * 
 * @author William Vida
 */

public class Lambda implements Mu {

	@Override
	public byte beta(byte b) {
		int i = b;
		return (byte) (i ^ 0xFFFFFFFF);
	}

	@Override
	public int epsilon(int i) {
		return i & 0xFF000000;
	}

	@Override
	public int zeta(int i) {
		return i & 0x000000FF;
	}

}
