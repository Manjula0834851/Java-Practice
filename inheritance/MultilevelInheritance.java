package inheritance;

class WhatsappV1 {
	public void msg() {
		System.out.println("this is msg ()");
	}
}

class WhatsappV2 extends WhatsappV1 {
	public void voiceMsg() {
		System.out.println("this is voice msg ");
	}
}

class WhatsappV3 extends WhatsappV2 {
	public void video() {
		System.out.println("This is video ()");
	}
}

class MultilevelInheritance {
	public static void main(String[] args) {
		WhatsappV3 v = new WhatsappV3();
		v.msg();
		v.voiceMsg();
		v.video();
		WhatsappV2 v2 = new WhatsappV2();
		v2.msg();
		v2.voiceMsg();
		WhatsappV1 v1 = new WhatsappV1();
		v1.msg();
	}
}
