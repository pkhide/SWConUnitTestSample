package camt.testsample.c02.stub.entity;

/**
 * Created by Dto on 11/16/2014.
 */
public class Course {
    public Course(String id, int amountStudent) {
        this.id = id;
        this.amountStudent = amountStudent;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private int amountStudent;

    public void setAmountStudent(int amountStudent) {
        this.amountStudent = amountStudent;
    }

    public int getAmountStudent() {
        return amountStudent;
    }
}
