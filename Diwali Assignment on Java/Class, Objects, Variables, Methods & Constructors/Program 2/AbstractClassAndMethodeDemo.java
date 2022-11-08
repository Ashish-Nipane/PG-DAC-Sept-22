//Java Program to Illustrates Use of Abstract Class and Method

abstract class Parent{//abstract class
	private int age; 
	Parent(){
		this.age = 99;
	}
	
	Parent(int age){
		this.age = age;
	}	
	//abstract method
	public abstract void getOccupation();
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
} 

class Child extends Parent{
	Child(){
		
	}
	
	Child(int age){
		super(age);
	}
	
	//need to override abstract method in Child class
	public void getOccupation(){
		System.out.println("Occupation is handling family business");
	}	
}

class AbstractClassAndMethodeDemo{
	public static void main(String args[]){
		Child cObj = new Child(30);
		
		Parent pObj = new Child();//Parent abstract class can store reference of Child class object
		
		cObj.getOccupation();//calling overriden method using Child class reference
		System.out.println("Child's age is: "+cObj.getAge());
		pObj.getOccupation();//calling overriden method using Parent class reference
		System.out.println("Parent's default age is: "+pObj.getAge());
	}
}

