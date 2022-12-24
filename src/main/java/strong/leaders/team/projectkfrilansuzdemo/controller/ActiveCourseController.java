package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.ActiveCourseDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.ActiveCourseService;

@RestController
@RequestMapping(path = "api/v1/active_courses")
public class ActiveCourseController {

    private final ActiveCourseService activeCourseService;

    public ActiveCourseController(ActiveCourseService activeCourseService) {
        this.activeCourseService = activeCourseService;
    }

    // CREATE
    @PostMapping(path = "/save")
    public SingleResponse save(@RequestBody ActiveCourseDto activeCourseDTO){
        return activeCourseService.save(activeCourseDTO);
    }

    // READ
    @GetMapping(path = "/list")
    public SingleResponse findAll(){
        return activeCourseService.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}/byId")
    public SingleResponse findById(@PathVariable Long id){
        return activeCourseService.findById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody ActiveCourseDto activeCourseDTO, @PathVariable Long id){
        return activeCourseService.update(activeCourseDTO, id);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        return activeCourseService.delete(id);
    }
}
