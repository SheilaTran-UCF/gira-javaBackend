package javabackend.gira.group.service;
import java.util.List;

import org.springframework.stereotype.Service;

import javabackend.gira.group.dto.CreateGroupDto;
import javabackend.gira.group.entity.Group;
import javabackend.gira.group.responsitory.GroupRepository;
import javabackend.gira.group.service.itf.GroupService;


@Service
public class GroupServiceImpl implements GroupService{
	
	private GroupRepository repository;

	public GroupServiceImpl(GroupRepository groupRepository) {
		repository = groupRepository;
	}

	@Override
	public List<Group> findAll() {

		return repository.findAll();
	}

	@Override
	public Group addNewGroup(CreateGroupDto dto) {
		Group newGroup = new Group();
		
		newGroup.setName(dto.getName());
		newGroup.setDescription(dto.getDescription());

		return this.repository.save(newGroup);
	}

}
