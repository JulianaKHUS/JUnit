package business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RussianPhoneValidatorTest {
    static String[] validPhones;

    @BeforeAll
    static void setUp() {
        validPhones = new String[] {
                "89999297845",
                "89999297845",
                "89999297845",
                "89999297845",
                "+79999297845"
        };
    }


    @Test
    void validatePHONENUMBER() {
        for (String validPhone : validPhones) {
            Assertions.assertTrue(RussianPhoneValidator.validatePHONENUMBER(validPhone));
        }
        //when
        //boolean result1 = RussianPhoneValidator.validatePHONENUMBER(validPhone1);
        //boolean result2 = RussianPhoneValidator.validatePHONENUMBER(validPhone2);

        //then
        //Assertions.assertTrue(result1);
        //Assertions.assertTrue(result2);
    }
}