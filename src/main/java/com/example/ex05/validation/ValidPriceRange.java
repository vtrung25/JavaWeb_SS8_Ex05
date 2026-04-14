
package com.example.ex05.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidPriceRangeValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPriceRange {
    String message() default "Giá trẻ em phải nhỏ hơn hoặc bằng giá người lớn";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}