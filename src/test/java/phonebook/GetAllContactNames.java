package phonebook;


import org.junit.Assert;
import org.junit.Test;
import phoneboob.PhoneBook;

import java.util.Arrays;
import java.util.List;

public class GetAllContactNames {
	@Test
	public void test1() {
		// given
		PhoneBook phoneBook = new PhoneBook();
		String[] names = new String[]{"Joe", "Jay", "John", "Jim"};
		for (String name : names) {
			phoneBook.add(name, "");
		}

		// when
		List<String> actualNames = phoneBook.getAllContactNames();

		// then
		Assert.assertEquals(Arrays.asList(names), actualNames);
	}

	@Test
	public void test2() {
		// given
		PhoneBook phoneBook = new PhoneBook();
		String[] names = new String[]{"Christopher", "Chris", "Christian", "Christina"};
		for (String name : names) {
			phoneBook.add(name, "");
		}

		// when
		List<String> actualNames = phoneBook.getAllContactNames();

		// then
		Assert.assertEquals(Arrays.asList(names), actualNames);
	}

	@Test
	public void test3() {
		// given
		PhoneBook phoneBook = new PhoneBook();
		String[] names = new String[]{"Aaron", "Ashley", "Albert", "Alfred"};
		for (String name : names) {
			phoneBook.add(name, "");
		}

		// when
		List<String> actualNames = phoneBook.getAllContactNames();

		// then
		Assert.assertEquals(Arrays.asList(names), actualNames);
	}
}

