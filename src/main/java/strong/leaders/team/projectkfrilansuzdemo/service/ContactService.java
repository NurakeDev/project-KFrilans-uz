package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.entity.Contact;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

import javax.xml.transform.Result;

public interface ContactService {
    SingleResponse save(Contact contact);

    SingleResponse findAll();

    SingleResponse findById(Long id);

    SingleResponse update(Contact contact, Long id);

    SingleResponse delete(Long id);
}
