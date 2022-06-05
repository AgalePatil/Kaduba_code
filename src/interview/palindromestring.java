package interview;

public class palindromestring {
//WAP to find out given string is palindrome or not
	
	public static void main(String[] args) {
		String str="WEWLCOME";
		String rev="";
		int len=str.length();
		
for(int i=len-1;i>=0;i--) {
	               rev=rev+str.charAt(i);
	               
	               System.out.println(rev);
             }


System.out.println(rev);


		if(str.equals(rev)) {
			System.out.println("Given string is Palindrome");	
		}
		else {System.out.println("Given string is not Palindrome");	}
		
	}

}
