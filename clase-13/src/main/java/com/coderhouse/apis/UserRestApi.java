package com.coderhouse.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.interfaces.UserRestInterface;
import com.coderhouse.models.User;

@Component
public class UserRestApi implements UserRestInterface{

	private final String URL_BASE = "https://67456590512ddbd807f7d324.mockapi.io/users";
	
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public List<User> getAllUsers() {
		try {
			@SuppressWarnings("unchecked")
			List<User> users = restTemplate
					.exchange(URL_BASE, HttpMethod.GET,null, List.class).getBody();			//el null es porque no le damos nada, sino que solo pedimos que nos traiga algo, y recibo una lista
			return users;
		} catch (Exception e) {
			throw new RuntimeException("There is an error getting all users" + e.getMessage());
		}
	}

	@Override
	public User getUserById(String id) {
		try {
			String url = URL_BASE + "/" + id;
			return restTemplate.getForObject(url, User.class);				//En este y todos se podría usar el .exchange y usar el método http correcto y ver que los parámetros sean todos los que necesito		
		} catch (Exception e) {
			throw new RuntimeException("There is an error getting the user" + e.getMessage());
		}
	}

	@Override
	public User addUser(User user) {
		try {
			return restTemplate.postForObject(URL_BASE,user, User.class);	//Quiero que me lo traiga en formato usuario por eso pongo el 'User.class'	
		} catch (Exception e) {
			throw new RuntimeException("There is an error adding the user" + e.getMessage());
		}
	}

	@Override
	public User updateUser(User user) {
		try {
			String url = URL_BASE + "/" + user.getId(); //envío usuario entero teniendo en cuenta el id
			restTemplate.put(url, user); //y se modifica 
			return user;
		} catch (Exception e) {
			throw new RuntimeException("There is an error modifying the user" + e.getMessage());
		}
	}

	@Override
	public void deleteUser(String id) {
		try {
			String url = URL_BASE + "/" + id;
			restTemplate.delete(url);  //elimina todo lo que está en la url que le doy
		} catch (Exception e) {
			throw new RuntimeException("There is a mistake deleting the user" + e.getMessage());
		}
		
	}

}
