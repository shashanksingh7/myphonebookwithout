package com.base.request;

import lombok.Data;

@Data
public class ContactRequest {

	private long contactId;

	private String contactName;

	private String conatctEmail;

	private long contactNumber;
}
