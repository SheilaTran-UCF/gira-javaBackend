package javabackend.gira.role.service.itf;

import java.util.List;

import javax.validation.Valid;

import javabackend.gira.role.dto.CreateProgramDto;
import javabackend.gira.role.dto.ProgramDto;
import javabackend.gira.role.entity.Program;

public interface ProgramService {
	List<ProgramDto> findAll();

	Program saveProgram(CreateProgramDto dto);
	
}
