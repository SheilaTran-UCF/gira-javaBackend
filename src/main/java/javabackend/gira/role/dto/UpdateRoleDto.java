package javabackend.gira.role.dto;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

public class UpdateRoleDto {

	@NotNull
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String oldName;
	
	private String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOldName() {
		return oldName;
	}
	public void setOldName(String oldName) {
		this.oldName = oldName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
