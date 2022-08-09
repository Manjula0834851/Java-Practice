package inheritance;

class Attachment {
	String name;
	double size;
	String type;

	public Attachment(String name, double size, String type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}

	public void showDetails() {
		System.out.println(" Attachment name = " + name);
		System.out.println("File size = " + size + "kb");
		System.out.println("File type = " + type);
	}
}

class Email {
	String sender;
	String subject;
	String msg;
	Attachment a1 = new Attachment("file1", 2.5, "txt");

	public Email(String sender, String subject, String msg) {
		this.sender = sender;
		this.subject = subject;
		this.msg = msg;
	}

	public void openMail() {
		System.out.println(" sender name = " + sender);
		System.out.println("subject = " + subject);
		System.out.println("msg = " + msg);
	}
}

class Composition {
	public static void main(String[] args) {
		Email e1 = new Email("Abc@gmail.com", "java language", "hello");
		e1.openMail();
		e1.a1.showDetails();
	}
}
