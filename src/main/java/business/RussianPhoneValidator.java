package business;

import java.util.regex.Pattern;
public class RussianPhoneValidator {
    private static final Pattern PATTERN = Pattern.compile("^(\\+7|7|8)?[\\s\\-]?\\(?[489][0-9]{2}\\)?[\\s\\-]?[0-9]{3}[\\s\\-]?[0-9]{2}[\\s\\-]?[0-9]{2}$");
    public static boolean validatePhoneNumber(String phoneNumber) {
        return PATTERN.matcher(phoneNumber).matches();
    }
    }

