package com.base.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.entity.ContactEntity;
import com.base.repository.ContactRepository;
import com.base.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public String saveContact(ContactEntity contact) {

		contact = contactRepository.save(contact);
		if (contact.getContactId() != null) {
			return "contact saved sucessfully";
		} else {
			return "Contact Failed to saved";
		}

	}

	@Override
	public List<ContactEntity> getAllContact() {
		List<ContactEntity> contactList = contactRepository.findAll();
		return contactList;
	}

	@Override
	public String deleteContactById(Long contactId) {

		if (contactRepository.existsById(contactId)) {
			contactRepository.deleteById(contactId);
			return "contact deleted...";
		} else {
			return "Record Not found....";
		}

	}

	@Override
	public ContactEntity getContactById(Long contactId) {

		Optional<ContactEntity> findByid = contactRepository.findById(contactId);
		if (findByid.isPresent()) {
			return findByid.get();
		}

		return null;
	}

	@Override
	public String updateContact(ContactEntity contact) {

		if (contactRepository.existsById(contact.getContactId())) {
			ContactEntity save = contactRepository.save(contact);
			return "Updated Successfully..";
		} else {
			return "Not updated Successfully..";
		}

	}

}
