package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.entity.Application;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.ApplicationDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface ApplicationService {
    SingleResponse save(ApplicationDto applicationDTO);

    SingleResponse findAll();

    Application findById(Long id);

    SingleResponse update(ApplicationDto applicationDTO, Long id);

    SingleResponse delete(Long id);
}
