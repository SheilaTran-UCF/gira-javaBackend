package javabackend.gira.role.service.itf;

import java.util.List;

import javax.validation.Valid;

import javabackend.gira.role.dto.AddProgramDto;
import javabackend.gira.role.dto.CreateRoleDto;
import javabackend.gira.role.dto.RoleDto;
import javabackend.gira.role.entity.Role;

//abstraction
public interface RoleService {
	// contract
		List<RoleDto> findAll();

		Role addNewRole(CreateRoleDto dto);

		Role addProgram(AddProgramDto dto);
	}
