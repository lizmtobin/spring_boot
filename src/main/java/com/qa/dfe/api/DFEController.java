package com.qa.dfe.api;

import com.qa.dfe.domain.DFEService;
import com.qa.dfe.domain.Marsupial;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// if spring receives a GET request at /hello
// call vv THIS vv method

@RestController // enables http endpoints AND tells Spring to make a Bean of this class
@RequestMapping("/marsupials")
public class DFEController {

	private final DFEService service;

	public DFEController(DFEService service) {
		this.service = service;
	}

	@GetMapping("/{id}") // 200
	public Marsupial getMarsupialByIndex(@PathVariable Integer id) {
		return this.service.getMarsupialByIndex(id);
	}

	@GetMapping() // 200
	public List<Marsupial> getAllMarsupials() {
		return this.service.getAllMarsupials();
	}

	@PostMapping() // 201
	public ResponseEntity<Marsupial> createMarsupial(@RequestBody Marsupial marsupial) {
		Marsupial responseBody = this.service.createMarsupial(marsupial);
		return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
	}

	@PutMapping("/{id}") // 202 - Accepted
	public ResponseEntity<Marsupial> updateMarsupial(@RequestBody Marsupial marsupial, @PathVariable Integer id) {
		Marsupial responseBody = this.service.updateMarsupial(marsupial, id); // replaces the marsupial at that index
		return new ResponseEntity<>(responseBody, HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{id}") // 204 - No content
	public ResponseEntity<?> deleteMarsupial(@PathVariable Integer id) {
		this.service.deleteMarsupial(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204 causes the body to be ignored
	}
}
