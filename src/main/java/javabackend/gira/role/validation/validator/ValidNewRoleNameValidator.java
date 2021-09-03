package javabackend.gira.role.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import javabackend.gira.common.util.ValidatorUtils;
import javabackend.gira.role.dto.UpdateRoleDto;
import javabackend.gira.role.service.itf.RoleService;
import javabackend.gira.role.validation.anotation.ValidNewRoleName;

public class ValidNewRoleNameValidator implements ConstraintValidator<ValidNewRoleName, UpdateRoleDto> {
	private String message;
	private RoleService service;
	
	public ValidNewRoleNameValidator(RoleService roleService) {
		service = roleService;
	}
	
	@Override
	public void initialize(ValidNewRoleName constraintAnnotation) {
		message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(UpdateRoleDto dto, ConstraintValidatorContext context) {
		if(dto.getName().equals(dto.getOldName())) {
			boolean isTaken = service.isTakenName(dto.getName());
			
			if(!isTaken)
				return true;
		}
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}
