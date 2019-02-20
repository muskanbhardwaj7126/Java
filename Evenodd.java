import java.util.Scanner;
class Evenodd
{
  public static void main(String args[]){
	int x;
	System.out.println("enter a number to check Even or Odd");
	Scanner number = new Scanner(System.in);
	x = number.nextInt();

	if(x%2==0){
	  System.out.println(x+" is even number");
	}else{
	  System.out.println(x+" is odd number");
	}
  }
}