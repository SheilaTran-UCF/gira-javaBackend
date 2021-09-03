package javabackend.gira.role.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javabackend.gira.common.ResponseHandler;
import javabackend.gira.role.dto.CreateProgramDto;
import javabackend.gira.role.dto.ProgramDto;
import javabackend.gira.role.entity.Program;
import javabackend.gira.role.service.itf.ProgramService;


@RestController
@RequestMapping("api/program")
public class ProgramController {
private ProgramService service;
	
	// constructor inject
	public ProgramController(ProgramService programService) {
		service = programService;
	}
	
	@GetMapping
	public Object findAllPrograms() {
		List<ProgramDto> programs = service.findAll();
		
		return ResponseHandler.getResponse(programs, HttpStatus.OK);
	}
	
	@PostMapping
	public Object saveProgram(@Valid @RequestBody CreateProgramDto dto
			, BindingResult errors ) {
		if(errors.hasErrors())
			return ResponseHandler.getResponse(HttpStatus.BAD_REQUEST);
		
		Program newProgram = service.saveProgram(dto);
		
		return ResponseHandler.getResponse(newProgram, HttpStatus.CREATED);
	}

}
