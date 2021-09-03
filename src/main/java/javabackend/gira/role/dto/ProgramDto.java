package javabackend.gira.role.dto;

import javabackend.gira.role.util.HttpMethods;

public interface ProgramDto {
	// projection
		public Long getId();
		public String getName();
		public HttpMethods getMethod();
		public String getPath();
		
	}
