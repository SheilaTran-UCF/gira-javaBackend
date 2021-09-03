package javabackend.gira.user.validation.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import javabackend.gira.common.util.ValidatorUtils;
import javabackend.gira.user.service.UserService;
import javabackend.gira.user.validation.annotation.UniqueUsername;


public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String>{
	private String message;
	private UserService service;
	
	public UniqueUsernameValidator(UserService userService) {
		service = userService;
	}
	
	@Override
	public void initialize(UniqueUsername uniqueUsername) {
		message = uniqueUsername.message();
	}
	
	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		if(username == null)
			return false;
		
		boolean isTaken = service.isTakenUsername(username);
		
		if(!isTaken)
			return true;
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}
