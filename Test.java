
//perameterized constructor

class Rectangle{
   int length,width,res;
   Rectangle(int x,int y){
	length=x;
	width=y;	
   }

   void rectarea(){
	res=length*width;
	System.out.println("area of rectangle="+res);
   }
}

class Test{
    public static void main(String args[]){
	Rectangle obj = new Rectangle(10,20);
        obj.rectarea();
    }
}
