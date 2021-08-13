package javabackend.gira.group.service.itf;

import java.util.List;



import javabackend.gira.group.dto.CreateGroupDto;
import javabackend.gira.group.entity.Group;


public interface GroupService {

	List<Group> findAll();


	Group addNewGroup(CreateGroupDto dto);

}
