package javabackend.gira.role.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import javabackend.gira.common.util.ValidatorUtils;
import javabackend.gira.role.service.itf.GroupService;
import javabackend.gira.role.validation.anotation.ExistsGroupId;

public class ExistsGroupIdValidator implements ConstraintValidator<ExistsGroupId, Long>{
	private String message;
	private GroupService service;
	
	public ExistsGroupIdValidator(GroupService groupService) {
		service = groupService;
	}

	@Override
	public void initialize(ExistsGroupId constraintAnnotation) {
		message = constraintAnnotation.message();
	}
	
	@Override
	public boolean isValid(Long groupId, ConstraintValidatorContext context) {
		boolean isExisted = service.isExisted(groupId);
		
		if(isExisted)
			return true;
		
		ValidatorUtils.addError(context, message);
		return false;
	}

}