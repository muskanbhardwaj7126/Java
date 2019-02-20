import java.util.Scanner;
class example
{
	int a,b,total;
	void add(){
	   total = a+b;
	}
}
class Multiclass
{
	public static void main (String args[]){
		example obj = new example();
		obj.a = 10;
		obj.b = 20;
		obj.add();
		System.out.print("addition is = "+obj.total);
	}
}