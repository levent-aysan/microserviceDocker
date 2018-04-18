package microser;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class help {

	@RequestMapping("/nedir/{id}")
	public String greeting(@PathVariable int id) {
		return Fizbuzla(id);
	}

	public static String Fizbuzla(int i) {
		String s = "";
		if (i % 3 == 0) {
			s = s + "Fizz ";
		}
		if (i % 5 == 0) {
			s = s + "Buzz";
		}
		if (s.length() == 0)
			s = String.valueOf(i);
		return s;
	}

}
