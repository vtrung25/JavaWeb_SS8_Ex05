package com.example.ex05.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidDateRangeValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDateRange {
    String message() default "Ngày kết thúc phải sau ngày khởi hành";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}