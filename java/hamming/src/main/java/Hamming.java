import java.lang.*;

public class Hamming {
	String leftStrand;
	String rightStrand;
	public Hamming(String leftStrand, String rightStrand) {
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
		if (leftStrand.length() == 0 && leftStrand.length() != rightStrand.length()) { 
			throw new IllegalArgumentException("left strand must not be empty.");
		}
		else if (rightStrand.length() == 0 && leftStrand.length() != rightStrand.length()) { 
			throw new IllegalArgumentException("right strand must not be empty.");
		}
		else if (leftStrand.length() > rightStrand.length()) { 
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
		else if (leftStrand.length() < rightStrand.length()) { 
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
	}

	public int getHammingDistance() {
		int count = 0;
		for (int i = 0; i < this.leftStrand.length(); i++) {
			if (this.leftStrand.charAt(i) != this.rightStrand.charAt(i)) {
				count += 1;
			}
		}
		return count;
	}
}
