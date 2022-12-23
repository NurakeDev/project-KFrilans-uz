package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.rest.dto.CourseDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.RoleDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface CourseService {
    SingleResponse save(CourseDto dto);

    SingleResponse findAll();

    SingleResponse findById(Long courseId);

    SingleResponse delete(Long courseId);

    SingleResponse update(CourseDto courseDTO, Long id);

    SingleResponse findAllByCategory(String category);
}
