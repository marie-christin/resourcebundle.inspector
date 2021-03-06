package resourcebundle.inspector.validator;

import java.util.Locale;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.neovisionaries.i18n.LocaleCode;



public class LocaleValidatorTest {

	@Test
	public void testValidate() {
		String actual = "de";
		AssertJUnit.assertTrue(LocaleValidator.validate(actual));
		Locale l = LocaleCode.getByCode(actual, true).toLocale();
		AssertJUnit.assertTrue(l.getLanguage().equals(actual));
		actual = "de_DE";
		AssertJUnit.assertTrue(LocaleValidator.validate(actual));
	}

}
