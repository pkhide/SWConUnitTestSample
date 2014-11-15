package camt.testsample.c02.stub;

import camt.testsample.c02.stub.entity.Course;

public class CourseServiceImpl {

    CourseDAO courseDAO = new CourseDAOImpl();
    public void setCourseDAO(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }



    public int getAmountStudent(String courseId) {
        Course course = courseDAO.getCourse(courseId);
        return course.getAmountStudent();
    }

}