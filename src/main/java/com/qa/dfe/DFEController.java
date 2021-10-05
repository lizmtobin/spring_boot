package com.qa.dfe;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // enables http endpoints

// if spring receives a GET request at /hello
// call vv THIS vv method

public class DFEController {
	private List<Marsupial> marsupials = new ArrayList<>();

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}

	@GetMapping("/marsupial/{id}")
	public Marsupial getMarsupialByIndex(@PathParam("id") Integer id) {
		System.out.println("This is the id: " + id);
		this.marsupials.get(id);
		return null;
	}

	@GetMapping("marsupials/all")
	public List<Marsupial> getAllMarsupials() {

		return null;
	}

	@PostMapping("/createMarsupial")
	public Marsupial createMarsupial(@RequestBody Marsupial marsupial) {
		System.out.println("Created Marsupial: " + marsupial);
		this.marsupials.add(marsupial);
		return this.marsupials.get(this.marsupials.size() - 1);
	}

	@PutMapping("/updateMarsupial/{id}")
	public Marsupial updateMarsupial(@RequestBody Marsupial marsupial, Integer id) {
		System.out.println("Updated Marsupial: " + marsupial);
		System.out.println("ID: " + id);
		return null;
	}

	@DeleteMapping("/deleteMarsupial{id}")
	public String deleteMarsupial(Integer id) {

		return null;
	}
}
