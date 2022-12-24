package strong.leaders.team.projectkfrilansuzdemo.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import strong.leaders.team.projectkfrilansuzdemo.entity.ActiveCourse;
import strong.leaders.team.projectkfrilansuzdemo.entity.Course;
import strong.leaders.team.projectkfrilansuzdemo.repository.ActiveCourseRepository;
import strong.leaders.team.projectkfrilansuzdemo.repository.CourseRepository;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.ActiveCourseDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.ActiveCourseResponse;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.CourseResponse;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.ActiveCourseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ActiveCourseServiceImpl implements ActiveCourseService {

    private final ActiveCourseRepository repository;
    private final CourseRepository courseRepository;

    public ActiveCourseServiceImpl(ActiveCourseRepository activeCourseRepository,
                                   CourseRepository courseRepository) {
        this.repository = activeCourseRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public SingleResponse save(ActiveCourseDto activeCourseDTO) {
        ActiveCourse activeCourse = new ActiveCourse();
        activeCourse.setMaxStudent(activeCourseDTO.getMaxStudent());
        activeCourse.setStartDate(activeCourseDTO.getStartDate());
        activeCourse.setCurrentStudentsCount(activeCourseDTO.getCurrentStudentsCount());

        Optional<Course> optionalCourse = courseRepository.findById(activeCourseDTO.getCourse().getId());
        if (!optionalCourse.isPresent())
            return new SingleResponse(false, "Course id not found!");
        activeCourse.setCourse(optionalCourse.get());

        repository.save(activeCourse);
        return new SingleResponse( true, "Active course saved!");
    }

    @Override
    public SingleResponse findAll() {
        List<ActiveCourse> activeCourseList = repository.findAll();
        List<ActiveCourseResponse> resultList = new ArrayList<>();

        for (ActiveCourse activeCourse : activeCourseList) {
            ActiveCourseResponse courseResponse =
                    new ActiveCourseResponse(
                            activeCourse.getId(),
                            activeCourse.getCourse(),
                            activeCourse.getMaxStudent(),
                            activeCourse.getCurrentStudentsCount(),
                            activeCourse.getStartDate()
                    );
            resultList.add(new ActiveCourseResponse());
            return new SingleResponse(true, "Active Course List", resultList);
        }
        return new SingleResponse(false, "Active Course List is empty", HttpStatus.NOT_FOUND);
    }

    @Override
    public SingleResponse findById(Long id) {
        Optional<ActiveCourse> optionalActiveCourse = repository.findById(id);
        if (optionalActiveCourse.isPresent()) {
            ActiveCourse activeCourse = optionalActiveCourse.get();
            ActiveCourseResponse response = new ActiveCourseResponse(
                    activeCourse.getId(),
                    activeCourse.getCourse(),
                    activeCourse.getMaxStudent(),
                    activeCourse.getCurrentStudentsCount(),
                    activeCourse.getStartDate()
            );
            return new SingleResponse(true, "Active Course with ID {" + id + "}");
        }
        return new SingleResponse(false, "Active Course Not Found with ID {" + id + "}", HttpStatus.NOT_FOUND);

    }

    @Override
    public SingleResponse update(ActiveCourseDto activeCourseDTO, Long id) {
        Optional<ActiveCourse> optionalActiveCourse = repository.findById(id);
        if (optionalActiveCourse.isPresent()) {
            optionalActiveCourse.get().setMaxStudent(activeCourseDTO.getMaxStudent());
            optionalActiveCourse.get().setStartDate(activeCourseDTO.getStartDate());
            optionalActiveCourse.get().setCurrentStudentsCount(activeCourseDTO.getCurrentStudentsCount());

            Optional<Course> optionalCourse = courseRepository.findById(activeCourseDTO.getCourse().getId());
            if (!optionalCourse.isPresent())
                return new SingleResponse(false, "Course id not found!", HttpStatus.NOT_FOUND);

            repository.save(optionalActiveCourse.get());
            return new SingleResponse(true, "Active course updated!", true);
        }
        return new SingleResponse(true, "Active course not found with id {" + id + "}",HttpStatus.NOT_FOUND);
    }

    @Override
    public SingleResponse delete(Long id) {
        Optional<ActiveCourse> optionalActiveCourse = repository.findById(id);
        if(optionalActiveCourse.isPresent()) {
            repository.deleteById(id);
            return new SingleResponse(true, "Active Course successfully deleted");
        }
        return new SingleResponse(false, "Active course id not found!",HttpStatus.NOT_FOUND);
    }
}