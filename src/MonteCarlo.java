import java.util.Random;

public class MonteCarlo {
	
	public static double random(double low, double high) {//produces a random double between low and high
		Random random = new Random();
		double result=0.0;
		while (true) {
			result = low + (random.nextDouble() * (high - low));
			if(result != 0.0) break;
		}
		return result;
	}
	
	public static double f(double x) {//y = f(x) = 3x^4-10x
		double expr1 = 3*x*x*x*x;
		double expr2 = 10*x;
		return (expr1-expr2);
	}
	
	public static void main(String [] args) {
		double result = 0.0;
		double low = 0.0;
		double high = 5.0;
		
		for(int i = 0; i < 99000; i++){// the more iterations the higher the accuracy
			double tempx = random(-1, 6); // getting a random value of x between 0 and 5
			double y = f(tempx);// getting a random y value from the previously created random x value and inserting it into the function
			double tempy = random ((int)(f(-1)), (int)(f(6)));// getting the random value of y between f(0) and f(5)
			if(y != 0) {// weather y value generated from f(x) is greater than or less than 0, it will be added to the result.
				result +=y;
			}
			if(y<tempy) {
				result -=y;
			}
		}
		double diff = high - low;
		System.out.println("The area of the integral is about " + ((result*diff)/99000));// because there are 99,000 iterations
	}
}
