package phoneboob;

import phoneboob.PhoneBook;

public class Main {
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.add("Caleb", "8887092659");
		System.out.println(phoneBook.getAllContactNames());
	}
}
