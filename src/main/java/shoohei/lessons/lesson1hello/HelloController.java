package shoohei.lessons.lesson1hello;

import org.springframework.web.bind.annotation.RestController;

@RestController("hello")
public class HelloController {

	/**
	 * The method returns the String 'Hello, World!'
	 *
	 * @return 'Hello, World!'
	 */
	public String helloWorld() {
		// Code here
		return null;
	}

	/**
	 * The method returns the String 'Hello, _name_!' depending on the parameter 'name'
	 * Ex: if name is 'Tony', the response should be 'Hello, Tony!'
	 *
	 * @return 'Hello, _name_!' depending on the parameter 'name'
	 */
	public String helloYou(String name) {
		// Code here
		return null;
	}
}
