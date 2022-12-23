package strong.leaders.team.projectkfrilansuzdemo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User student;
    @Column(name = "message")
    private String message;

    @Column(name = "sent_date")
    private Date sentDate;

    @Column(name = "status")
    private boolean status = false;         // true - qabul qilindi false - qabul qilinmadi

    @ManyToOne
    private ActiveCourse activeCourse;

}
