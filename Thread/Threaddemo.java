package Thread;
class Threaddemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());// main
		MyThread t = new MyThread();
		System.out.println(t.getName());// Thread-0
		Thread.currentThread().setName("Bhaskar Thread");
		System.out.println(Thread.currentThread().getName());// BhaskarThread
	}
}
