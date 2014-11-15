package camt.testsample.c02.stub;

import camt.testsample.c02.stub.entity.Course;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CourseServiceImplTest {

	@Test
	public void testGetAmountStudentWithoutInjection(){
		CourseServiceImpl c = new CourseServiceImpl();
		assertEquals(50, c.getAmountStudent("953331"));
		assertEquals(100, c.getAmountStudent("953323"));
	}

	@Test
	public void testGetAmountStudentInjectStub(){
		CourseServiceImpl c = new CourseServiceImpl();
		c.setCourseDAO(new CourseDAOStub());
		assertEquals(50, c.getAmountStudent("953331"));
		assertEquals(100, c.getAmountStudent("953323"));
	}

	CourseDAO courseDAO;
	@Before
	public void Setup(){
		Course c1 = new Course("953331",50);
		Course c2 = new Course("953323",100);
		courseDAO = mock(CourseDAO.class);
		when(courseDAO.getCourse("953331")).thenReturn(c1);
		when(courseDAO.getCourse("953323")).thenReturn(c2);
	}

	@Test
	public void testGetStudentInjectMockito(){
		CourseServiceImpl c = new CourseServiceImpl();
		c.setCourseDAO(courseDAO);
		assertEquals(50, c.getAmountStudent("953331"));
		assertEquals(100, c.getAmountStudent("953323"));
	}
}