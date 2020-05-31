package shoohei.lessons.lesson1hello;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTests {

	@InjectMocks
	HelloController helloController;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() {
		helloController = null;
	}

	@Test
	void testHelloWorld() {
		String actualResult = helloController.helloWorld();
		assertEquals("Hello, World!", actualResult);
	}

	@ParameterizedTest
	@CsvSource(value = {
			// name	| expectedResult
			"Tony	| Hello Tony",
			"Mika	| Hello Mika"
	},delimiter = '|')
	void testHelloYou(String name, String expectedResult) {
		String actualResult = helloController.helloYou(name);
		assertEquals(expectedResult, actualResult);

	}
}
