package application;

import Showallfile.*;
import fileOption.*;import java.util.Scanner;

public class LockedMeApplication {
	
			
	//public static int mainmenu() {
	public static void main(String[] args) {
		System.out.println("**************************************************************************************************************");
	    System.err.println("            ******************* LockedMe.com **************        ");
	   		System.err.println( "                                                             Developed by:Tejashri Jadhav"); 
            System.err.println("                                                              EmailId:tejashrijadhav3128");
		System.out.println(" ************************************************************************************************************"); 
			

		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
	
		boolean mainLoop=true;
		int choice;
while(true) {

//Display the menu
	
System.out.println();
System.out.println("               **************Welcome to your File Management System ****************                       ");
	


System.out.println("Your choice Are As Follows:");
System.out.println(" choice 1 => To show current all file names  in Directory in ascending order");
System.out.println(" choice 2 => File Option Menu");
System.out.println(" choice 3=>  Exit");


System.out.println();
System.out.println(" **********Please Enter your choice:");


//Get user choice
 choice = in.nextInt();

//Display the title of the chosen  module
switch (choice)
{
case 1:
	ShowallFiles sf=new ShowallFiles();
	sf.Show();
		
	break;
	
case 2:
	FileManagement fn=new FileManagement();
	fn.Filemenu();
	
	
	break;

case 3:
		System.out.println("Exiting Program...");
	 System.exit(0);
	break;
default:
	 System.out.println("This is not a valid Menu Option! Please Select Another");

break;

}
	}

}
	
}




                




		
	


