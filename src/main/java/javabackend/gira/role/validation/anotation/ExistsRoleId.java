package javabackend.gira.role.validation.anotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import javabackend.gira.role.validation.validator.ExistsRoleIdValidator;

@Constraint(validatedBy = ExistsRoleIdValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface ExistsRoleId {
	public String message() default "Role doesn't exists";
	
//	public int min() default 3;
//	public int max() default 50;
//	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
