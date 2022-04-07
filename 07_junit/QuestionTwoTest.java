package Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTwoTest {

    @Test
    void QuestionTwoShouldBeValeVastus(){
        var questiontoo = new QuestionTwo();
        assertEquals(0, questiontoo.secondQuestion("d"));
    }
}