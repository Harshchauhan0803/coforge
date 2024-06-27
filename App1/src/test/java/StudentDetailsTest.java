import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentDetailsTest {
	StudentDetails student1;

	@BeforeEach
	void setUp() throws Exception {
		student1=new StudentDetails(1001,"harsh chauhan","faridabad");
	}

	@Test
	void testGetStudentid() {
		assertEquals(student1.getStudentid(),1001);
	}  

	@Test
	void testGetStudentName() {
		assertEquals(student1.getStudentName(),"harsh chauhan");
	}

	@Test
	void testGetStudentAddress() {
		assertEquals(student1.getStudentAddress(),"faridabad");
	}

	@Test
	void testGetCollegeName() {
		assertEquals(student1.getCollegeName(),"NIT");
	}

}
