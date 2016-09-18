/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My
 */
public class Session_7_Assignment_1 {
     public static void main(String[] args) {
		
		 char[] name = new char[] {'R', 'A', 'H', 'U', 'L'};


		try{
			for(int i = name.length; i >=0; i--){
							
				System.out.println("Number at " + i + " position is " + name[i]);
			}
		}
		catch(Exception e){
				
				System.out.println(e);
				
		}
			
		
	}

}


/* 
  Output :
  
  java.lang.ArrayIndexOutOfBoundsException: 5
  
 
*/