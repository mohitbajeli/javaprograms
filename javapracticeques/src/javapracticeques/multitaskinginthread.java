package javapracticeques;
class multitasking extends Thread{
	String str;

	multitasking(String str)
	{
		this.str=str;
	}
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(str +" "+ i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();			}
		}
		
	}
}
public class multitaskinginthread {

	public static void main(String[] args) {
		multitasking obj1=new multitasking("cutting the ticket");
		multitasking obj2 = new multitasking("booking the seats");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();

	}

}
