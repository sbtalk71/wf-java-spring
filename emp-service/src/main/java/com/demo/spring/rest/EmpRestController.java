package com.demo.spring.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.demo.spring.EmpRepository;
import com.demo.spring.entity.Emp;

@RestController
@RequestMapping("/emp")
public class EmpRestController {

	@Autowired
	EmpRepository repo;

	@GetMapping(path = "/find/{id}", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity findEmp(@PathVariable("id") int id) {
		System.out.println(repo.getClass().getName());
		Optional<Emp> op = repo.findById(id);
		if (op.isPresent()) {
			return ResponseEntity.ok(op.get());
		} else {
			return ResponseEntity.ok("Emp Not Found");
		}
	}

	@PostMapping(path = "/save", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}, produces = "text/plain")
	public ResponseEntity<String> saveEmp(@RequestBody Emp e) {

		if (repo.existsById(e.getEmpId())) {
			return ResponseEntity.ok("Emp already exists");
		} else {
			repo.save(e);
			return ResponseEntity.ok("Emp Saved successfully..");
		}
	}

	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = "text/plain")
	public ResponseEntity<String> updateEmp(@RequestBody Emp e) {
		
		if (repo.existsById(e.getEmpId())) {
			repo.save(e);
			return ResponseEntity.ok("Emp Updated successfully..");
		} else {

			return ResponseEntity.ok("Emp does not exist..");
		}
	}

	@DeleteMapping(path = "/delete", produces = "text/plain")
	public ResponseEntity<String> deleteEmp(@RequestParam("id") int id) {

		if (repo.existsById(id)) {
			repo.deleteById(id);
			return ResponseEntity.ok("Emp Deleted successfully..");
		} else {

			return ResponseEntity.ok("Emp does not exist..");
		}
	}

	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> getAllEmps() {
		return ResponseEntity.ok(repo.findAll());
	}
	
	@GetMapping(path = "/range", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Emp>> getAllEmps2(@RequestParam("a")int a,@RequestParam("b") int b) {
		return ResponseEntity.ok(repo.getList(a,b));
	}

}
