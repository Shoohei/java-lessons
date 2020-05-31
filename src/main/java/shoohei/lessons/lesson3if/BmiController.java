package shoohei.lessons.lesson3if;

import org.springframework.web.bind.annotation.RestController;

@RestController("bmi")
public class BmiController {

	/**
	 * The method calculates the BMI from the weight and height and returns the number + a sentence according to the BMI
	 * You can find the equation of the BMI on the internet.
	 *
	 * Regarding the sentence, here is the condition:
	 * - if BMI lower than 19 					=> The sentence will be 'BMI: _number_ (Underweight)'
	 * - if BMI between 19 (included) and 25 	=> The sentence will be 'BMI: _number_ (Normal)'
	 * - if BMI between 25 (included) and 30	=> The sentence will be 'BMI: _number_ (Overweight)'
	 * - if BMI between 30 (included) and 40	=> The sentence will be 'BMI: _number_ (Obese)'
	 * - if BMI upper than 40 (included)		=> The sentence will be 'BMI: _number_ (Extreme Obesity)'
	 *
	 * The BMI will be round with 2 decimals. You can use "bmi = Math.round(bmi * 100.0) / 100.0;"
	 *
	 * @param weight The weight in kg
	 * @param height The height in cm
	 * @return 'BMI: _number_ (_text_)'
	 */
	public String calculateBmiAndBuildSentence(Double weight, Double height) {
		// Code here
		return null;
	}
}
