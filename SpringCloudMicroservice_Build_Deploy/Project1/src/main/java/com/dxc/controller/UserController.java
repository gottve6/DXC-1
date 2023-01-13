package com.dxc.controller;

import java.util.Map;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.entity.User;
import com.dxc.entity.UserDetailsResponseData;

@RestController
@RequestMapping("/users")
public class UserController {

	Map<String, User> map;
	/*
	 * // http://localhost:8080/users/1011
	 * 
	 * @GetMapping("/{userId}") public String getUser(@PathVariable String userId) {
	 * return "get user was called with :"+userId; }
	 */

	/*
	 * @GetMapping("/{userId}") public User getUser(@PathVariable String userId) {
	 * User user = new User(); user.setUid(101); user.setUname("venkat");
	 * 
	 * return user; }
	 */

	@GetMapping("/{userid}")
	public ResponseEntity<User> getUser(@PathVariable String userid) {
		User user = new User();
		user.setFirstName("venkat");
		user.setLastName("gottemukkala");
		user.setEmail("venkata.gottemukkala@gmail.com");
		String uid = UUID.randomUUID().toString();
		user.setUid(uid);
		if (uid != null) {
			map.put(uid, user);
		}
		if (map.containsKey(uid)) {
			return new ResponseEntity<>(map.get(uid), HttpStatus.OK);
		} else {
			return new ResponseEntity<User>(HttpStatus.OK);
		}
	}

	/*
	 * // http://localhost:8080/users?id=1011&name=venu
	 * 
	 * @GetMapping public String getUsers(@RequestParam(value="id") String
	 * id, @RequestParam("name") String name) { return
	 * "get user was called with "+id+" and "+name; }
	 */

	// http://localhost:8080/users?id=1011&name=venu
	@GetMapping
	public String getUsers(@RequestParam(value = "id", defaultValue = "1") String id,
			@RequestParam(value = "name", defaultValue = "venu") String name) {
		return "get user was called with " + id + " and " + name;
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE })
	public ResponseEntity<User> createUser(@RequestBody UserDetailsResponseData userDetails) {
		User user = new User();
		user.setFirstName("venkat");
		user.setLastName("gottemukkala");
		user.setEmail("venu.gottemukkala@gmail.com");

		String uid = UUID.randomUUID().toString();
		user.setUid(uid);
		if (uid == null) {
			map.put(uid, user);
		}
		user.setUid(uid);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@PutMapping(path = "/{uid}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_ATOM_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_ATOM_XML_VALUE })
	public User updateUser(@PathVariable String uid, @RequestBody UserDetailsResponseData userDetails) {
		User user = map.get(uid);
		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());

		map.put(uid, user);
		return user;
	}

	@DeleteMapping("/{uid}")
	public ResponseEntity<Void> deleteUser(@PathVariable String uid) {
	map.remove(uid);
	return ResponseEntity.noContent().build();
	}
}
