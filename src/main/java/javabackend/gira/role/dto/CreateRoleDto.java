package javabackend.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import javabackend.gira.role.validation.anotation.UniqueRoleName;
import javabackend.gira.role.validation.anotation.ValidDescription;

public class CreateRoleDto {
	@NotBlank(message = "{role.name.not-blank}")
	@Size(min = 3, max = 50, message = "{role.name.size}")
    @UniqueRoleName(message = "{role.name.used}")
	
	//@UniqueRoleName // line 12 @uniqueRolename declare already
	private String name;
	
	@ValidDescription
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}