
public class Assignment12 {
	
	public static void main(String[] args) {
		// Input
		float result1 = calAmount(12,13,15,17);
		System.out.println("Final Amount"+result1);
		float result2 = calAmount(12,13,15,17);
		System.out.println("Final Amount"+result2);
	}
	
	public static float calAmount(float prod1, float prod2, float prod3, 
			float tax) {
		float finalSum = prod1 + prod2 + prod3;
		float finalAmount = (tax/100)*finalSum;
		return finalAmount;
	}
	
	// Assignment1.java
	// link
	// Don't upload image or video
}
