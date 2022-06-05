package interview;

public class clsss {

	public static void main(String[] args) {
		 String str="samsung";
         String rev="";
         int len=str.length();
         int i=len-1;

while(i>=0){

	 rev=rev+str.charAt(i);
               

                         }

             System.out.println(rev);


if(str.equals(rev)){System.out.println("String is palindrome");}
else{System.out.println("not palindrome");}
	
	}
	}


