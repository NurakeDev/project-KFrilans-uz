package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.UserDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE
    @PostMapping()
    public SingleResponse save(@RequestBody UserDto userDTO){
        SingleResponse save = userService.save(userDTO);
        return save;
    }

    // READ
    @GetMapping()
    public SingleResponse findAll(){
        return userService.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public SingleResponse findById(@PathVariable Long id){
        SingleResponse user = userService.findById(id);
        return user;
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public SingleResponse update(@RequestBody UserDto userDTO, @PathVariable Long id){
        SingleResponse update = userService.update(userDTO, id);
        return update;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public SingleResponse delete(@PathVariable Long id){
        SingleResponse delete = userService.delete(id);
        return delete;
    }
}
