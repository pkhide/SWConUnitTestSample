package camt.testsample.c01.simple;

/**
 * Created by Dto on 11/16/2014.
 */
public class FirstTestSample {
    public char calGrade(double score){
        if (score > 80){
            return 'A';
        }else if (score > 50){
            return 'B';
        }else
        {
            return 'F';
        }

//        return '\0';
    }
}
