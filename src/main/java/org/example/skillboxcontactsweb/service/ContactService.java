package org.example.skillboxcontactsweb.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.skillboxcontactsweb.exception.ContactNotFoundException;
import org.example.skillboxcontactsweb.model.Contact;
import org.example.skillboxcontactsweb.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContactService {
    private final ContactRepository contactRepository;

    public void save(Contact contact) {
        log.info("Save contact");
        contactRepository.save(contact);
    }

    public List<Contact> getAll() {
        log.info("Get all contacts");
        return contactRepository.getAll();
    }

    public void update(Contact contact) {
        log.info("Update contact with id {}", contact.getId());
        contactRepository.update(contact);
    }

    public void deleteById(Long id) {
        log.info("Delete contact with id {}", id);
        contactRepository.deleteById(id);
    }

    public Contact getById(Long id) {
        return contactRepository.findById(id).orElseThrow(() -> new ContactNotFoundException(id));
    }
}
