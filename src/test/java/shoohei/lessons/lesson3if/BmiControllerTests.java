package shoohei.lessons.lesson3if;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import shoohei.lessons.lesson1hello.HelloController;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BmiControllerTests {

	@InjectMocks
	BmiController bmiController;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() {
		bmiController = null;
	}

	@ParameterizedTest
	@CsvSource(value = {
			// weight	| height 	| expectedResult
			"45			| 160		| BMI: 17.58 (Underweight)",
			"48.64		| 160		| BMI: 19.0 (Normal)",
			"75			| 180		| BMI: 23.15 (Normal)",
			"81			| 180		| BMI: 25.0 (Overweight)",
			"90			| 180		| BMI: 27.78 (Overweight)",
			"97.2		| 180		| BMI: 30.0 (Obese)",
			"97.2		| 180		| BMI: 30.0 (Obese)",
			"129.6		| 180		| BMI: 40.0 (Extreme Obesity)",
			"150		| 180		| BMI: 46.3 (Extreme Obesity)",
	},delimiter = '|')
	void testCalculateBmiAndBuildSentence(Double weight, Double height, String expectedResult) {
		String actualResult = bmiController.calculateBmiAndBuildSentence(weight, height);
		assertEquals(expectedResult, actualResult);
	}
}
