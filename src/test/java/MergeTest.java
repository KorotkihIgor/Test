import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeTest {
    @Test
    public void testMerge() {
        Merge sut = new Merge();
        int[] teamA = {93, 90, 81, 72, 64, 50};
        int[] teamB = {85, 77, 72, 63, 65, 49};
        int[] expected = {93, 90, 85, 81, 77, 72};

        int[] result = sut.merge(teamA, teamB);

        Assertions.assertArrayEquals(expected, result);
    }
}
