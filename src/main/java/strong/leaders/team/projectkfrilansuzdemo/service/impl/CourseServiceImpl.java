package strong.leaders.team.projectkfrilansuzdemo.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import strong.leaders.team.projectkfrilansuzdemo.entity.Course;
import strong.leaders.team.projectkfrilansuzdemo.entity.CourseCategory;
import strong.leaders.team.projectkfrilansuzdemo.entity.Role;
import strong.leaders.team.projectkfrilansuzdemo.repository.CourseRepository;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.CourseDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.RoleDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.CourseResponse;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.RoleResponse;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.CourseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public SingleResponse save(CourseDto dto) {
        Course course = new Course();
        course.setName(dto.getName());
        course.setDescription(dto.getDescription());
        course.setCategory(dto.getCategory());
        course.setCategory(dto.getCategory());
        course.setPrice(dto.getPrice());
        Course savedCourse = repository.save(course);
        return new SingleResponse(true, "Course successfully created!");
    }

    @Override
    public SingleResponse findAll() {
        List<Course> courseList = repository.findAll();
        List<CourseResponse> resultList = new ArrayList<>();

        for (Course course : courseList) {
            CourseResponse courseResponse =
                    new CourseResponse(
                            course.getId(),
                            course.getName(),
                            course.getDescription(),
                            course.getCompany(),
                            course.getCategory(),
                            course.getPrice()
                    );
            resultList.add(courseResponse);
        }

        return new SingleResponse(true, "Course List", resultList);
    }

    @Override
    public SingleResponse findById(Long courseId) {
        Optional<Course> byId = repository.findById(courseId);
        if (byId.isPresent()){
            Course course = byId.get();
            CourseResponse courseResponse = new CourseResponse(
                    course.getId(),
                    course.getName(),
                    course.getDescription(),
                    course.getCompany(),
                    course.getCategory(),
                    course.getPrice()
            );
            return new SingleResponse(true, "Course with ID {" + courseId + "}", courseResponse);
        }
        return new SingleResponse(false, "Course Not Found with {"+courseId+"}", HttpStatus.NOT_FOUND );
    }

    @Override
    public SingleResponse update(CourseDto dto, Long courseId) {
        Optional<Course> optionalCourse = repository.findById(courseId);
        if (optionalCourse.isPresent()) {
            Course entity = optionalCourse.get();

            if (dto.getName() != null && !entity.getName().equals(dto.getName()))
                entity.setName(dto.getName());

            if (dto.getDescription() != null && !entity.getDescription().equals(dto.getDescription()))
                entity.setDescription(dto.getDescription());

            if (dto.getCategory() != null && !entity.getCategory().getName().equals(dto.getCategory().getName()))
                entity.setCategory(dto.getCategory());

            if (dto.getCompany() != null && !entity.getCompany().getName().equals(dto.getCompany().getName()))
                entity.setCompany(dto.getCompany());

            if (dto.getPrice() != null && !entity.getPrice().equals(dto.getPrice()))
                entity.setPrice(dto.getPrice());


            repository.save(entity);
            return new SingleResponse(true, "Course successfully updated!");
        }
        return new SingleResponse(false,
                "Course Not Found with ID {" + courseId + "}",
                HttpStatus.NOT_FOUND);
    }

    @Override
    public SingleResponse findAllByCategory(String category) {
        List<CourseCategory> coursesByCategoryName = repository.findCoursesByCategoryName(category);
        if (!coursesByCategoryName.isEmpty()){
            return new SingleResponse(true, category + " List: ", coursesByCategoryName);
        }
        return new SingleResponse(false, category + " List is empty");
    }

    @Override
    public SingleResponse delete(Long courseId) {
        Optional<Course> byId = repository.findById(courseId);
        if (byId.isPresent()) {
            Course course = byId.get();
            repository.delete(course);
            return new SingleResponse(true, "Course deleted successfully with id " + courseId);
        }
        return new SingleResponse(false, "Course not found with id " + courseId, HttpStatus.NOT_FOUND);
    }
}
