//Java Program to Create a Method with 2 Parameters and without Return Type

class MethodWith2ParametersAndWithoutReturnTypeDemo{
	void sum(int a, int b){
		System.out.println("The sum is: "+(a+b));
	}
	
	public static void main(String args[]){
		MethodWith2ParametersAndWithoutReturnTypeDemo obj = new MethodWith2ParametersAndWithoutReturnTypeDemo();
		
		obj.sum(1,10);
	}
}