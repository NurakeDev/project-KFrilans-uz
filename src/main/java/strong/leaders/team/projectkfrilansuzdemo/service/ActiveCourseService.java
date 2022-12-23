package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.rest.dto.ActiveCourseDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface ActiveCourseService {

    SingleResponse save(ActiveCourseDto activeCourseDTO);

    SingleResponse findAll();

    SingleResponse findById(Long id);

    SingleResponse update(ActiveCourseDto activeCourseDTO, Long id);

    SingleResponse delete(Long id);
}
