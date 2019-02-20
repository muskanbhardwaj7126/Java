import java.util.Scanner;
class Check
{
  public static void main(String args[]){
	int x;
	System.out.println("enter number to check positive or negative");
	Scanner number = new Scanner(System.in);
	x = number.nextInt();
	
	if(x>=0){
	  System.out.println(x+" is positive");
	}else{
	  System.out.println(x+" is negative");
	}
  }
}