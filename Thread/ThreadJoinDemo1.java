package Thread;

class MyThread9 extends Thread {
	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

class ThreadJoinDemo1 {
	public static void main(String[] args) throws InterruptedException {
		MyThread9 mt = (MyThread9) Thread.currentThread();
		MyThread9 t = new MyThread9();
		t.start();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println("Main Thread");
		}
	}
}