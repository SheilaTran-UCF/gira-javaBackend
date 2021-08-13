package javabackend.gira.program.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import javabackend.gira.common.entity.BaseEntity;
import javabackend.gira.role.entity.Role;
import javabackend.gira.role.util.HttpMethods;

@Entity
public class Program extends BaseEntity {
	private String name;
	private HttpMethods  method;
	private String path;

	@ManyToMany(mappedBy = "programs")
	private Set<Role> roles = new HashSet<>();

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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	

	
	}

