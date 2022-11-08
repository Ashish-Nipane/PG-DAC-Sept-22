//Java Program to Calculate Sum of Two Byte Values using Type Casting

class SumOfTwoByteValuesUsingTypeCasting{	
	public static void main(String args[]){
		byte b1 = 30;
		byte b2 = 65;
		
		byte sum = (byte)(b1+b2); //need to do explicit typecasting as the addition is being upcasted to int
		
		System.out.println("The sum of 2 bytes is: "+sum);
		
	}
}