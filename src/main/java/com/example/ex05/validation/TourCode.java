package com.example.ex05.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = TourCodeValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TourCode {

    String message() default "Mã tour phải bắt đầu bằng VN_ hoặc INT_ theo sau là 5 chữ số";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}