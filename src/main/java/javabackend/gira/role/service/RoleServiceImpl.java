package javabackend.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import javabackend.gira.role.dto.CreateRoleDto;
import javabackend.gira.role.entity.Role;
import javabackend.gira.role.repository.RoleRepository;
import javabackend.gira.role.service.itf.RoleService;

//concrete class
@Service
public class RoleServiceImpl implements RoleService{

private RoleRepository repository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		repository = roleRepository;
	}
	
	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public Role addNewRole(CreateRoleDto dto) {
		Role newRole = new Role();
		
		newRole.setName(dto.getName());
		newRole.setDescription(dto.getDescription());
		
		return repository.save(newRole);
	}

}

