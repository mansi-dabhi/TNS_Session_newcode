package tnssession;

public class String_Uper_Low {
	
		
	
		
		public static void main(String[] args) {

			String s = "Mansi";
			
				if(s.equals(s.toLowerCase())) {
					System.out.println("converted into uppercase" );
					 s=s.toUpperCase();
					
					
				}
				else {
					System.out.println("converted in to lowercase");
					s=s.toLowerCase();
				
			}
				 System.out.println(s.charAt(0));
		
		 
	}

}
