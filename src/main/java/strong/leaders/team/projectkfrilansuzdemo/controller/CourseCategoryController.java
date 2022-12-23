package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.CourseCategoryDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.CourseCategoryService;

public class CourseCategoryController {

    final CourseCategoryService courseCategoryService;

    public CourseCategoryController(CourseCategoryService courseCategoryService) {
        this.courseCategoryService = courseCategoryService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody CourseCategoryDto courseCategoryDTO){
        SingleResponse save = courseCategoryService.save(courseCategoryDTO);
        return save;
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        return courseCategoryService.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SingleResponse findById(@PathVariable Long id){
        SingleResponse courseCategory = courseCategoryService.findById(id);
        return courseCategory;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody CourseCategoryDto courseCategoryDTO, @PathVariable Long id){
        SingleResponse update = courseCategoryService.update(courseCategoryDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = courseCategoryService.delete(id);
        return delete;
    }
}
