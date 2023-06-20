package week1.day2;

public class AssignmentConvertNegativeNumber {

	public static void main(String[] args) {
int num=-60;
if (num<0) 
{
	System.out.println("The given number is negative");
} 
else {
	System.out.println("The given number is positive");
}

num=num*(-1);
System.out.println("The negative number is converted to positive number" +num);
	}

}
