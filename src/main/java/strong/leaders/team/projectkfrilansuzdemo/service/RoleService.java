package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.rest.dto.RoleDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface RoleService {
    SingleResponse save(RoleDto dto);

    SingleResponse findAll();

    SingleResponse findById(Long roleId);

    SingleResponse edit(Long roleId, RoleDto dto);

    SingleResponse delete(Long roleId);
}
