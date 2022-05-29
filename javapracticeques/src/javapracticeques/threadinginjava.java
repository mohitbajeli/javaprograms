package javapracticeques;
class myclass extends Thread{
	public void run()
	{
		System.out.println("this is the thread class");
	}
}
public class threadinginjava {

	public static void main(String[] args) {
	myclass obj=new myclass();
	
	Thread t=new Thread(obj);
	t.start();

	}

}
