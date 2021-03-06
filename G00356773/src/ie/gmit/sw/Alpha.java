package ie.gmit.sw;

/**
 * This class is used to get the status and set the status.
 * 
 * @author William Vida
 */

public class Alpha {

	/**
	 * Declare Status.
	 */
	Status status;

	/**
	 * Sets the status.
	 * 
	 * @param status
	 */
	public Alpha(Status status) {
		this.status = status;
		System.out.println("public Alpha(Status status) " + getClass() + "\n");
	}

	/**
	 * Returns status.
	 * 
	 * @return
	 */
	public Status getStatus() {
		return status;
	}

}
