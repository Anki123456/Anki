
public class DataTypesDemo {

	public static void main(String[] args) {
	int i=23;
	long l=987914101L; // out of range error if not used L. for java to not consider it as int value, use l after the number
	double d= 0.123456;
	float f= 3.14F;
	boolean b= true;
	char c= 'Z'; //instead of 'Z', we can use '\u0063', which is  a unicode and gives the output as char:c (which is the unicode value of 0063)
	System.out.println("Int" +i );
 System.out.println("Long:" +l);
 System.out.println("Double:" +d);
 System.out.println("float:" +f);
 System.out.println("char:" +c);
 System.out.println("boolean:" +b); // if used !b in println statement, the output we get is false for boolean
 
 
	}

}
