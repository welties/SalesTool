package myPackage;

class code1{
	int x,y;
	code1(int a, int b){
		x=a; 
		y=b;
	}
}

class code2 extends code1{
	int x,y;
	code2(int a, int b){		
		super(a,b);
		System.out.println("In code2 constructor: a="+ a + ": b=" + b);
		System.out.println("In code2 constructor: x="+ x + ": y=" + y);
	}
}

public class InheritanceDemo {
	public static void main (String args[]){
		int result;
		code2 number = new code2(100,200);
		result = number.x + number.y;
		System.out.println("Sum = " + result);
	}

}
