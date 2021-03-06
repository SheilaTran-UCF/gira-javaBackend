package javabackend.gira.role.service;

import java.util.List;
import org.springframework.stereotype.Service;

import javabackend.gira.role.dto.CreateGroupDto;
import javabackend.gira.role.dto.GroupDto;
import javabackend.gira.role.entity.Group;
import javabackend.gira.role.repository.GroupRepository;
import javabackend.gira.role.service.itf.GroupService;

@Service
public class GroupServiceImpl implements GroupService{

	private GroupRepository repository;

	public GroupServiceImpl(GroupRepository groupRepository) {
		repository = groupRepository;
	}
	
	@Override
	public boolean isTakenName(String groupName) {
		return repository.countByName(groupName) >= 1;
	}

	@Override
	public List<GroupDto> findAll() {
		return repository.findAllDto();
	}

	@Override
	public Group add(CreateGroupDto dto) {
		Group group = new Group();
		group.setName(dto.getName());
		group.setDescription(dto.getDescription());
		
		return repository.save(group);
	}

	@Override
	public boolean isExisted(Long groupId) {
		return repository.existsById(groupId);
	}

}
