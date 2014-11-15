package camt.testsample.c01.simple;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Dto on 11/16/2014.
 */

public class FirstTestSampleTest {
    @Test
    public void testCalGrade(){
//        fail();

        FirstTestSample sample = new FirstTestSample();
        assertEquals('A',sample.calGrade(88));
    }
}
