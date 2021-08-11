package javabackend.gira.role.service.itf;

import java.util.List;

import javabackend.gira.role.dto.CreateRoleDto;
import javabackend.gira.role.entity.Role;

//abstraction
public interface RoleService {
	// contract
		List<Role> findAll();

		Role addNewRole(CreateRoleDto dto);
	}
