//Java Program to Illustrates Use of Chaining Constructor

class UseOfChainingConstructorDemo{
	String ctorName;
	
	UseOfChainingConstructorDemo(){
		this("Contructor chaining");
	}
	
	UseOfChainingConstructorDemo(String ctorName){
		this.ctorName = ctorName;
	}
	
	public static void main(String args[]){
		
		UseOfChainingConstructorDemo obj1 = new UseOfChainingConstructorDemo();
		
		UseOfChainingConstructorDemo obj2 = new UseOfChainingConstructorDemo("One parameter contructor");
		
		System.out.println(obj1.ctorName);
		System.out.println(obj2.ctorName);
	}
}