package javabackend.gira.program.responsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javabackend.gira.program.entity.Program;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long>{

}
