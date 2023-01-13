package com.dxc.service;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.dto.UserDTO;
import com.dxc.entity.UserEntity;
import com.dxc.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	UserRepository userRepository;
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDTO createUser(UserDTO userDetails) {
		userDetails.setUserId(UUID.randomUUID().toString());
		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = modelMapper.map(modelMapper, UserEntity.class);
		
		userRepository.save(userEntity);
		
		return null;
	}

}
