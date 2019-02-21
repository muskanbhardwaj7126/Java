import java.util.Scanner;
class Prime
{
   public static void main(String args[]){
	int x,i;
	System.out.println("enter number");
	Scanner number = new Scanner(System.in);
	x = number.nextInt();
	boolean flag = false;	
	for(i=2;i<=x/2;i++){
	  if(x%i==0){
	    flag = true;
	  }
	}
	if(flag==true){
	  System.out.println(x+" is not a prime number");
	}else{
	  System.out.println(x+" is a prime number");
	}
   }
}