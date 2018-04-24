import static org.junit.Assert.*;

import org.junit.Test;

public class Optiontest {

	@Test
	public void test() {
		Option op = new Option("Testing",1000);
		assertEquals(1000, op.price);
	}

	private void assertEquals(int i, int price) {
		// TODO Auto-generated method stub
		
	}

}