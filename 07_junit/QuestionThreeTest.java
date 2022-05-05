import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionThreeTest {

    @Test
    void QuestionThreeShouldBeValeVastus(){
        var QuestionTree = new QuestionThree();
        assertEquals(0, QuestionTree.thirdQuestion("a"));
    }
}