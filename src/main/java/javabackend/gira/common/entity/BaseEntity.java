package javabackend.gira.common.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue
	@Column(updatable = false)
	protected Long id;
	protected int version;
	protected String createdBy;
	protected LocalDateTime createdAt;
	protected String updatedBy;
	protected LocalDateTime updatedAt;
}
