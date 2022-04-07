package Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class QuestionOneTest {

    @Test
    void QuestionOneShouldBe6igeVastus(){
     var question = new QuestionOne();
        assertNotEquals(2, question.firstQuestion("a"));
    }
}