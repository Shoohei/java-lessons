package shoohei.lessons.lesson2operation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("operation")
public class OperationController {

	/**
	 * The method returns the addition of number1 and number2
	 * Ex: it returns 9 if number1 = 5 and number2 = 4
	 *
	 * @return the addition of number1 and number2
	 */
	@GetMapping("add")
	public Integer add(Integer number1, Integer number2) {
		// Code here
		return null;
	}

	/**
	 * The method returns the substraction of number1 by number2
	 * Ex: it returns 2 if number1 = 8 and number2 = 4
	 *
	 * @return the substraction of number1 by number2
	 */
	@GetMapping("substract")
	public Integer substract(Integer number1, Integer number2) {
		// Code here
		return null;
	}

	/**
	 * The method returns the multiplication of number1 by number2
	 * Ex: it returns 8 if number1 = 4 and number2 = 2
	 *
	 * @return the multiplication of number1 by number2
	 */
	@GetMapping("multiply")
	public Integer multiply(Integer number1, Integer number2) {
		// Code here
		return null;
	}

	/**
	 * The method returns the division of number1 by number2
	 * Ex: it returns 3 if number1 = 6 and number2 = 2
	 *
	 * Be careful, the return can be a decimal, it is the reason why the type of the result is Double.
	 *
	 * @return the division of number1 by number2
	 */
	@GetMapping("divide")
	public Double divide(Integer number1, Integer number2) {
		// Code here
		return null;
	}
}
