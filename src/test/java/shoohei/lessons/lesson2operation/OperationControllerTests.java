package shoohei.lessons.lesson2operation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationControllerTests {

	@InjectMocks
	OperationController operationController;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() {
		operationController = null;
	}

	@ParameterizedTest
	@CsvSource(value = {
			// number1	| number2 	| expectedResult
			"1			| 2			| 3",
			"4			| 5			| 9",
			"-2			| -1		| 3",
			"-1			| 2			| 1",
	},delimiter = '|')
	void testAdd(Integer number1, Integer number2, Integer expectedResult) {
		Integer actualResult = operationController.add(number1, number2);
		assertEquals(expectedResult, actualResult);
	}

	@ParameterizedTest
	@CsvSource(value = {
			// number1	| number2 	| expectedResult
			"1			| 2			| -1",
			"4			| 3			| 1",
	},delimiter = '|')
	void testSubstract(Integer number1, Integer number2, Integer expectedResult) {
		Integer actualResult = operationController.substract(number1, number2);
		assertEquals(expectedResult, actualResult);
	}

	@ParameterizedTest
	@CsvSource(value = {
			// number1	| number2 	| expectedResult
			"1			| 2			| 2",
			"4			| 3			| 12",
			"4			| -1		| -4",
	},delimiter = '|')
	void testMultiply(Integer number1, Integer number2, Integer expectedResult) {
		Integer actualResult = operationController.multiply(number1, number2);
		assertEquals(expectedResult, actualResult);
	}

	@ParameterizedTest
	@CsvSource(value = {
			// number1	| number2 	| expectedResult
			"1			| 2			| 0.5",
			"10			| 5			| 2",
			"10			| -1		| -10",
	},delimiter = '|')
	void testDivide(Integer number1, Integer number2, Double expectedResult) {
		Double actualResult = operationController.divide(number1, number2);
		assertEquals(expectedResult, actualResult);
	}
}
