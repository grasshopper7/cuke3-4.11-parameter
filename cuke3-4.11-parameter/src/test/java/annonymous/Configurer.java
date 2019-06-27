package annonymous;

import java.util.Locale;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;

public class Configurer implements TypeRegistryConfigurer {

	@Override
	public void configureTypeRegistry(TypeRegistry registry) {

		registry.defineParameterType(
				new ParameterType<>("customer", ".*?", Customer.class, Customer::new));

		registry.defineParameterType(
				new ParameterType<>("beverage", ".*?", Beverage.class, (String s) -> Beverage.valueOf(s)));
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}
}
