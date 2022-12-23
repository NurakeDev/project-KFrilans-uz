package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.entity.Application;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.ApplicationDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.ApplicationService;

@RestController
@RequestMapping(path = "/api/v1/application")
public class ApplicationContoller {

    private final ApplicationService applicationService;
//
//    public ApplicationController(ApplicationService applicationService) {
//        this.applicationService = applicationService;
//    }

    public ApplicationContoller(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody ApplicationDto applicationDTO){
        return applicationService.save(applicationDTO);
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        return applicationService.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Application findById(@PathVariable Long id){
        return applicationService.findById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody ApplicationDto applicationDTO, @PathVariable Long id){
        SingleResponse update = applicationService.update(applicationDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = applicationService.delete(id);
        return delete;
    }

}
