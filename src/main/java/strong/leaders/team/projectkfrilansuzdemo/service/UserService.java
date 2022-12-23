package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.rest.dto.UserDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface UserService {
    SingleResponse save(UserDto userDTO);

    SingleResponse findAll();

    SingleResponse findById(Long id);

    SingleResponse update(UserDto userDTO, Long id);

    SingleResponse delete(Long id);
}
