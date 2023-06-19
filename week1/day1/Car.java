package week1.day1;

public class Car {
public void driveCar() {
	System.out.println("Drive Car: Manual");
}
public void applyBrake() {
	System.out.println("Apply Brake: Yes");
}
public void soundHorn() {
System.out.println("Sound Horn: Good");
}
public void isPuncture() {
System.out.println("Is Puncture: No");
}
public static void main(String[] args) {
Car polo=new Car();
polo.driveCar();
polo.applyBrake();
polo.soundHorn();
polo.isPuncture();
}
}
