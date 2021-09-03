package javabackend.gira.user.validation.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import javabackend.gira.common.util.ValidatorUtils;
import javabackend.gira.user.dto.CreateUserDto;
import javabackend.gira.user.validation.annotation.ConfirmPassword;


public class ConfirmPasswordValidator implements ConstraintValidator<ConfirmPassword, CreateUserDto>{
	private String message;
	
	@Override
	public void initialize(ConfirmPassword constraintAnnotation) {
		message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(CreateUserDto dto, ConstraintValidatorContext context) {
		if(dto.getPassword() == null || dto.getConfirmPassword() == null) {
			ValidatorUtils.addError(context, message);
			return false;
		}
			
		if(dto.getPassword().equals(dto.getConfirmPassword()))
			return true;
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}
