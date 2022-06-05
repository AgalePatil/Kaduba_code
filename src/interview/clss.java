package interview;

import java.util.Scanner;

public class clss {

	public static void main(String[] args) {
		// wap to find out factorial of given number 


		                  int fact=1;
                      System.out.println("Enter a number");
		                   Scanner s=new Scanner(System.in);
		                   int num;
		                   num=s.nextInt();


		            for(int i=1;i<=num;i++){                     
		              

		                          fact=fact*i;
		                               }
		                    System.out.println(fact);


//5!=5*4*3*2*1
	}

}
// for(int i=1;i<=5;i++){    fact=1*5}//fact=5 1st iteration
