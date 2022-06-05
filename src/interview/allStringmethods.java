package interview;

public class allStringmethods {
	
	String A= new String("     JOS");
	String B="BUTTLER";

	
	public static void main(String[] args) {A s=new A();
	s.m1();}

		public void m1() {
		String A= new String("     JOS");
		String B="BUTTLER";

		
		System.out.println(A.concat(B));
		System.out.println(A.equalsIgnoreCase(B));
		System.out.println(A.length());
		System.out.println(B.length());
		System.out.println(A.charAt(0));
		System.out.println(B.charAt(0));
		System.out.println(A.equals(B));
		System.out.println(A.trim());
		System.out.println(A.replace("JOS","ROY"));
		System.out.println(A.endsWith("S"));
		System.out.println(A.startsWith("S"));
		System.out.println(A.toUpperCase());
		System.out.println(B.toLowerCase());
	
		}
}
class A extends allStringmethods {
	public void m2(){
		
	}
}
