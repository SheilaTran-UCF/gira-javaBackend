package javabackend.gira.role.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import javabackend.gira.role.service.itf.RoleService;
import javabackend.gira.role.validation.anotation.UniqueRoleName;

public class UniqueRoleNameValidator implements ConstraintValidator<UniqueRoleName, String>  {

	private String message;
	private RoleService service;
	
	public UniqueRoleNameValidator(RoleService roleService) {
		service = roleService;
	}
	
	
	@Override
	public void initialize(UniqueRoleName constraintAnnotation) {
		this.message = constraintAnnotation.message();
	}


	@Override
	public boolean isValid(String roleName, ConstraintValidatorContext context) {
		boolean isTaken = service.isTakeName(roleName);
		
		if(!isTaken)
			return true;
		
		context.buildConstraintViolationWithTemplate("message")
			.addConstraintViolation()
			.disableDefaultConstraintViolation();
		return false;
	}

}
