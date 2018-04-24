import static org.junit.Assert.*;

import org.junit.Test;

public class Usertest {

	@Test
	public void test() {
		User person = new User("Ramdev");
		assertEquals("Ramdev", person.Username);
	}

}