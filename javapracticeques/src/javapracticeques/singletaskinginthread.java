package javapracticeques;
class mythread extends Thread{
	public void run() {
		task1();
		task2();
		task3();
		
	}

void task1() {
	System.out.println("this is task 1");
}
void task2() {
	System.out.println("this is task 2");
}
void task3() {
	System.out.println("this is task 3");
}

public class singletaskinginthread {

	public static void main(String[] args) {
		mythread obj=new mythread();
		Thread t =new Thread(obj);
		t.start();
		

	}

}
}

