package javabackend.gira.role.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javabackend.gira.common.entity.BaseEntity;



@Entity
@Table(name = "gira_program")
public class Program extends BaseEntity {
	private String name;
	//private HttpMethods	method; // safe type
	private String path;
	
	@ManyToMany(mappedBy = "programs")
	private Set<Role> roles = new HashSet<>();
}
