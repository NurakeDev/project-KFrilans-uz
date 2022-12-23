package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.ActiveCourseDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.ActiveCourseService;

@RestController
@RequestMapping(path = "api/v1/active_courses/")
public class ActiveCourseController {

    private final ActiveCourseService activeCourseService;

    public ActiveCourseController(ActiveCourseService activeCourseService) {
        this.activeCourseService = activeCourseService;
    }

    // CREATE
    @PostMapping(path = "/save")
    public SingleResponse save(@RequestBody ActiveCourseDto activeCourseDTO){
        SingleResponse save = activeCourseService.save(activeCourseDTO);
        return save;
    }

    // READ
    @GetMapping(path = "/list")
    public SingleResponse findAll(){
        SingleResponse activeCourses = activeCourseService.findAll();
        return activeCourses;
    }

    // READ BY ID
    @GetMapping("/{id}/byId")
    public SingleResponse findById(@PathVariable Long id){
        SingleResponse activeCourse = activeCourseService.findById(id);
        return activeCourse;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody ActiveCourseDto activeCourseDTO, @PathVariable Long id){
        SingleResponse update = activeCourseService.update(activeCourseDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = activeCourseService.delete(id);
        return delete;
    }
}
