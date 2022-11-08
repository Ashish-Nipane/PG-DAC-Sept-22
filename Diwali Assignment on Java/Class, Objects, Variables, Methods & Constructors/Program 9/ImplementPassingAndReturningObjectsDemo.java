//Java Program to Implement the Passing and Returning Objects

class Complex{
	int real;
	int imag;
	
	Complex(){
		this.real = 0;
		this.imag = 0;
	}
	
	Complex(int real){
		this.real = real;
		this.imag = 0;
	}
	
	Complex(int real, int imag){
		this.real = real;
		this.imag = imag;
	}
	
	Complex complexSum( Complex obj ){	// obj1.complexSum(obj2)
		Complex temp = new Complex();
		
		temp.real = this.real + obj.real;	
		temp.imag = this.imag + obj.imag;
		
		return temp;
	}
	
	Complex complexMultiply(Complex obj){
		Complex temp = new Complex();
		
		temp.real = (this.real*obj.real) - (this.imag*obj.imag);
		temp.imag = (this.real*obj.imag) + (this.imag*obj.real);
		
		return temp;
	}
	
	void printDetails(){
		if (this.imag > 0)
			System.out.println(this.real+"+i"+this.imag);
		else
			System.out.println(this.real+"-i"+this.imag);
	}
	
}

class ImplementPassingAndReturningObjectsDemo{
	public static void main(String args[]){
		
		Complex obj1 = new Complex(3,2);
		Complex obj2 = new Complex(4,-2);
		
		Complex obj3 = obj1.complexSum(obj2);		 //passing object and returning object
		obj3.printDetails();
		
		Complex obj4 = obj1.complexMultiply(obj2);	//passing object and returning object
		obj4.printDetails();		
	}
}