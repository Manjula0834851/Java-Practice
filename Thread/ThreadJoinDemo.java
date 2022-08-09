package Thread;

class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class ThreadJoinDemo {
public static void main(String[] args)throws InterruptedException
{
MyThread3 t=new MyThread3();
t.start();
//t.join();
for(int i=0;i<5;i++)
{
System.out.println("Rama Thread");
}
}
}