package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.*;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.RoleDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.RoleService;

@RestController
@RequestMapping(path = "/api/v1/users/roles/")
public class UserRoleController {

    private final RoleService service;

    public UserRoleController(RoleService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public SingleResponse save(@RequestBody RoleDto dto) {
        return service.save(dto);
    }

    @GetMapping("/list")
    public SingleResponse findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}/by_id")
    public SingleResponse findById(@PathVariable("id") Long roleId) {
        return service.findById(roleId);
    }

    @PutMapping("/{id}/edit")
    public SingleResponse edit(@PathVariable("id") Long roleId,
                               @RequestBody RoleDto dto) {
        return service.edit(roleId, dto);
    }

    @DeleteMapping("/{id}/delete")
    public SingleResponse delete(@PathVariable("id") Long roleId) {
        return service.delete(roleId);
    }

}
