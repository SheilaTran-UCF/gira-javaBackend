package javabackend.gira.role.service;

import java.util.List;

import org.springframework.stereotype.Service;

import javabackend.gira.role.dto.AddProgramDto;
import javabackend.gira.role.dto.CreateRoleDto;
import javabackend.gira.role.dto.RoleDto;
import javabackend.gira.role.entity.Program;
import javabackend.gira.role.entity.Role;
import javabackend.gira.role.repository.ProgramRepository;
import javabackend.gira.role.repository.RoleRepository;
import javabackend.gira.role.service.itf.RoleService;

//concrete class
@Service
public class RoleServiceImpl implements RoleService{

	private RoleRepository repository;
	private ProgramRepository programRepository;
	
	public RoleServiceImpl(RoleRepository roleRepository,
			ProgramRepository programRepository) {
		repository = roleRepository;
		this.programRepository = programRepository;
	}
	
	@Override
	public List<RoleDto> findAll() {
		return repository.findAllDto();
	}

	@Override
	public Role addNewRole(CreateRoleDto dto) {
		Role newRole = new Role();
		
		newRole.setName(dto.getName());
		newRole.setDescription(dto.getDescription());
		
		return repository.save(newRole);
	}

	@Override
	public Role addProgram(AddProgramDto dto) {
		Role role = repository.getById(dto.getRoleId()); 
		Program program = programRepository.getById(dto.getProgramId());
		
		role.addProgram(program);
		
		return repository.save(role);
	}

}
