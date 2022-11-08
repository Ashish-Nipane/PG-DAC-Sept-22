//Java Program to Create an Object for Class and Assign Value in the Object using Constructor


class AssignValueUsingObjectOfClassDemo{
	String ctorName;
	
	AssignValueUsingObjectOfClassDemo(){
		this.ctorName = "Default contructor";
	}
	
	AssignValueUsingObjectOfClassDemo(String ctorName){
		this.ctorName = ctorName;
	}
	
	public static void main(String args[]){
		
		AssignValueUsingObjectOfClassDemo obj = new AssignValueUsingObjectOfClassDemo("One parameter contructor");

		System.out.println(obj.ctorName);
	}
}