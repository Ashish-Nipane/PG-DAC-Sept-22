//Java Program to Create a Method without Parameters and with Return Type

class MethodWithoutParametersAndWithReturnTypeDemo{	
	int a;
	int b;
	
	MethodWithoutParametersAndWithReturnTypeDemo(){
		
	}
	
	MethodWithoutParametersAndWithReturnTypeDemo(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	int sum(){
		return (a+b);
	}
	
	double power(){
		return Math.pow(a,b);
	}
	
	public static void main(String args[]){
		
		MethodWithoutParametersAndWithReturnTypeDemo obj = new MethodWithoutParametersAndWithReturnTypeDemo(5,10);
		
		System.out.println("The sum is: "+obj.sum());
		System.out.println("The power is: "+obj.power());
	}
}
