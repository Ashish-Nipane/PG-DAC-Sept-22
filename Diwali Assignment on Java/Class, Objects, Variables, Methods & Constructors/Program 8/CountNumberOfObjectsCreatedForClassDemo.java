//Java Program to Count Number of Objects Created for Class

class CountNumberOfObjectsCreatedForClassDemo{	
	static int objCount;{
		objCount++;
	}
	
	public static void main(String args[]){
		CountNumberOfObjectsCreatedForClassDemo obj1 = new CountNumberOfObjectsCreatedForClassDemo();
		
		CountNumberOfObjectsCreatedForClassDemo obj2 = new CountNumberOfObjectsCreatedForClassDemo();
		
		System.out.println("Number of objects created: "+CountNumberOfObjectsCreatedForClassDemo.objCount);
		
		new CountNumberOfObjectsCreatedForClassDemo();
		new CountNumberOfObjectsCreatedForClassDemo();
		new CountNumberOfObjectsCreatedForClassDemo();
		
		System.out.println("Number of objects created: "+CountNumberOfObjectsCreatedForClassDemo.objCount);
	}
}