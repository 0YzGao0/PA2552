package calc;

public class CalculatorMain {
	public CalculatorMain(){	
	}
	public int add(int a, int b){
		return a+b;
	}
	public int div(int a, int b) {
		if(b == 0) {
			return 0;
		}
		return a/b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
//	public int div(int a, int b) {
//		return a/b;
//	}
	public int rem(int a, int b) {
		return a%b;
	}
	public int sqt(int a) {
		return (int)Math.sqrt(a);
	}
	public double mul(double a,double b) {
		return Math.ceil(a * b);
	}
	public int pow(int a, int b){
		return (int)Math.pow(a, b);
	}
}
