//Java Program to Illustrates Use of Referencing the Object from Inner Class

class Outer{
	int outerVar;
	
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
	
	class Inner{
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
			
			System.out.println("Outer variable is :"+outerVar);
			System.out.println("Inner variable is :"+this.innerVar);
			System.out.println("Their sum is :"+(outerVar + this.innerVar));
		}
	}
}

class ReferencingObjectFromInnerClassDemo{
	public static void main(String args[]){
		Outer oObj1 = new Outer(123);
		oObj1.printSumViaOuterClass();	//printing sum using Outer class method
		
		Outer oObj2 = new Outer();
		Outer.Inner iObj2 = oObj2.new Inner(987);
		iObj2.printSumViaInnerClass();	//printing sum using Inner class method
	}
}