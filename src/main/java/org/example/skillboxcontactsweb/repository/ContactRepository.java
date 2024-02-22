package org.example.skillboxcontactsweb.repository;

import org.example.skillboxcontactsweb.model.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactRepository {
    void save(Contact contact);

    List<Contact> getAll();

    void update(Contact contact);

    Optional<Contact> findById(Long id);

    void deleteById(Long id);
}
