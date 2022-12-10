package com.base.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.base.entity.ContactEntity;

@Service
public interface ContactService {

	public String saveContact(ContactEntity contact);

	public List<ContactEntity> getAllContact();

	public String deleteContactById(Long contactId);

	public ContactEntity getContactById(Long contactId);

	

	public String updateContact(ContactEntity contact);
}
