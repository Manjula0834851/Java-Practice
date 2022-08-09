package Thread;

class Test extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
			//System.out.println(Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.setPriority(10);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
			System.out.println(Thread.currentThread().getPriority()); 
		}
	}
}