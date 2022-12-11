package com.base.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "contact_us")
public class ContactEntity {

	@Id
	private Integer contactId;
	
	private String contactName;
	
	private String conatctEmail;
	
	private Long contactNumber;
}
