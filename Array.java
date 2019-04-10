import java.util.Scanner;
class Array{
   public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array");
	int n=sc.nextInt();
	int marks[] = new int[n];
	System.out.println("please enter "+n+" elements");
	int i;
	for(i=0;i<n;i++){
	  marks[i]=sc.nextInt();
	}
	int total=0;
	System.out.println("elements are --");
	for(i=0;i<n;i++){
	  System.out.println(marks[i]);
	  total = total + marks[i];
	}
	System.out.println("\ntotal marks = "+total);
   }
}
