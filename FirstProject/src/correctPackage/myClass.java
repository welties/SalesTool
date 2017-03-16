package correctPackage;

public class myClass {
	int num;
	void test(int num){
	this.num = num;
	System.out.println(this.num);
	};
	
public static void main (String args[]) {
	myClass obj = new myClass();
	obj.test(10);
}} 
