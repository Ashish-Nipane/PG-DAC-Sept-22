//Java Program to Illustrate Use of Constructor

class UseOfConstructorDemo{	
	String ctorName;
	
	UseOfConstructorDemo(){
		this.ctorName = "Default contructor";
	}
	
	UseOfConstructorDemo(String ctorName){
		this.ctorName = ctorName;
	}
	
	public static void main(String args[]){
		UseOfConstructorDemo obj1 = new UseOfConstructorDemo();
		UseOfConstructorDemo obj2 = new UseOfConstructorDemo("One parameter contructor");
		
		System.out.println(obj1.ctorName);
		System.out.println(obj2.ctorName);
	}
}
