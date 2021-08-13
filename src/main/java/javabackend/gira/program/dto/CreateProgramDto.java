package javabackend.gira.program.dto;

import javabackend.gira.role.util.HttpMethods;

public class CreateProgramDto {
	private String name;
	private HttpMethods method;
	private String path;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HttpMethods getMethod() {
		return method;
	}
	public void setMethod(HttpMethods method) {
		this.method = method;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	
	
}
