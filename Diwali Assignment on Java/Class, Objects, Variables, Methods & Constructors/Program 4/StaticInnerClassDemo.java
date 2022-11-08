//Java Program to Illustrates Use of Instance Inner Class

class Outer{	
	static int outerVar; //needs to be static to be accessed inside Inner class
	
	Outer(){
		this.outerVar = 111;
	}
	
	Outer(int outerVar){
		
		this.outerVar = outerVar;
	}
	
	void printSumViaOuterClass(){
		Inner iObj = new Inner();
		System.out.println("Outer variable is :"+this.outerVar);
		System.out.println("Inner variable is :"+iObj.getInnerVar());
		System.out.println("Their sum is :"+(this.outerVar + iObj.getInnerVar()));
	}
	
	static class Inner{
		private int innerVar;
		
		Inner(){
			this.innerVar = 222;
		}
		
		Inner(int innerVar){
			this.innerVar = innerVar;
		}
		
		public int getInnerVar(){
			return this.innerVar;
		}
		
		void printSumViaInnerClass(){
			System.out.println("Outer variable is :"+outerVar); //cannot access non static instances of Outer class; changed it to static
			System.out.println("Inner variable is :"+this.innerVar);
			System.out.println("Their sum is :"+(outerVar + this.innerVar)); //cannot access non static instances of Outer class; changed it to static
		}
	}
}

class StaticInnerClassDemo{
	public static void main(String args[]){
		Outer oObj1 = new Outer(123);
		oObj1.printSumViaOuterClass();	//printing sum using Outer class method
		
		Outer oObj2 = new Outer();
		Outer.Inner iObj2 = new Outer.Inner(987); //format is used for static inner classes
		
		iObj2.printSumViaInnerClass();
	}
}