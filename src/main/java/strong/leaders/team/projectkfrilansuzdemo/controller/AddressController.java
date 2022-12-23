package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.AddressDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.AddressService;

@RestController
@RequestMapping(path = "api/v1/addresses")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody AddressDto addressDTO){
        SingleResponse save = addressService.save(addressDTO);
        return save;
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        SingleResponse addresses = addressService.findAll();
        return addresses;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SingleResponse findById(@PathVariable Long id){
        SingleResponse address = addressService.findById(id);
        return address;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody AddressDto addressDTO, @PathVariable Long id){
        SingleResponse update = addressService.update(addressDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = addressService.delete(id);
        return delete;
    }

}
