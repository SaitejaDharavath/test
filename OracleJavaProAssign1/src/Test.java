class Test1
{
	 public void display()
	 {
		 System.out.println("this is Test1 class");
	 }
}
class Test2
{
	public void show()
	{
		double a=10;
		double b=5;
		System.out.println(Math.pow(a, b));
	}
}
class Test3
{
	public void display()
	{
		double a=2.056;
		System.out.println(Math.floor(a));
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test1 t1=new Test1();
t1.display();
Test2 t2=new Test2();
t2.show();
Test3 t3=new Test3();
t3.display();

	}

}

