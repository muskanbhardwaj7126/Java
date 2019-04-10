
//single inheritancet

class A
{
   int x,y;
   void getdata(int a,int b){
	x=a;
	y=b;
   }
   int add(){
	System.out.println("superclass method");
	return(x+y);
   }
}

class B extends A
{
   int mult(){
	System.out.println("sub class method");
	return(x*y);
   }
}

class Inherit{
  public static void main(String args[]){
	B obj = new B();
	int add,mult;
	obj.getdata(5,3);
	add=obj.add();
	mult=obj.mult();
	System.out.println("addition="+add);
	System.out.println("multipication="+mult);	
  }
}
