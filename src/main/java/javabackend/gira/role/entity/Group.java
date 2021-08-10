package javabackend.gira.role.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gira_group")
public class Group {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
}
