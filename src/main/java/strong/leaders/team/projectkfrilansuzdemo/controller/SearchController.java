package strong.leaders.team.projectkfrilansuzdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import strong.leaders.team.projectkfrilansuzdemo.repository.CourseRepository;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.CompanyService;
import strong.leaders.team.projectkfrilansuzdemo.service.CourseService;

public class SearchController {
    //*
    // * Joy bo'yicha(Address bo'yicha) company qidirish
    // (Toshkentdagi IT bo'yicha o'quv markazlari)
    // * Kurs nomlari bo'yicha
    // * Kurs kategoriyasi bo'yicha
    // * Kategoriya bo'yicha kurs qidirish
    // * Kategoriya bo'yicha company larni qidirish
    // * Yosh chegarasi bo'yicha o'quv markaz qidirish
    // (Xorazmdagi 15 - 18 yoshdagilar uchun til kurslari)
    // * Zaproslarni Page qilib tayyorlash
    // (Toshkentda yoshlar uchun ingiliz tili kursini topish)
    //
    // */

    private final CompanyService companyService;
    private final CourseService courseService;

    public SearchController(CompanyService companyService, CourseRepository courseRepository, CourseService courseService) {
        this.companyService = companyService;
        this.courseService = courseService;
    }

    @GetMapping("/companies")
    SingleResponse getCompaniesByRegionAndCourseCategory(@RequestParam("region") String region, @RequestParam("courseCategory") String courseCategory) {
        return companyService.findAllByCategoryAndAddress(region, courseCategory);
    }

    @GetMapping("/companiesByCourseName")
    SingleResponse getCompaniesByRegionAndCourseCategory(@RequestParam("courseName") String courseName) {
        return companyService.findAllByCourseName(courseName);
    }

    @GetMapping("/courses")
    SingleResponse getCourseByCategory(@RequestParam("category") String category){
        return courseService.findAllByCategory(category);
    }
}
