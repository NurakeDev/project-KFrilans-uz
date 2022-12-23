package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.rest.dto.CourseCategoryDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface CourseCategoryService {
    SingleResponse save(CourseCategoryDto courseCategoryDTO);

    SingleResponse findAll();

    SingleResponse findById(Long id);

    SingleResponse update(CourseCategoryDto courseCategoryDTO, Long id);

    SingleResponse delete(Long id);
}
