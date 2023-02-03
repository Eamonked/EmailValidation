package Assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class validationOfAnEmailID {

	public static void main(String[] args) {



		
	List<String> emailId = new LinkedList<>();
			
			emailId.add("xyz@gmail.com");
			emailId.add("abc@gmail.com");
			emailId.add("qwerty@gmail.com");
			emailId.add("pony@gmail.com");
			emailId.add("test@gmail.com");
			emailId.add("ken@gmail.com");
			emailId.add("laptop@gmail.com");
			emailId.add("jerry@gmail.com");
			emailId.add("cathy@gmail.com");
			emailId.add("eamon@gmail.com");
			emailId.add("emma@gmail.com");
			emailId.add("xyz@yahoo.com");
			emailId.add("nmh@yahoo.com");
	
			
			while (true) {

			System.out.println("Please Enter you Email Address:: \n");
			Scanner StringValue = new Scanner(System.in);
			
			String Val1 = StringValue.next();
			

			System.out.println(emailId.size());
			
			
				if (emailId.contains(Val1)){
					System.out.println("Email:: " + Val1 + " Exists");
				}
				else {
					System.out.println("Email:: " + Val1 + " Does Not Exist \n");
					System.out.println("to add the email entered, press : 1  OR \n to cancel Press : 0 \n");
					int Val2 = StringValue.nextInt();
					if (Val2 == 1) {
						emailId.add(Val1);
						System.out.println("Email:: " + Val1 + " Successfully added \n \n");
						for(String name: emailId) {
							System.out.println(name);
						}
						
						
						System.out.println("Email List current Size: \n" + emailId.size());
						
					}
					else {
						System.out.println("Please try again \n");
					}
						
						
					
				}
			}
			

			
			
	}

}
