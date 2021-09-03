package javabackend.gira.role.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import javabackend.gira.common.util.ValidatorUtils;
import javabackend.gira.role.service.itf.RoleService;
import javabackend.gira.role.validation.anotation.ExistsRoleId;

public class ExistsRoleIdValidator implements ConstraintValidator<ExistsRoleId, Long>{
	private String message;
	private RoleService service;
	
	public ExistsRoleIdValidator(RoleService roleService) {
		service = roleService;
	}
	
	@Override
	public void initialize(ExistsRoleId constraintAnnotation) {
		message = constraintAnnotation.message();
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	

	@Override
	public boolean isValid(Long roleId, ConstraintValidatorContext context) {
	  boolean isExisted = service.isExistedId(roleId);
		
		if(isExisted)
			return true;
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}
