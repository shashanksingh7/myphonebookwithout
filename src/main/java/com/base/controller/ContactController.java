package com.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.base.entity.ContactEntity;
import com.base.service.ContactService;

@RestController
@RequestMapping("/api/contact-us")
public class ContactController {
	
	
	@Autowired
	private ContactService contactService;
	
	
	@PostMapping
	public ResponseEntity<String> createPayment( @RequestBody ContactEntity contact) {
		return new ResponseEntity<String>(contactService.saveContact(contact), HttpStatus.CREATED);
	}

	
	@GetMapping()
	public List<ContactEntity> getAllContact() {

		return contactService.getAllContact();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public ResponseEntity<ContactEntity> getContactById(@PathVariable(name = "id") Long contactId) {
		return ResponseEntity.ok(contactService.getContactById(contactId));

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>  deleteContactById(@PathVariable(name="id") Long contactId) {
		
		
		contactService.deleteContactById(contactId) ;
		
		return new ResponseEntity<>("Delete the Respective Event Successfully " , HttpStatus.OK ) ;
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> UpdateContactById(@RequestBody ContactEntity contactEntity
			) {
		
		String response = contactService.updateContact(contactEntity) ;
		
		return new ResponseEntity<>(response , HttpStatus.OK) ;
		
		
	}
	
}
