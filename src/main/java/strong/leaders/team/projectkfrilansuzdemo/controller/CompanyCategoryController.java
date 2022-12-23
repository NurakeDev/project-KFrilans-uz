package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.entity.CompanyCategory;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.CompanyCategoryService;

public class CompanyCategoryController {

    private final CompanyCategoryService companyCategoryService;

    public CompanyCategoryController(CompanyCategoryService companyCategoryService) {
        this.companyCategoryService = companyCategoryService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody CompanyCategory companyCategory){
        SingleResponse save = companyCategoryService.save(companyCategory);
        return save;
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        SingleResponse companyCategories = companyCategoryService.findAll();
        return companyCategories;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public CompanyCategory findById(@PathVariable Long id){
        CompanyCategory companyCategory = companyCategoryService.findById(id);
        return companyCategory;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody CompanyCategory companyCategory, @PathVariable Long id){
        SingleResponse update = companyCategoryService.update(companyCategory, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = companyCategoryService.delete(id);
        return delete;
    }
}
