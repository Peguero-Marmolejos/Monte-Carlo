public class MonteCarlo {
	//creating a random number generator
	public static double randomVal(double low, double high) {
		//produces a random double between low and high
		return low + ((high - low)*Math.random());
	}
	
	//defining our mathematical function
	public static double f(double x) {
		//y = f(x) = 3x^4-10x
		double expr1 = 3*x*x*x*x;
		double expr2 = 10*x;
		return (expr1-expr2);
	}
	
	public static void main(String [] args) {
		double result = 0.0;
		double low = 0.0;
		double high = 5.0;
		
		// the more iterations the higher the accuracy
		for(int i = 0; i < 99000; i++){
			//double tempx = ; // 
			double y = f(randomVal(low, high));// getting a random value of x between 0 and 5 and inserting it into the function to obtain a sample value of y 
			//double tempy = randomVal(f(low), f(high));// getting the random value of y between f(0) and f(5)
			if(y != 0 ) {// weather y value generated from f(x) is greater than or less than 0, it will be added to the result.
				result +=y;
			}
		}
		double monteCarloResult = (((high - low)*result)/99000);
		double actualIntegral = f(5) - f(0);
		System.out.println("The area of the integral is about " + monteCarloResult);// because there are 99,000 iterations
		System.out.println("The percentage error is " + (Math.abs(monteCarloResult - actualIntegral)/ actualIntegral) * 100);
	};
}
