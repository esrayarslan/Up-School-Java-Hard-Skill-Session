package UserInformation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	try {
	
	String name = getName();
	validateName(name);
	String surname = getSurname();
	validateSurname(surname);
	String tckn = getTCKN();
	validateTCKN(tckn);
	String email = getEmail();
	validateEmail(email);
	String birthYear = getBirthYear();
	validateBirthYear(birthYear);
	
	
	} catch (TCKNInvalidException e) {
		System.out.print(e.getMessage());
	} catch (EmailInvalidException e) {
		System.out.print(e.getMessage());
	} catch (BirthYearInvalidException e) {
		System.out.print(e.getMessage());
	} catch (TextContainsDigitsException e) {
		System.out.printf(e.getMessage(), e.getText());
		System.out.print(" Error , Please try again later...");
		

	} 
	
	}


	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name : ");
		return scanner.nextLine();
	} 
	
	public static String getSurname() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your surname : ");
		return scanner.nextLine();
	}
	
	public static String getTCKN() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your tckn : ");
		return scanner.nextLine();
	}
	
	public static String getEmail() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your email : ");
		return scanner.nextLine();
	} 
	
	public static String getBirthYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your birth year : ");
		return scanner.nextLine();
	} 
	
	public static void validateName(String name) throws TextContainsDigitsException {
		if(containsDigits(name)) {
			throw new TextContainsDigitsException("The surname cannot numbers." , name);
		}
	}
	

	private static boolean containsDigits(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void validateSurname(String surname) throws TextContainsDigitsException {
		if(containsDigits(surname)) {
			throw new TextContainsDigitsException("The surname cannot numbers." , surname);
		}
	}
	
	public static void validateTCKN(String tckn) throws TCKNInvalidException {
		if(!tckn.matches("\\d{11}")) {
			throw new TCKNInvalidException("TCKN is invalid. It must be 11 characters.");
		}
	}
	
	public static void validateEmail(String email) throws EmailInvalidException {
		if(!email.matches("^(.+)@(.+)$")) {
			throw new EmailInvalidException("The email is invalid. It must contain at least one '@' character and end with .com.");
		}
	}
	
	public static void validateBirthYear(String birthYear) throws BirthYearInvalidException {
		if(birthYear.length() != 4) {
			throw new BirthYearInvalidException("The year of birth is invalid. It must be 4 characters and cannot contain letters.");
		}
		
		
		
		
	
	
	
	
	
	
	}}
