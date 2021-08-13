package javabackend.gira.program.service;

import java.util.List;

import org.springframework.stereotype.Service;

import javabackend.gira.program.dto.CreateProgramDto;
import javabackend.gira.program.entity.Program;
import javabackend.gira.program.responsitory.ProgramRepository;
import javabackend.gira.program.service.itf.ProgramService;


@Service
public class ProgramServiceImpl implements ProgramService{
	private ProgramRepository repository;
	
	public ProgramServiceImpl(ProgramRepository programRepository) {repository =programRepository; 
	}	
	@Override
	public List<Program> findAll() {
		return repository.findAll();
	}		
		@Override
		public Program addNewProgram(CreateProgramDto dto) {
			Program newProgram = new Program();
			
			newProgram.setName(dto.getName());
			newProgram.setMethod(dto.getMethod());
			newProgram.setPath(dto.getPath());
			
			return repository.save(newProgram);
		


	}
}
