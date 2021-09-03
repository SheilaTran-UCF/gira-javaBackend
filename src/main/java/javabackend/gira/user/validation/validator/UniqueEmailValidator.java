package javabackend.gira.user.validation.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import javabackend.gira.common.util.ValidatorUtils;
import javabackend.gira.user.service.UserService;
import javabackend.gira.user.validation.annotation.UniqueEmail;


public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String>{

	private String message;
	private UserService service;
	
	public UniqueEmailValidator(UserService userService) {
		service = userService;
	}
	
	@Override
	public void initialize(UniqueEmail uniqueEmail) {
		message = uniqueEmail.message();
	}
	
	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if(email == null)
			return false;
		
		boolean isTaken = service.isTakenEmail(email);
		
		if(!isTaken)
			return true;
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}
