package javabackend.gira.role.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javabackend.gira.role.entity.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}
