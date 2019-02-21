//using logical operator

import java.util.Scanner;
class Compare2
{
   public static void main(String args[]){
	int x,y,z;
	System.out.println("enter three numbers");
	Scanner number = new Scanner(System.in);
	x = number.nextInt();
	y = number.nextInt();
	z = number.nextInt();

	if(x>y && x>z){
	  System.out.println("greatest number is = "+x);
	}else if(x>y && z>x){
	  System.out.println("greatest number is "+z);
	}else{
	  System.out.println("greatest number is "+y);
	}
   }
}