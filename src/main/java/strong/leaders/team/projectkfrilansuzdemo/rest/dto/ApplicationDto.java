package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import strong.leaders.team.projectkfrilansuzdemo.entity.ActiveCourse;
import strong.leaders.team.projectkfrilansuzdemo.entity.User;

import java.util.Date;

public class ApplicationDto {
    private User student;
    private String message;
    private Date sentDate;
    private boolean status = false;         // true - qabul qilindi false - qabul qilinmadi
    private ActiveCourse activeCourse;
}
