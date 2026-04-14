
package com.example.ex05.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class TourCodeValidator implements ConstraintValidator<TourCode, String> {

    private static final Pattern PATTERN = Pattern.compile("^(VN_|INT_)\\d{5}$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) return true;
        return PATTERN.matcher(value).matches();
    }
}