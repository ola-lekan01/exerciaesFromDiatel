package Chapter7.PollingExercises;

import Chapter7.PolingExercises.Poll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PollingExercisesTest {
    private Poll poll;

    @BeforeEach
    void setUp(){
        poll = new Poll();
    }

    @Test
    public void testThatWeCanCalculateAverage(){
        int [] pollNumbers = {10,20,30,40,50};
        assertEquals(30, poll.getAverage(pollNumbers));
    }
    @Test
    public void testThatWeCanGetHighestScore(){
        int [] pollNumbers = {10,20,30,40,50};
        assertEquals(50, poll.getHighestRatings(pollNumbers));
    }

    @Test
    public void testThatWeCanGetLowestScore(){
        int [] pollNumbers = {10,20,30,40,50};
        assertEquals(10, poll.getLowestRatings(pollNumbers));
    }

}
