package strong.leaders.team.projectkfrilansuzdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import strong.leaders.team.projectkfrilansuzdemo.entity.Course;
import strong.leaders.team.projectkfrilansuzdemo.entity.CourseCategory;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<CourseCategory> findCoursesByCategoryName(String category);
}
