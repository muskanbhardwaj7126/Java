import java.util.Scanner;
class Compare
{
  public static void main(String args[]){
	int a,b;
	System.out.println("please enter two numbers");
	Scanner number = new Scanner(System.in);
	a = number.nextInt();
	b = number.nextInt();

	if(a>b){
	  System.out.println("greater number between "+a+" and "+b+" is = "+a);
	}else{
	  System.out.println("greater number between "+a+" and "+b+" is = "+b);
	}
  }
}