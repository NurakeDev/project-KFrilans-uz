package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.DistrictDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.DistrictService;

public class DistrictController {

    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody DistrictDto districtDTO){
        return districtService.save(districtDTO);
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        return districtService.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SingleResponse findById(@PathVariable Long id){
        SingleResponse district = districtService.findById(id);
        return district;
    }
    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody DistrictDto districtDTO, @PathVariable Long id){
        SingleResponse update = districtService.update(districtDTO, id);
        return update;
    }
    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = districtService.delete(id);
        return delete;
    }
}
