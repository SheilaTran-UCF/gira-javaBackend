package javabackend.gira.group.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javabackend.gira.group.entity.Group;




@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{



}
