package javabackend.gira.role.dto;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import javabackend.gira.role.validation.anotation.ExistsProgramId;
import javabackend.gira.role.validation.anotation.ExistsRoleId;

public class AddProgramDto {

	@NotNull
	@Min(value = 1)
	@ExistsRoleId
	private Long roleId;
	
	@NotNull
	@Min(value = 1)
	@ExistsProgramId
	private Long programId;
	
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getProgramId() {
		return programId;
	}
	public void setProgramId(Long programId) {
		this.programId = programId;
	}
}