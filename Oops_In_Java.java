//codeby : Dileep

//Class and Object
public class Pen {
	String ink;
	String type;
	
	public void write() {
		System.out.println("Writing Successfully");
		
	}
	public void print() {
		System.out.println(this.ink);
		System.out.println(this.type);
	}

	public static void main(String[] args) {
		Pen obj = new Pen();
		obj.ink = "Blue";
		obj.type = "BallPoint";
		
		obj.write();
		obj.print();
	}

}
