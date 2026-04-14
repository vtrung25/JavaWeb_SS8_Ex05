
package com.example.ex05.validation;

import com.example.ex05.dto.TourDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidPriceRangeValidator implements ConstraintValidator<ValidPriceRange, TourDto> {
    @Override
    public boolean isValid(TourDto dto, ConstraintValidatorContext context) {
        if (dto == null) return true;
        if (dto.getAdultPrice() == null || dto.getChildPrice() == null) return true;
        return dto.getChildPrice() <= dto.getAdultPrice();
    }
}