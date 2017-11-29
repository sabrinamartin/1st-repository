//This program takes a set of addresses in the txt file and 

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;

public class Main {
	
	final static String filename = "Addresses.txt";
	
	public static void main (String [] args) throws InvalidPropertiesFormatException {
		ArrayList<Address> addressBook = new ArrayList<Address>();
		Scanner file = null;
		//demonstrates try
		try {
			file = new Scanner(new FileInputStream(filename));
			while (file.hasNext()) {
				int number = file.nextInt();
				System.out.println(number);
				String street = file.nextLine();
				System.out.println(street);
				file.useDelimiter(", ");
				String city = file.next("[A-Za-z\\s+]+");
				System.out.println(city);
				file.useDelimiter("\\s+");
				file.skip("[,\\s+]+");
				String state = file.next();
				System.out.println(state);
				if (state.length() != 2) {
					throw new InvalidPropertiesFormatException("State must be 2 letters");
				}
				int zip = file.nextInt();
				System.out.println(zip);
				
				addressBook.add(new Address(number, street, city, state, zip));
			}
		//demonstrate catch
		} catch (FileNotFoundException e) {
			System.out.print("Error: file not found: " + filename);
		//demonstrate finally
		} finally {
			file.close();
		}
	}

}

class Address {
	
	private int number;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public Address(int number, String street, String city, String state, int zip) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
}