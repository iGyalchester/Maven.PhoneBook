package phonebook;

import org.junit.Assert;
import org.junit.Test;
import phoneboob.PhoneBook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstructorTest {
	@Test
	public void testNullaryConstructor() {
		// given
		// when
		PhoneBook phoneBook = new PhoneBook();

		// then
		Assert.assertTrue(phoneBook.getPhonebook() instanceof HashMap);
	}

	@Test
	public void testNonNullaryConstructor() {
		// given
		Map<String, List<String>> dependency = new HashMap<>();

		// when
		PhoneBook phoneBook = new PhoneBook(dependency);

		// then
		Assert.assertEquals(dependency, phoneBook.getPhonebook());
	}
}
