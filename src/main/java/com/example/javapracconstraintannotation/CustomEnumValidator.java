package com.example.javapracconstraintannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class CustomEnumValidator implements ConstraintValidator<CustomValid, Enum<?>> {

    private CustomValid annotation;

    @Override
    public void initialize(CustomValid constraintAnnotation) {
        this.annotation = constraintAnnotation;
    }

    @Override
    public boolean isValid(Enum<?> requestEnum, ConstraintValidatorContext context) {
        Object[] enumValues = this.annotation.enumClass().getEnumConstants();
        if (requestEnum != null) {
            return Arrays.stream(enumValues)
                    .anyMatch(enumValue -> requestEnum.equals(enumValue)
                            || (this.annotation.ignoreCase() && requestEnum.toString().equalsIgnoreCase(enumValue.toString())));
        }

        return false;
    }
}
