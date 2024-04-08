package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ContactDTO;

import java.util.List;

public interface IContactService {
    ContactDTO queryProduct(ContactDTO contactDTO);
    List<ContactDTO> queryAllContacts();
    int insertContact(ContactDTO contactDTO);
    int updateContact(ContactDTO contactDTO);
    int deleteContact(ContactDTO contactDTO);
}
