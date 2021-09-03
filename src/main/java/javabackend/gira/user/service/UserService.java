package javabackend.gira.user.service;
import java.util.List;


import javabackend.gira.user.dto.CreateUserDto;
import javabackend.gira.user.dto.UserDto;
import javabackend.gira.user.entity.User;


public interface UserService {

	List<UserDto> findAllDto();

	boolean isTakenUsername(String username);

	boolean isTakenEmail(String email);

	User createUser(CreateUserDto dto);

}