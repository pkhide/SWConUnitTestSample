package camt.testsample.c02.stub;

import camt.testsample.c02.stub.entity.Course;

public class CourseDAOStub implements CourseDAO {

	public Course getCourse(String id){
		if (id.equals("953331")){
			Course c = new Course("953331",50);
			return c;
		} else if (id.equals("953323")){
			Course c = new Course("953323",100);
			return c;
		}else
			return null;
	}
}