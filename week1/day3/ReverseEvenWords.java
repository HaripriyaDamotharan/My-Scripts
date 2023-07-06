package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
     String text = "I am a software tester";
     
     String[] split = text.split(" ");
     
     for (int i = 0; i < split.length; i++) {
    	 if (i%2!=0) {
    		// System.out.println(split[i]);
    		 char[] ch = split[i].toCharArray();
    		 String rev="";
    		 for (int j = ch.length-1; j >=0; j--) {
				 
    			 rev= rev+ch[j];
			}
    			System.out.print(rev+" ");	
		} else {
			
			System.out.print(split[i]+" ");
			
		}
		
	}
     
	}

}
