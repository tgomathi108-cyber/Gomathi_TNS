package nonaccessmodifier;

class Final {
	protected static final String Max = null;
	int Var = 100;
	
	void display() {
		System.out.println("show the value of max: "+Max);
	}

	public static void main(String[] args) {
		Final fd = new Final();
		fd.display();
		fd.Var = 100;

	}

}

class Child extends Final {
	void display() {
		System.out.println("show the value of max: "+Max);
	}
}


