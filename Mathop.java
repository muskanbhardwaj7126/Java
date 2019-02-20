import java.util.Scanner;
class Mathop{
  public static void main(String args[]){
	int a,b;
	float sum,sub,div,multi;
	System.out.println("Enter two numbers");
	Scanner number = new Scanner(System.in);
	a = number.nextInt();
	b = number.nextInt();
	sum = a+b;
	sub = a-b;
	div = a/b;
	multi = a*b;
	System.out.println("addition is = "+sum);
	System.out.println("subtraction is = "+sub);
	System.out.println("division is = "+div);
	System.out.println("mutiplication is = "+multi);
  }
}