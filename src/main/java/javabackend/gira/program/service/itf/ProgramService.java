package javabackend.gira.program.service.itf;

import java.util.List;

import javabackend.gira.program.dto.CreateProgramDto;
import javabackend.gira.program.entity.Program;

public interface ProgramService {

List<Program> findAll();
	
	Program addNewProgram(CreateProgramDto dto);

}
