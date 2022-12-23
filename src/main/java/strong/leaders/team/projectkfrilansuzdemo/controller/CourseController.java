package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.CourseDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.CourseService;

@RequestMapping(path = "/api/v1/cource")
@RestController
public class CourseController {


    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody CourseDto courseDTO){
        SingleResponse save = courseService.save(courseDTO);
        return save;
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        SingleResponse courses = courseService.findAll();
        return courses;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SingleResponse findById(@PathVariable Long id){
        SingleResponse course = courseService.findById(id);
        return course;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody CourseDto courseDTO, @PathVariable Long id){
        SingleResponse update = courseService.update(courseDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = courseService.delete(id);
        return delete;
    }

}
