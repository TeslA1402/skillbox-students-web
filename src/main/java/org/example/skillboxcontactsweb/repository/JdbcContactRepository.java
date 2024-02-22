package org.example.skillboxcontactsweb.repository;

import lombok.RequiredArgsConstructor;
import org.example.skillboxcontactsweb.mapper.ContactMapper;
import org.example.skillboxcontactsweb.model.Contact;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JdbcContactRepository implements ContactRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public void save(Contact contact) {
        String sql = "INSERT INTO contacts_schema.contact (first_name, last_name, email, phone) VALUES (?,?,?,?)";
        jdbcTemplate.update(sql, contact.getFirstName(), contact.getLastName(), contact.getEmail(), contact.getPhone());
    }

    @Override
    public List<Contact> getAll() {
        String sql = "SELECT * FROM contacts_schema.contact";
        return jdbcTemplate.query(sql, new ContactMapper());
    }

    @Override
    public void update(Contact contact) {
        String query = "UPDATE contacts_schema.contact SET first_name = ?, last_name = ?, email = ?, phone = ? WHERE id = ?";
        jdbcTemplate.update(query, contact.getFirstName(), contact.getLastName(), contact.getEmail(), contact.getPhone(), contact.getId());
    }

    @Override
    public Optional<Contact> findById(Long id) {
        String sql = "SELECT * FROM contacts_schema.contact WHERE id = ?";
        Contact contact = jdbcTemplate.queryForObject(sql, new ContactMapper(), id);
        return Optional.ofNullable(contact);
    }

    @Override
    public void deleteById(Long id) {
        String sql = "DELETE FROM contacts_schema.contact WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
