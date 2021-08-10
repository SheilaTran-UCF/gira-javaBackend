package javabackend.gira.role.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gira_role")
public class Role {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	
}
