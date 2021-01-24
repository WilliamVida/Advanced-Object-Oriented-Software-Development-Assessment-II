package ie.gmit.sw;

/**
 * This class returns a boolean value to check if a collection contains gamma or
 * lambda.
 * 
 * @author William Vida
 */

public class Omega {

	/**
	 * Declare Sigma.
	 */
	Sigma sigma = new Sigma();

	/**
	 * Checks if collection gammas contains gamma.
	 * 
	 * @param gamma
	 * @return True or False
	 */
	public boolean hasGamma(Gamma gamma) {
		return sigma.gammas.contains(gamma);
	}

	/**
	 * Checks if collection lambdas contains lambda.
	 * 
	 * @param lambda
	 * @return True
	 */
	public boolean hasLambda(Lambda lambda) {
		return sigma.lambdas.contains(lambda);
	}

}
