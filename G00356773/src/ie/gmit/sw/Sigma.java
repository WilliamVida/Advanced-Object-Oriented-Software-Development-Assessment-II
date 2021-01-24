package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This class adds or removes a lambda or a gamma.
 * 
 * @author William Vida
 */

public class Sigma {

	/**
	 * Declare status and collections of Lambda and Gamma.
	 */
	Status status;
	Collection<Lambda> lambdas = new ArrayList<>();
	Collection<Gamma> gammas = new ArrayList<>();

	/**
	 * Adds Lambda to collection lambdas.
	 * 
	 * @param lambda
	 */
	public void add(Lambda lambda) {
		switch (status) {
		case Slight, Medium, Low -> lambdas.add(lambda);
		case High, Extreme -> {
			lambdas.add(lambda);
		}
		}

		System.out.println("public void add(Lambda lambda) Status: " + status + " " + getClass() + "\n");
	}

	/**
	 * Adds Gamma to collection gammas.
	 * 
	 * @param gamma
	 */
	public void add(Gamma gamma) {
		gammas.add(gamma);
		System.out.println("public void add(Gamma gamma) " + getClass() + "\n");
	}

	/**
	 * Removes Lambda from collection lambdas.
	 * 
	 * @param lambda
	 */
	public void remove(Lambda lambda) {
		lambdas.remove(lambda);
		System.out.println("public void remove(Lambda lambda) " + getClass() + "\n");
	}

	/**
	 * Removes Gamma from collection gammas.
	 * 
	 * @param gamma
	 */
	public void remove(Gamma gamma) {
		gammas.remove(gamma);
		System.out.println("public void remove(Gamma gamma) " + getClass() + "\n");
	}

}
