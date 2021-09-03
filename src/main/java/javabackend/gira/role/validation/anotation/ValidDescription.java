package javabackend.gira.role.validation.anotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import javabackend.gira.role.validation.validator.ValidDescriptionValidator;

@Constraint(validatedBy = ValidDescriptionValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface ValidDescription {
	public String message() default "description is not valid";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}
