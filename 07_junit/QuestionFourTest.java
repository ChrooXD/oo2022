package Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionFourTest {

    @Test
    void QuestionFourShouldBe6igeVastus(){
        var QuestionNeli = new QuestionFour();
        assertEquals(0, QuestionNeli.fourthQuestion("d"));
    }
}