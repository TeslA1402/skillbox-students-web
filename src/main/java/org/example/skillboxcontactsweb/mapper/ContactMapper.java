package org.example.skillboxcontactsweb.mapper;

import org.example.skillboxcontactsweb.model.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<Contact> {
    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact contact = new Contact();
        contact.setId(rs.getLong(Contact.Fields.id));
        contact.setPhone(rs.getString(Contact.Fields.phone));
        contact.setEmail(rs.getString(Contact.Fields.email));
        contact.setFirstName(rs.getString("first_name"));
        contact.setLastName(rs.getString("last_name"));
        return contact;
    }
}
