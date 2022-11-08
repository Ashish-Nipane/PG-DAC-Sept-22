//Java Program to Illustrate the Use of HashCode() Method

class UseOfHashCodeMethodDemo{	
	int num1;
	int num2;
	
	UseOfHashCodeMethodDemo(){
		
	}
	
	UseOfHashCodeMethodDemo(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int hashCode(){
		return 17*num1 + 97*num2;
	}
	
	public boolean equals(UseOfHashCodeMethodDemo obj){
		if(this.hashCode() == obj.hashCode())
			return true;
		else
			return false;
	}
	
	public static void main(String args[]){
		UseOfHashCodeMethodDemo obj1 = new UseOfHashCodeMethodDemo(5,10);
		
		UseOfHashCodeMethodDemo obj2 = new UseOfHashCodeMethodDemo(10,5);
		
		UseOfHashCodeMethodDemo obj3 = new UseOfHashCodeMethodDemo(5,10);
		
		System.out.println("obj1.equals(obj2): "+obj1.equals(obj2));
		System.out.println("obj1.equals(obj3): "+obj1.equals(obj3));
	}
}