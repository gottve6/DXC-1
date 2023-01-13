package com.dxc.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dto.UserDTO;
import com.dxc.model.UserDetailsResponseData;
import com.dxc.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/get")
	public String getUser() {
		return "working with port :"+env.getProperty("local.server.port");
	}
	
	@PostMapping("/create")
	public ResponseEntity createUser(@RequestBody UserDetailsResponseData userDetails) {
		
		ModelMapper modelMapper = new ModelMapper();
		UserDTO userDTO=modelMapper.map(userDetails, UserDTO.class);
		userService.createUser(userDTO);
		
		
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public String updateUser() {
		return "user updated";
	}
	
	@DeleteMapping("/delete")
	public String deleteUser() {
		return "user deleted";
	}

}
