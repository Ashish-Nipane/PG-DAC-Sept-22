//Java Program to Swap Objects using Swap() Method

class Identity{
	int id;
	
	Identity(){
		this.id = 1000;
	}
	
	Identity(int id){
		this.id = id;
	}
	
	public String toString(){
		return "Identity[id = "+this.id+"]";
	}
}

class SwapObjectsUsingSwapMethodDemo{	
	Identity id;
	
	P10(Identity obj){
		this.id = obj;
	}
	
	static void swapObject(P10 obj1, P10 obj2){	
		Identity temp;
		temp    = obj1.id;//temp->obj1
		obj1.id = obj2.id;//obj1->obj2
		obj2.id = temp;//obj2->temp->obj1
	}
	
	public String toString(){
		return "P10["+this.id+"]";
	}
	
	public static void main(String args[]){
		Identity obj1 = new Identity(1111);
		P10 pObj1 = new P10(obj1);
		
		Identity obj2 = new Identity(2222);
		P10 pObj2 = new P10(obj2);
		
		System.out.println("Object IDs before swapping:");
		System.out.println("Object1: "+pObj1);
		System.out.println("Object2: "+pObj2);
		
		P10.swapObject(pObj1, pObj2);
		System.out.println("Object IDs after swapping:");
		System.out.println("Object1: "+pObj1);
		System.out.println("Object2: "+pObj2);
	}
}