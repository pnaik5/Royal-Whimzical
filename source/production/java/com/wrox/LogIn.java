package com.wrox;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;



@WebServlet(
        name = "loginServlet",
        urlPatterns = "/login"
)
public class LogIn {
	private static Scanner input;
	private static String pass;

	public static void main(String[]args){
		input = new Scanner(System.in);
		
		String user;
		pass = null;
		
		System.out.print("username:");
		user=input.nextLine();
		
		System.out.print("password:");
		user=input.nextLine();
	if(user.equals("Parth")){
			System.out.println("You're logged in succesfully");
	}else{
		System.out.println("Incorrect Password");
	}
		
	}
}