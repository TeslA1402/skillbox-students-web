package org.example.skillboxcontactsweb.exception;

import java.text.MessageFormat;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException(Long id) {
        super(MessageFormat.format("Contact with id {0} not found", id));
    }
}
