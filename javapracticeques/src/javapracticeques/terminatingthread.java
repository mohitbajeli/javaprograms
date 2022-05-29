package javapracticeques;

import java.io.IOException;

class myclasses extends Thread{
	 boolean stop=false;

	public void run() {
		
		for(int i=0;i<100000;i++)
		{
			System.out.println(i);
			if(stop)
			{
				return ;
			}
		}
	}
}
public class terminatingthread {

	public static void main(String[] args) throws IOException {
		myclasses obj=new myclasses();
		Thread t = new Thread(obj);
		t.start();
		System.in.read();
		obj.stop=true;

	}

}
