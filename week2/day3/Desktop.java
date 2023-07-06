package week2.day3;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Desktop size is 17''");
	}
	
	public static void main(String[] args) {
		
		Desktop object = new Desktop();
		object.computerModel();
		object.desktopSize();
		
		
	}

}
