package javabackend.gira.role.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javabackend.gira.common.entity.BaseEntity;

@Entity
@Table(name = "gira_role")
public class Role extends BaseEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	
	@ManyToOne
	private Group group;
	
}
