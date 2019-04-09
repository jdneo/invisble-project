import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@Tag("fast")
class MyJUnit5Test {

	@Test
	@DisplayName("My 1st JUnit 5 test! 😎")
	void myFirstTest(TestInfo testInfo) {		
		assertEquals(2, 2);		
	}
}