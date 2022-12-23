package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.entity.Contact;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.ContactService;

import javax.xml.transform.Result;
import java.util.List;

public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody Contact contact){
        return contactService.save(contact);
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        return contactService.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SingleResponse findById(@PathVariable Long id){
        return  contactService.findById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody Contact contact, @PathVariable Long id){
        return contactService.update(contact, id);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        return contactService.delete(id);
    }

}
