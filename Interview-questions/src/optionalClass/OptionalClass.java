package optionalClass;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String name = "accenture";
		Optional<String> opt = Optional.ofNullable(name);
		if(opt.isEmpty()) {
			System.out.print(name);
		}
		else
			System.out.println("value not present");

	}

}
