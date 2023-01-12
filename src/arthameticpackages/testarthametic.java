package arthameticpackages;

import static org.junit.Assert.*;

import org.junit.Test;

public class testarthametic {

	@Test
	public void test() {
		classarthametic obj =new classarthametic();
		
		int output = obj.Sum(40, 20);
		assertEquals(60,output);
		
		int output1 = obj.substractor(40, 20);
		assertEquals(20,output1);
		
		int output2 = obj.mul(40, 20);
		assertEquals(800,output2);
		
		int output3 = obj.divide(40, 20);
		assertEquals(2,output3);

	}

}
