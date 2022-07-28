package org.example.Java_jenkins_in_docker;




import static org.junit.Assert.assertTrue;

import java.util.zip.CheckedInputStream;

import org.junit.Test;

public class TestMain {

	@Test
	public void testInputIsEven() {
	
			assertTrue(Main.checkIfInputIsAnEvenNumber(23));
	}
}
