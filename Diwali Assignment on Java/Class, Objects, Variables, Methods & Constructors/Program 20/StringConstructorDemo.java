/*
String Constructor Program in Java
	String()
	String(String str)
	String(char chars[ ])
	String(char chars[ ], int startIndex, int count)
	String(byte byteArr[ ])
	String(byte byteArr[ ], int startIndex, int count)
*/

class StringConstructorDemo{
	
	public static void main(String args[]){
		
		String s1 = new String();
		System.out.println("s1: "+s1);
		
		String s2 = new String("Welcome!");
		System.out.println("s2: "+s2);
		
		String s3 = new String(new char[]{'s','t','r','i','n','g'});
		System.out.println("s3: "+s3);
		
		String s4 = new String(new char[]{'s','t','r','i','n','g'}, 2, 4);
		System.out.println("s4: "+s4);
		
		String s5 = new String(new byte[]{65,97,66,98,67,99});
		System.out.println("s5: "+s5);
		
		String s6 = new String(new byte[]{65,97,66,98,67,99}, 2, 4);
		System.out.println("s6: "+s6);
		
	}
}