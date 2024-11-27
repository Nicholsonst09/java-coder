package com.coderhouse.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.models.User;
import com.coderhouse.services.UserService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController  //va el 'Rest' porque solo va a retornar o manejar todas solicitudes Rest
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping(value = "/", produces= {MediaType.APPLICATION_JSON_VALUE}) //Con eso indicamos que los datos que obtengamos vengan en formato json
	public ResponseEntity<List<User>> getAllUsers () {
		try {
			List<User> users = userService.getAllUsers();
			return ResponseEntity.ok(users);
		}catch(Exception e){
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@GetMapping(value ="/{id}",produces= { MediaType.APPLICATION_JSON_VALUE} ) 
	public ResponseEntity<User> getUserById(@PathVariable String id) {
		try {
			User user = userService.getUserById(id);
			return user != null ? ResponseEntity.ok(user)
					: ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@PostMapping(value = "/", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<User> addUser(@RequestBody User user) {
		try {
			User newUser = userService.addUser(user);
			return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}		
	}
	
	@PutMapping (value ="/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user){
		try {
			user.setId(id);
			User userToUpdate = userService.updateUser(user);
			return ResponseEntity.ok(userToUpdate);
		} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteUser (@PathVariable String id){
		try {
			userService.deleteUser(id);
			return ResponseEntity.noContent().build();
			} catch (Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	
	
}