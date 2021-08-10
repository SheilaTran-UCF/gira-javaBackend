package javabackend.gira.role.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javabackend.gira.common.entity.BaseEntity;

@Entity
@Table(name = "gira_group")
public class Group extends BaseEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	
	@OneToMany(mappedBy = "group")
	private List<Role> roles = new ArrayList<>();
}
