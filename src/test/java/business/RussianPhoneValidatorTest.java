package business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RussianPhoneValidatorTest {
    @ParameterizedTest

    @CsvSource(value =  {
                "89999297845, true",
                "89999297845, true",
                "123654, false",
                "8754444, false",
                "+79999297845, true"
    })


    @Test
    void validatePhoneNumber(String validPhone, boolean expected) {
            Assertions.assertEquals(expected, RussianPhoneValidator.validatePhoneNumber(validPhone));
        }

    }
