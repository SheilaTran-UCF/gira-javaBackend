package javabackend.gira.program.controller;



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
import javabackend.gira.program.dto.CreateProgramDto;
import javabackend.gira.program.entity.Program;
import javabackend.gira.program.service.itf.ProgramService;

@RestController
@RequestMapping("/api/program")
public class ProgramController {

	private ProgramService service;

	public ProgramController(ProgramService programService) {
		service = programService;
	}

	@GetMapping
	public Object findAllProgram() {
		List<Program> programs = service.findAll();
		return ResponseHandler.getResponse(programs, HttpStatus.OK);
	}

	@PostMapping
	public Object SaveProgram(@Valid @RequestBody CreateProgramDto dto, BindingResult errors) {
		if (errors.hasErrors())
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		Program addedProgram = service.addNewProgram(dto);
		return ResponseHandler.getResponse(addedProgram, HttpStatus.CREATED);
	}
}