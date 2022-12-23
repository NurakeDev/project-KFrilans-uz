package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.entity.Company;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.CompanyDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.CompanyService;

public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody CompanyDto companyDTO){
        SingleResponse save = companyService.save(companyDTO);
        return save;
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        SingleResponse companies = companyService.findAll();
        return companies;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Company findById(@PathVariable Long id){
        Company company = companyService.findById(id);
        return company;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody CompanyDto companyDTO, @PathVariable Long id){
        return companyService.update(companyDTO, id);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        return companyService.delete(id);
    }

}
