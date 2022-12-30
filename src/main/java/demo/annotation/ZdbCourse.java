package demo.annotation;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2022/12/30
 * @since 3.0.1
 */
@CourseInfoAnnotation(courseName = "spring", courseTag = "深造", courseProfile = "spring核心知识")
public class ZdbCourse {

    @PersonInfoAnnotation(name = "zdb", language = {"java", "C++", "go", "python"})
    private String author;

    @CourseInfoAnnotation(courseName = "study", courseTag = "源码", courseProfile = "spring核心", courseIndex = 144)
    public void getCourseInfo() {
    }


}
