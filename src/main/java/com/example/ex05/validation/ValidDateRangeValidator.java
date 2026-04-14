package com.example.ex05.validation;

import com.example.ex05.dto.TourDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidDateRangeValidator implements ConstraintValidator<ValidDateRange, TourDto> {
    @Override
    public boolean isValid(TourDto dto, ConstraintValidatorContext context) {
        if (dto == null) return true;
        if (dto.getStartDate() == null || dto.getEndDate() == null) return true;
        return dto.getEndDate().isAfter(dto.getStartDate());
    }
}