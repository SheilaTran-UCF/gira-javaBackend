package javabackend.gira.role.service;
import java.util.List;

import org.springframework.stereotype.Service;

import javabackend.gira.role.dto.CreateProgramDto;
import javabackend.gira.role.dto.ProgramDto;
import javabackend.gira.role.entity.Program;
import javabackend.gira.role.repository.ProgramRepository;
import javabackend.gira.role.service.itf.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService{
private ProgramRepository repository;
	
	public ProgramServiceImpl(ProgramRepository programRepository) {
		repository = programRepository;
	}
	
	@Override
	public List<ProgramDto> findAll() {
		return repository.findAllDto();
	}

	@Override
	public Program saveProgram(CreateProgramDto dto) {
		Program program = new Program();
		
		program.setName(dto.getName());
		program.setMethod(dto.getMethod());
		program.setPath(dto.getPath());
		
		return repository.save(program);
	}

	@Override
	public boolean isExistedId(Long programId) {
		// TODO Auto-generated method stub
		return repository.existsById(programId);
	}
	
}
