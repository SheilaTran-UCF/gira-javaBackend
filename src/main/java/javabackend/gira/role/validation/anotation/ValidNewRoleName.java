package javabackend.gira.role.validation.anotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
public @interface ValidNewRoleName {
	String message() default "Description is not valid.";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
