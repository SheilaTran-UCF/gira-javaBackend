package javabackend.gira.role.service.itf;

import java.util.List;
import javax.validation.Valid;

import javabackend.gira.role.dto.CreateGroupDto;
import javabackend.gira.role.dto.GroupDto;
import javabackend.gira.role.entity.Group;

public interface GroupService {

	boolean isTakenName(String groupName);

	List<GroupDto> findAll();

	Group add(CreateGroupDto dto);

	boolean isExisted(Long groupId);

	

}

