package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.entity.Region;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.RegionService;

public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody Region region){
        return regionService.save(region);
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        return regionService.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SingleResponse findById(@PathVariable Long id){
        return regionService.findById(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody Region region, @PathVariable Long id){
        return regionService.update(region, id);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        return regionService.delete(id);
    }
}
