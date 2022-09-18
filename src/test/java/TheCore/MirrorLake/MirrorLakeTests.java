package TheCore.MirrorLake;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Mirror Lake Tests")
public class MirrorLakeTests {

    @Nested
    @DisplayName("Strings Construction")
    public class StringConstructionTest {

        StringsConstruction sC = new StringsConstruction();

        @Test
        public void scT1() {
            assertEquals(2, sC.solution("asd", "asddsa"));
        }

        @Test
        public void scT2() {
            assertEquals(1, sC.solution("ab", "abcbcb"));
        }

        @Test
        public void scT3() {
            assertEquals(2, sC.solution("ab", "abccba"));
        }

        @Test
        public void scT4() {
            assertEquals(2, sC.solution("c", "abccba"));
        }

        @Test
        public void scT5() {
            assertEquals(3, sC.solution("c", "abccbac"));
        }

        @Test
        public void scT6() {
            assertEquals(1, sC.solution("z", "z"));
        }

        @Test
        public void scT7() {
            assertEquals(0, sC.solution("z", "y"));
        }

        @Test
        public void scT8() {
            assertEquals(0, sC.solution("za", "bzc"));
        }

        @Test
        public void scT9() {
//            assertEquals(3, sC.solution("hnccv", "hncvhchnhnccncchnvhchnhcvnhdhhn"));
        }

        @Test
        public void scT10() {
            assertEquals(0, sC.solution("abc", "def"));
        }

        @Test
        public void scT25() {
            assertEquals(0, sC.solution("ppbb", "dsajskdapbbb"));
        }

        @Test
        public void scT27() {
            assertEquals(0, sC.solution("zezeeezezezeezzezeeezzeeezezezzzeeeeezezzzzeeeeezezezzzezeezeeezezeezezeeezzezzezzzezeezeeeeezeeeeeezeeezzezzeeezeeezzeeezezzzezeezeeeezezezezeeezzzeeeezezzzezeezzeezzzezezzzeezeeezeeeeezeeeezzeeeezeezezzezeezezeezezezezeezeeezzzzzezzezezeezeeezzeeezeeezzezeezzzzzezzzzzezezzzeeezeeeeeeeezezzezeezzzzzezzeeezezzzeeeezzzeezzeeezzzeeeeeeeezezeezezeeeeezeezezeezzezezezzzzezzeeezzzzzezezeeezzezeeeeeeezzezeezzzzezeezezeeeezezeezzeezeezzzzeeezzzezezzeeeeeezzezzzzeeeeeeeeezezezeeezezezzzzeezezezezeeeeezeezezezeezzzzezzezezzzezzzeezezzezzzzzzzeezeeezzezezeeeeeeeezzzezzezeezzzzezezzezezezezezezezzzzzeeeeeezzzeeeeezezezeezeezzezezezezzeeezezzzzeezzzzeeeeezzezzzezeeezezzzzezezzzeeeeezzzeezzzezzzzzzzeeeeeezzzzezzeezzzezzzezzzzzzeeeeeezeezzzzeeeezzeeeezeezzeezzezezezeeezzzzeezezzezzezzezeezzeeezezezzeeeeeeeeezeeeezzezeezezzzeezzzeeezezzeezeeeeeeezzzezezzzeeezzeeezzzzzzzeezzzezezeezzzezezeezzzzezezeeezzezzzzzzezzzzzezzezeeeezzzzzzezezzzzzeezzezzeeezzzezezzezezzzzzzzezezezzeezzeezzezeeezezeezzezzzezzeezezzezeeeeeezzzezeeeeezeeeezzzeeeeezzzzzeezezeezzezezzeeezezeezzeezeezzzzeeeezeezzzezzeeeeeezzeeeezzzezezeezeeezezzeeezezeezzezeeeeezezeezezzezezezzzezezezezzezzeezzzzeezezeezzzezezezeeezzezeezzzeezzzzezzzeezzzzeeeezeezzzeeezzzzezeeeezzeezzzeezzzezezeeeeezzzeezezzezzezzeezzeeezeeezzezezeeezeezezezzzeezeeezzezeeezezzeeeezzezzzzzezzezezezzzezzzzzeeezzeezezezezeezezezeezzzezzezezeezeezeeezzeezzeezzeeeezzeezeezzzzzzeezzezeezzeeeezeezeezzzzzzezeezeezezzzeezeeezzeezzzzezzezzzezeeezeezeezeeeezezezeeeezeezezzzeezzezeeezzzzezezzzzzzeeezzezzezzeeezzeeezezeeezzeezzzzezezzzeeezeeeeeeeezzzeeezezezzzezzzeezeeezezzzeeezzezezzzzzezezezzezzezeezzeezzzezezzezezzzzzezzzezezezzeezzzeezzeeezeezzzzeeezezzzezezzzzezezzzezeeeeezezzeezzzzezzzezzzzezzezeezzzzzezzzzezeezzzeeeeeezzzeeezezzzeeezzezeeeezzzzeezzeezeeezzzezzzzzezzeeezzzezezezzzeezzezzzzeezezeezzzeeezzeeeeeezeezzzzeeeezzezzzezzezzzzeeezzezezzezeezezzezezzezzzezzeezzezeezeeezzezeeeeeeeezzezeezeeeezeezeeeeezeezzzzezzzzzeezzezeeeeezzzeeeezezeeeeeeeeezzeeeeezezzezeezzzzeeezzzezzzzzezzezeezzezzzzeezezeeezezzzezezeezzzzeeezeezezzzzezezzzeeeeezzzzzezezeezzzeezzezeeeezzezeeezeezezezzeeeeeeezezzezzzzeezeezeezeeeeezzzezzzeezzezzeezezezzzzeezzeezeeeeezezzzezezezzzeeeezeezeezezzeeezzezzeeeeeeezzzzeezzezezzezzeeeeeeeeeeeeeeeeezeeeezeeezezeeezezzeezzezeezzezeezzezezzzezzeezzezeezeezeeezzzzzezzeezzzeeeezzeezzzzezezzzeezzeezezzzzzzzeeeeezzeeezeezeeeeeezeeeezeeezezzzzzzzezezzeeezzezeeeezzzzeeezeeezezezzezeeezezzeezzzzzeezzzezzezzezezzeezeezezzeezzezezezzezzzzeezezeeeeeezzzezeeeeezeeeeezeezezzzeeezzzezzeeeezezezezzzeeeeeezezzzeezezzzezzeeeeeeezezzzzzeezeeezzzzzzzzzeeeeezzzeezeeeezzzzzeezezzzezzeezzzeezzezzzezeeeezzeeeezzeezeezeezzzzezezzeeeeeezzzezzezzezzzezzzezzeeezeeeezzzzzezzeezezezzzzzezeezzezeezezeezezezezzezzzezzzeezzzeezeezzzeezeezzzezeeezezeezzeeeeezzzzzzeeezeezeeeeeeezeezeezzzzzzzzzzzezzeeeezzzeezeezzeeeezeeeeeezeezeeezezzeezzzzeezzzzzzeeeeeeeezezezezzezeezezezzzezzezezezezzzezeezezezeeeezeezezzzezeeeezezzeeezeeezzezzezezzzeeeezezeeeeeezzzzzeezeezeeezeezezeezeeezezzzeeezezezezzzzezezeezzeezeezzzzezzzeezzzezezzzzzzzeeezeeeeeeezezzzeezzezezzezezzzeeeezzzeezezzeezeeeeezezzeezzzeezezezzezzzzeezzeeeezzzeeezzzeeeeezezezeezeezeeezeezezezezezzeezeeezeeeezeezzzzzeezeeezezzzezzeeezzeezezzzezezezzezzzeeeezzeezeezeeeezezzeeezezzzzezzzezeeeezeeezezzezezezezzzzezezzzzzzeeeeezeezezzzezezzeezezzzzezzzezzeezzzzzeeezeezeeezzezezzeeeezeezeeezeezzeezezzzeeeeeeeeezzezzzzzzzzeezzzezzzzezeeeezzzzzezzzzzzeezzzzezezezzzeeeeezzzezzeeeeeeezzzzezzeeeezzzezzzzzzzezzezeezeezezzezeeezeeeeezeeezzzzeeezezeezezeeezzzzeeezeezzeezzzzzzezzeezzzeeezezzzzzezeeeezzeeezeeeezeezzzeezeeeeeeeeezeezzeezeeeezzezzzzzezeezezzezezezzezzzeeeezeezzeeezezzzzzzzzzezzzzeeeezeeeeeezzezezezeeeeeezzezezezzezzezezzeeezezzzzeezezzzzezezzzezezeezezzezezeezzzzzzeezzzezeezzeeeezzzzeezeezzzzezezzeezezeezezezezzzzzeeeezeeezeezzzzeeezeeezzzzzzzzzzezzzzzeezezeezzzzeeeezeeezezzezezzzezzzzeezeeeeezzzeezzeeezzzeeezzeeezzezzezzeezeeeezezeezzzezeeezzezzzezzzeezzezeezezzzzeeeezzzzzezzzzzezzzezzzzzezzeezezezzzeezeeezzeezzeeeezezzzeeezeezeezzzzzeezeeezezezzeezeeezeeeezeezzzzeezezzzezeeeeezzzzzeezzeezzzezzzzzeeeezzzzezezeezeeezezzeezezzezzeezezezeeeeezeeezeezzeeezzzzzzezeezezzezezezezeeezzezeezzzzzzzzzezeezezzzzzzeezzezezeezzezzezzzezezeeezezzeeeeeeeezzeezzeeezzzeezeezzzeeeeezzzeezeeezzezzzzzeezzezeezzzezeezzeezzzeeeeezeezzezeeezeeeeeeeeeezzezzzzzezezeezzzeeezezezeezzzzzezeeezezzzzzzeeezzeeeeezeeeeeeeeezeezzzeeezzeezeezeezezzzeeezzzzzeezeeeezeezeeezeeezzzzezeeezeezezzzezzezzeeezzezzzzzzzeezzzzeezzzeeeezzezzzzeezeeeeezezzezeeeeezezezeeezezzezezzzeeeeeezeeezzzzzzzeeeezzzezeeezzeeeezzezeezeeeezzzezeeezezzzzzzzezzezezzeeezezeeezezzezzzzzzeezeezzzzezzeezezzeezezzzzzezzezeezzzeeeeeeeeezzeeeezzeezzezzzzzeeezezezezezzzzeeeezezezezzeeeeezzzezzezezezezzeeezezezezezeeezezeezzzzzezeezeeezezzeezzeeezeeeezezzzzeezezezeeezezzeeezezezezzezezzezzzzzeeezzeezzeeeezzzzeezeeezeeeezzeezzezzzzeezezzeeeezeeeeeeeeeezzeeeeezzeeeeeeeezzzeeeeeeezezeezzeeezeeeeezzeezezzezzezzzeezzzzeezeeeezzeeeeezzeezzezzeezzezeeeeezzeezzzeezzzzzzzzzzzzzezzeeeezeezezezzeeezezezzeeeezzzzezzzezzeeeeeezeeezzzzzeezezzzzeezeezzzzzzzezzzezzezezeeeeezezeezeezeeeezeezzzzeeeezezeeezeeeeeezeezeezzzezzzezeezezzzzezeeezzeeezeezeeeeezeezzzeeeeezezzzzzzzzzezzezeezzzzeeeezeezzezzeezzezzeezzezezeezzeeeeeeezezzzzeeezeezezzzezeezzzezezeeeezzeeeeezzzzzeezeeeezzezeeezeezzezzzeezezeezzzzzeezzzezzeeeezzeezzzeeezzzezzzzeezeeezeeeezzeezzzzzeezzeezzezeeeezzzzzezezzeeezeezzeeeezezeeeezezzezezzzzzezzezzzezzzzeezzzzzeezzezezeezezzzezeezzezzeezeeeeezezzzezezezezezezzeeeeeeeeezeeeezzzzzezzeeezeeezzzezzezezeezzeezzzeezzzezezeezzezezeeeezeezeeezezzezzzzzeezzezzeeeeeeeezzeezezzzzzzzeezezzeeeezeezzzezzzezzzzeeeeezzzezzezzzeeezezzzzzzzezzzzzezezezezezzezeeezezezzeezzzzezeeezezezzezezzzeeezzzzzzzeeeezzzzezzzeezzezeezzeeeezezzzzzeeezzzezzezzzezezezzeeezzeeezeeeeezzzeeezezzzzzezzezzezzezezzezzeezeezzeezzeeezeeeeeezzzezeezzzezeeeeeeeezzzzezeezzeezzzzzzezzezzzzzzeeezzezzezzeezzzzzzeezezeezeeeeeeeezeezzzzeezezzezezeeezeeezeezzeezzzeeezzzeezzzezzezezeeeeezzezezeezzzezzeeeezzzezzezzzzezzzezezezzeeezzzzeeeezzeezeeeeezezzzzeeeeeeeezezeezezzzzzzzzeezezeezzeeezzeezzzeezezeezezzzeeezzzeezezzezeeezeezezzzezezeezeeezzzzzezeeeezeeezzeezezeeezzeeezeeeeezzeeeezzezzeezzzzezeeeeeezzzeeeezeeezzzezezezzeeeeeeeeeeezzzeeezzeezezzzeezeezezezeezeezeeezzzezzeezeeezezeeezezzzezzezzzezzezzezeeezzzzezzzeezeezeezzzzzeeeezeezzzeeezezeeeezeezzzeeeezeeeezezezezzzzezzezzeeeezzezzzzeezezzzezzzezezeezzezeezezzzezzezezzzzzeezeeezezzeeeezzzzzezezzeeeeezzzzeeeeezeezzzeeezzzzzzezezeezzezzzzzeeeezezzezeezzeeezzzzezzeeezezezezezezzzzzezzeezezeezzzzezzezzezezezzzzzzzzeeezeezzzeeezeezeezeeezeezezeezezezeezeeezeeeezezzzezzzeezzeezeeezeeeezzzzeezezeezeezzzezezeezzzeeeezezzzeeeeezzeezezeezzezezeeezzezeezezzeeeeezezzezzezeeezeeeezeeezzezezzeezezzzzezzeezezeeezzzeezezezzezeeeeezzzeezzzeeezzeezzezezeeezeeezeeezezezzezzzzzeezezeeezeezezezzzzzzzezzzeezzezzzzeezeezeeezezezzzzzezezzzeezeeezzzzzeezzzezzezeeeezzezzzeeeeeeeeeezzezzzeeezzzzzzeeeezeezezzeeeezzzeezzzeeezzzzzzzezzezezeeeezzezezzzzzezezeeezezzezeezzzezeezeeeezzzzeeezzzzezeezzeezeezzzezezeeeeezeeezzezzzzeeeeezzzzzezezeezzezezezeeezzeeezzeezzzzzzeezzeezzeezeeeeeezeeezezeezezeezzzzzeezzeezezzzzzzeezeezezeeezzeeeezzeezzzzzeezezzzzezeeezzeeezzzezzzzzzzzzezeeeezzzeeezzzeezzzezezzzzzzezzzzeeezzeezezezzeeezeezeeezeeeeezezzeezzzzzezzzezzzezzzzeezeezzzeeeezzezzeeeeezezezzeezeezzzezeeezzzeezezzzzezezzeeezezeeezezzzzzzzzezeeezeeezzzzzezeezeezeeezzzzzzezeezeeezzzezzeeezzeeeeeeeeezezeezezzeezzzzzzezeezzzezezeeeeeezzezzzeeezezeeezeezeezezzeeeeeezzzzzzzezzzeezzzezezeezezezzzezezzzezeeezezeeezezzzzezzeezezzzzezzzzzzeezzeeezzzeezezzzezezezzzzezezzzeezzzezzzezzeeeezeeeeezeezeeeezeezzezezzzeeeezzzeezeezzzzzeezeeezeeeezzzzzzeeezeezezzeezeezzzezzeeezeezzeeezzeezezzezeeezeezzzzeezzezezzeezezeeezeezzezeeezzeeezzeeeezzzeeeezeeeeezezzezeezeeezezzeezzzzzezzzeezzezezezzzzeeeezzzezzeezeezezeeezeeezzzezzzzzeeeezezzzezezezzzezzezeezezzezeeeezzzeezeezzezzeezzzzezezezzzzzezezezeezezeezzezzezeezeeezzzzeeeezezeeeeezezeeeezeeeezzezeeeezzezeeezeezzezzezzezzeeeeeeeeeezzzzzeezezzezezeezezezeezeezzzeeezzezzzeeeeeezeeezeeezeeezezzezzezezeezezeezezzeeeezezzeeeeezzzzzezzeeeeeezezezezzzezezeezeeeeeezeezezezeeeezeeeeeeezzzeezzezzzzzeeezeeeeeezzezzezeeeeezzzzzzzzeezzzezezeeeezeezzezzzzeeezeeeezzzzezzzezeezezezzezezeezezeeeeezzeeezzzezeezezeezzzezzezzezzzezeeeeezzzezezezezzezeeezeeeezezzezeeezeezezezzezeeeezezezezzezeeeeeezezeezzzzzeezzeeezzeezzezzezzezezzzezzeezzezzzzezeeeezzzzzeeeeeezeezzzeeeezzeezezzeezezzeezezzzzezzezezezzeeezeeezzezzzezezzezeezzeezeeeeezeeeeeezzeezzzzzezzeeeezzezezezezzeeezezeeeezzzzzzeezzeeeeeeeezzzezzeeeeezezeeezeezzezzeezezzeezezzzezeezeeeeeeeeeezezezzezeezeeeezzzzeezezezzzezezezzzeezezzeezzzzeezezezzezzzzezzzzzzezzzeeezzzzezzzzzeezzzeezeezezzzzzezezzzzeezzezezzeezeeeezezzezzzzeeeeeezzeeezezzzeeeezezzzzezezzzzzzzezzzzeezzeeezzzeezeeeeezzezzezezeezzeeeeezzzzezezeeezezzzezeezzezzzezzzzzzzzeezeezezzzezezeeeeeezzeezezzzezeeeezeezzzezezezeeezzzzzzezezeezzeeezzzezezeeezzezzeeeeeeezzeezzeezzzezeeezeezezeezzezezezezeeeeeezezzzezeeezzeezzeezeezzzzzezeezzzzzezzzezeeezzeezzzeeezezzeezzeezezeezezzezzezzezezzzezezzezeezzzzeezeeezzzezzeeezezeezzezezeeeezeezzzeeezzzzzzzezzzeezzezezzzzzzzzezzzzeeeezeezeeeeezeezezeeeeezezezezzezzezeeeezezzzeezzeezeezeeezzzzezeeeeeezeeezzzzeezzezeeezeeeeezzzeezeeeeezzzezezzzzzzezezeezezzzzezzeezzzezzzezezezeezeeezzzzeeeeezzzzeezeezzzzzzezeeezzeeeeeeeezezzeezzeezeeeezzzzeeeeeeezzzzzzzzzeeezeezeeezzeezzzzezzezeezeezzeezzzzzezzzezzzeezezzezzzezzzzeezzezzzzeezezzezezzzzzezzezeeeezezzezzezzezzzezeeezeeeezzzzeeeeezeezeezzezzzeeeeeeezzeeeeeezzezeeeeezzezzeeeeezezzzzezeezzeeeezeezzezzezezeeezezzeeeeeezeezeezezzzeeezezezeeezzzzezzeezzezzezzzezezzzzzeeeezeeeezeezzzzeeezzzezzzzeezzzzeeezeezeeezeezeezeezezezzzezzzezeezeezzzezzeeezeeezezezzeezzezezeeezzzzeeezezezzeeeezeeeezzzzzeezezezeeezezeezzeeeezeeeezezeezzzeezeeeeeeezzzezzzzeeeeeeeezezzzzezezzezezzzeeeezzeeezzeezzezezzzezzzzzezzezzzzeezzezeezeezzezezzzeeezzzzezzzezzeezeeezzeeeezezzeeezezeeezzezezzeezeeeezzzzeeezzzze", "eezezezzeeeezeezezeezeezzzzezzzzzezzzezezzzzzezezzeezeezzezzzzzzzezeezezezzzzzezeeezzzzzzeezzeezeeezeezezzeezeezeezezeeezeezzzzezeeezzzzezezeeezezeeeezzezzeeezezezzzzzezzeeezzezeeeeezzeeezzezzzeezzeezzzzzeeezezzeeezezeezezeeeeezzzzeeezeezzeezzzzeezezezeeezeeeeeezzzeezezeezeezezzzeezeeezzzezzeezzeeezzeeeezzzeezezzezezzezezzzzeezzeeeezzeeeezeezzeeezzezeeezzzzzeezezezzzzezezzzzeezezzeezeezzzzezeezzzezeeezezzeezezeezzzzzezezezeeezzzzezezzeezezzezeezeeezezeeezeeezzezzzzzezezezzeeezezzzzzzzzzzezeeeezzeezezeeezezezzeezzzeezzzezzzeeeezeezezeezeeezzezzeezzezzzezezzeeezzzzzeeeezezeeezeeeezeeezzzezezzeeeezzzzezzezezzzzzzzzzeezeeeeezeeeeezzzzezezezzezzzzezeezzzezezzzeeezeeeezeezezzzeeezeezezeeeezzeeeeeezezeeezzzzzezeeeezzeezezzzeezzzzeezezeezezeezzeezezzeezzeezzzzzeezeeezzzeeeeezeeezeeeezeeezezzezezezzezezezzezzeezeezzezzeeeeeezezzzzeeeezezezzzezezezzzzeezzeezzzzzzezzeezzzzzzzeezezzeezezeezeeeeeezeeeeeezezeezezezeezzzzzzzzzzzzezzzeezzzezzezzzeeeezezeeeezeezeeeezezzzzezezzzzezzzzzzezzzeeezzezeezzeeeezeezzeeezeezzzezezzezzezezezezeeezeeeezeezzezzzzezzzeeeezeeezzezeeezeezeeeeezzzezzzzzzezeeezzezezeeeezzzezeeezzzezezeeezzzezzeeeeeezezeeezzezezzeeeeezzezeezeezeeezezzzzzzezzzzzezeeezzezezzeezzezzzzzeeezeezezeezzzzzezezzzeezezzzzezzezezezezzezezzezzzezzezzeeeezzzzezzezeeezzzzzeezezezzzzzezezzzeezzzzzzeezeeeeeezezeezzezeezeeezeezezeezzezezzeezeezeeeeezzzzezezzzzezezezeeeezzzeezzeezezzzezeezzezzezzeezzzeezzezezeeeezzeezezezzezzezezzzezzeezeezzzzzzzeezeezezeezeeezezeezezzeezeezeezzzezzeezezezeezzezzzzzzzezeeeezzzzzezzeeeeezezzzeeeezezzeezzzezezzezzzezeezezezzeeeeeeezzzeezzezzzeezzzeezzzezzzeeezeezzzeeeeeezeeezezeeezeezzezezzezezeeezeezeezzezeeeezzeezeezzzzeezzzezzeezzeeeeezzzzeeeezeeezzzeeeeeeeezzeezeeezzzeeezezzeezzzzezzezzzezezzeezzeezeezzzzzeezezzzezzzzezzeeezzezzezzeeeeezzzzezzzzezzzezezezezzzzzzezeezezzzzeeezeeezzzzeezeezzzzezzzezezezezeeezeeeeeezzezzzeezezezezezzzzeezzeezzezeezzzzzzzezzeeezezezzeezzzzzzzezezezzeeeeeeeezezeeezzzeezzzzeezzzezeeezezezzeezeezzzeezzeeeezeezzzzzezzezzeezezzzezzzzeezeeezzeeezeeezeezzezzzzzezzzzezzzzeeeeeezzeezeeeezzzzzzeeeeezezeeezeezezeezzeezzzzzeezzeeezzezezezzezeezzeezzezezeezzzezeezzezzeezeezeeezzzezzzezzzzzzzzeezezeezeezzezzeezzzzeeezezzzzeeezzzzezeeezzzezezezzeeeeeezzezezzzzeezezzzeezezezzeezeezzezzezzzzzeezzzzzeeeezeeezzezzezzeeezzeeeezeezeezzzzezeezezeezeeeezzezzeezeeeeezzezzzzezzezzzezzezeezzeezezeeezzeeeeeeezeezeezeeezzeezeeeezezeezezzeezeezzzeeezzzezezzeeezezzzezzezzzzezzzzzezeezzeezezezeezzzeezezezezzezezzezeeeezeezzzeezzeeeeeezeezeeezeezzzeezzeezezzeezezzzzzeeezezzzeeezeezzzzzzeeezezeezzzzeezezezzzzzezzzezzeezeezezzezezezzezezeeezezezeezeezeezzezezzezzeezzzzzeeezeeezeezzzeezzzzeeeeeeeezezzezzzzzzezezezeezeeezezezezezezzezzzzezzzzzeeezeezzezzeeeeezzezzezezzezeezzezzzeeeezezzeeezzzezzzeezezeezzeeezeezezzezezzzezzezeezezeezzeezeeeeezeeezzezzzzezezezzzezzzezezzzezezzeezzeeezezzezezezezezezzeezezeeeezzzzzeezzzeeezzzzzzzzzzzezeeezzzeeezeeeezezzzezzzzzzeeezzeeezezeeezzzzeezzzzezzeezzzzzezzezezezzeezeezzezezzzzezezezzezeezzzzzeeeezezezzeezeeezezeezezeeeeezezzzzzzeezeeezzezeeeezzezeeezeezeezzezezezeeeeeezzzzzzzeeeezzezeeeeeeeeezzezeezzezeeezezzzezzeezzzezezzzzzeeeeeezeezezeezzzezzeeezzzezeeezzzezzzzeeeeezeeezzeeeezzzezzezzzzezzeeezzezezzezzeezzzezzeezezzzzeeezezzezezezzezezzzzezzzezeeezeezeezzzzzezeezzeezzeeeeezzzzezzzzezzzeezeeezezzzezzzzzzezzzeeeezzzeeezezzezezeeezzeezzzzzezzzezzzeezzzzezezzzeezeeeeezzezzzzezeezezzezzezzezzzeezezzzeezeezeezezeeezzzzzeeeeeeezzeezzezeezzeeeezeeeeeeeezzzzzeezezezzezezzzezzeezezzzeeeezezeeezzeeeezeezzeeeeezzzzeeeeezezzzzezezzezzzzzzezeezeezzzzeezeezzzezzzzeezeezzezezzzzzeeezzezzzzezzzzzezzezeeezezzezzeeeezzezzzzzzezezzezeeeeeezzzzezzezezzeeezzzezezzzzezzezzeezzeeeeezzezezezzzzeezeeezzzezeezzzzzzzezzzeezezzeeeeeeezeezzeezezezezzzzezzeeeeeezzzzezeeeezeeeezzeezeezzzzeezezzzeeeezezzzezeeeezeeeeeezzzezzzzzzeeezezzzezzzezzzeeeezezzezzezezezzeezeeeezeeeeezzzzezeeezeeeezzezzezeeeeeezzeezzezezzeeezzzzzeezzzzezeezeeeezzzzezezezezezeeezzeezzzzzeeezeeezezzeeezzezzzzeezzeeezzeezeeezzezzeeezzzezzeeezzeezezzeeezzzzeezezzeeezzzzezeeezzeezzezzzzzzzezezeeeeeezzeezezzzeeeeezzzezzezeeeezeezezezezeezzzeezzzzzzzeezzzzzeezzeezzzeeeezzzzezzzezzzeeeezeeeezzezzzzzezezzzzzzeezzezezezzzzeeezzzzezzezeeezezzzzzzzzezzezzzeezezezeeezzzezezeeeezzeezeezeezzeeezeezezeezzzezezzeezzezzzeezezeezzzzeezeezeeezeeeeeeeezzeeezzezzezzzzzeezezeezezzezeeezeezezzzeeezezzzzezezezzeeezzeeeezezzezeezezeeezzezezzeezzezzzeezezeeezzezzezeezzzzeezzezzeezezzzezeeeeezeeezzezezezzezeezeezezezeeezezzzzzeeeezezeeezzezzeeeezezzzzezzeezzzezeezzzeeezzezzzzzezezeeezezzeezeeeeeezezezeezezezezzezeeezzezzzzeezzzzezzezzezzeezezzezzezezzeezzezeezzzzzzezezeezzzzzzeezzzeezzeezeezeeezeezzezzzzezzzzzeeeeezzeezeezzeeeezeezzzezzzeezezeeezzeeeeezzzzezzeeezeeezezzzeeezeeezzeezzeezeezzzzzzzezzzezezzezzzzeeeezzzezeezeezzezzezzzeeezzeezzezzezezzeezzzeeeezeeezeezzezezzezezzezzzezzzeezzzeeeezeeeezeezezezzzzeeeeeezeeezzzzezzezzzzzeezezzezeeeeezezzzzzzzzzzeezzzeezzzeezezzeezeezzzezzezzezezezzezeeezzzezeezzzzzeeezeezzeezzeeezzezzzezeeezzzzeeeezzzzeezzezezzzeeezezzezeeezezeezzzeezezzezzzezeeezeeezezeezezzezzzezzeezezezezeeeezezeezzzzzeezzzzzzzezzzezeeezezzeeezzzeeezzzzeezzezezzezzeezezeeeezzeeezezezzezezezezzzzzeezezezzeeezzzzzzezeeezezezzzzzezezezzzeezezeeeezzeezzezzezeeeeeezezzezzzzezezzeeezeezzzeeeeeezezeeezzeezezzeeezezzzeeeezzzeeezeeezzzeeezzezzeeeeezzeeezezzzzezzezzeezzzeeezezezeeezzzeezzezezzezeezzzezezeeezeezezzeeeeezezzzzeezezzeezezeeezzezzzzezzzzeezzzezeezezzezzezzzzzzeezzzzzzzzezezeeezzezeezzzezzzeeezzeezzzezezezezeeezezzzeezzeezeezzzezzezzzezzzzezzezezzzeeezzezzzeezeeeezeezezzzeeeeeezeeeeeezeeeezeeeeezzzezzzezzzzeeeezzezezzezezzeeezzzzeezezzeezzezzzzeeezzzezezeeezzezezzzeeezezeezeeezezzezezezzzezzeeezzeeeezeezzzzzzeezeezeezzezeezezezeezezeezzzeeezezzzzeezezzzezzezezzeezezzezeeeezzezezzzeeezzezeeezzezzezzezzeezzzeezezeeezeeeezezzeeeezzzeeeeezezzeeezzeezzzeezzezzzzezeeeeeeezzezzzzezezeeeezzeeezezezzeezzezzezezzzzzezezzzeezeezezeeezeeezzzeeezzezezeezeezeeezzzeeezeeezzezezzezezzezezezzzeezeeeeeezezeezzzezzezzzeezzeeezezzezeeeezezezzzezeezzzzezeeeezeeezzeeeeezzezezzezzezzzezezeeezeezezeezzzeeezezzzzezzeezezzzzeeeeeeeezzzeezezzzeezezzezezeezezzzezeezzzzzezezeezeeezeezzezezezeezzezezzeeeeezzzzezezzezzeeeezzzeeezzeezzzzzzzezzezzeeezeeeeeeezezzzezeeezzzzzezeeezezeezzezzzzezzzzzeezzzzezzezzezeeezzezzeeezeezzzezzezzzeeeezzzeeeeezeezzzzzzeeeeezzzezeezeeezzzezeeezezzzezzeeeeezeeeeeezeezzeezzeezezzeezzeeezeezzzzezzeeeeeezezzezezzzeezeezeezezzeezezzeezeeeeezeeeezzzeezeezzzeeezezezzezeeeezeeezzzeezeeezezzzzzezzzzzzezzzeezzezeezzzeezeezeeeezezezeeezzzeeeezezezzzzeezeezzzezzeeeezeeeeeeeezzzezzzzzeezezezezzezeezzeezzeeezezzzzeeezeezeezezzeezezzeeeezezezzzezzzzezzzzezezezezeeezeeeezzzzzeezzeezzeeeeezeeezzeezzzeezezzzeezezeeeeeezeezzezezzezezzzezzzzezzezezzzezeeezzzzzezezzezzeezzzeeezzzeeeeezzezzzzezzezeeezeezeezezezeezzzeeeeezzzzzzzeeeeeezzeeeezezzzzezzeezzzzezeeezzeeeeezezzeezezeeezeeezeeezezezzzeezzzzzeezeeeeezzzzeezzeezeezezezeeezezezzzzezzzzeeezzezezezeezezzzzzezezeeezzzzezeezeezeeeeezzezezzzzezeeezzezezezzzezzzzezzzzzezzzezezeeezzezeeezezzezezzeezzeezzezzzeezzezzezeeezzezezzezeeezzzeezzzzzezeezezeezezeezezezeezeezeezzeeeezzzzezzzezeeezzzeezezeezzezzeezzeeezzzzzezeeeeeezzeeeezzezzezezeeeezzeezzeeeeeezeeeeeezezezzezzzeezezzzeeeezzzzeezezezzzzeeezezzzeeeeezeezzzeeezezzzezeeezezezzezzzzzzezzezeeezzzzeezeezezzeezeeezezzzeeeeezeeezzzzzzzeeeeeezzezeezzzzzezeezzezzzezeezzzeeezeezzzeezezezezzzzeeezzezzzzzeezeezeezzeeezzezezezeeezzezezeezzeeezeeezezzzeezezzeeezezzzeeezzezzeezeezzzzezeeeezeezzezeezezezezeezeeeeeezeezzzezzeezzzezzzezzzzzzzeeezezezzeezeeezezeezezzezzeezeeezzzeezzzezeezeezzzezzeezezzzezzezzeezzeeeeezzzzzzezzezeezzezzeezzzeezeeezezzzzezeeezzzezezezzzeezeeezzzezezeeezzeezezzezezzezeezzeeeeeezezeezeezezeezzezezzzzzzzezezzzzeeezeezeeeeezzzezeeezezeeeeezzeezzzzzeeeeezzzzeezzzzzeezeezezeeezzzezezzzzzzeezeeezzeezzzezzeeezeezeeezzeezzzeezzzzezezzzzzeezzzeezeezeeezzezzzzezeezzzeezzezzzzeeeezzeezeezzzzeezezezeeeeezzeeeezzzezzzezzezezzeezzzzzeezzezzzzzzezezzezeeeeezzzzzzzzeeeeeeezzzezeeezeeeezezzzeezzeeeezezeeezzeezzeezezzzezezeeeezzzzezezeeezzzeeeeezezzeeezzzzzeeezeezzeeezezeeeezeeezzezzzeeeezzezeezeezzzezzezezezzzezzeezezzzeezzzzzzzzezeeezeeeeezzzzezezzeezeeezezzzeeeeeezzzzeeezzezzzzzzzezezzzeezzeeeezzzeezzeezzeeezzzzeezeezeeeezeeeeezzzeeezeezzeeeeezeezzzzezzzezzzzezezzeeeezezeezeeeeeeezeezzzeeeezezeeezezezzzeeezezeeeezeezeezzezzzezeezeeeeezzeezezzzzzzezezzeezezzzeezzeeeezeeeeeezzzeeezeezzezezzzezezezeeeezzeezzezezzzezezeezzeezeezzzeeeeezezezeezeeezzezzeeeeezezzezezezzezeezzeeeeezzzezezzezeeezzeezeeeezeeezezzzzeezzzzeezzzzeeezzezeezezeezeezeezezezezzzzzzeeezzeezezzzzzeeezzeezzzeezzezezzzzeeeezeezzezezezezezezeezezzzezeezeeezzeeezeezezzzzzeezzezzezzezzeezzezezzeeeezeeezezzeezzzzzezeeeeeezzzezeezzzzzezzzzzzeezzezeeezzezeezezeeeezzezzzzeezzzzzeezezezzezeeezezezzzzeeeeezezeeezezzzezezzeeezezzeezzezezeezezzeeeezeezzzeezeezezezzzezezzzzezzzzezeezeeezeezezeezzzzzzezezeezezezzezeezeeezeezeezeeezezezeezzeezeeezzeezzezzezzezezeeeezzzzzeeeezezzezezeeeeezzzeeezeezzezzzzzeezezeezzzezezeezzeeeeeeeeeezezeezzzeeezeezeezezezzezzzzeezeeezeeeeezzzezzezezzzzzzezzzezzeeezeeezeeeezezzezeeezzzzzzzzezeezzezzzeeeezzzzeezezezzzzezeeeeezezzzeezezeezezezzezezzeeezeezezzzzzzezezeeezezzzezeeeeezeeezezzezzezeezezzzeezzzzzeezezeeezezezzzzezeezzezezezzezzzeezezzeeeezeezezzzzzzezezezeeezezzezezeeeezeezezzeezzeeeeezzzzezezeezeezzeezezezzzzzzezeezeezzezzezezezzzezezezzzzezzeeeezzeezezzzezzeeeezzzezzezezzzezzeeezezzzezzzzzeezzezeeezzeezeezezeezzzzezeezeeezzzzezzeezeeezeeeezezzezeezezzeezzzzzzeeezzezezeezzeezzezezzezzeezzezzzzzzeeeeezezzezzeezeeezeezeeeeezezeezzeeeezzezzzzeeeezzezzeeeeeeeezzeeeeeeezezeezeeeeezzzzzeeezeezeezezezzezzzzzzzeeezzeeezezzezezeeezezezezzeezzeeeeeeeeezzezeeeeezezzzzeezeezeezzezezezzeezzzezzeezezzezeezzeezzzzzzezezeezezzezeeeeeeezzzzezezezezezezzezeezzezzzeeezezezzezezzezeezzzzeeeeeeezzzezeeezezeeezezzzzzzzzzeeeeezezzezeeeeezzeezzzeezzzeeezeezzzeeeezeeezzzezzezezzezezzzzezzzzeezezezzezzzezzzezeeezezzzzeezeeezeeeezzezzezeeeezeeeeeezzzzeezezzezezeezzzeeezzezeezzzezzezzez"));
        }
    }

    @Nested
    @DisplayName("Is Substitution Cipher?")
    public class IsSubstitutionCipherTest {
        IsSubstitutionCipher iSC = new IsSubstitutionCipher();

        @Test
        public void iSCTest1() {
            assertTrue(iSC.solution("aacb", "aabc"));
        }

        @Test
        public void iSCTest2() {
            assertFalse(iSC.solution("aa", "bc"));
        }

        @Test
        public void iSCTest3() {
            assertTrue(iSC.solution("aaxxaaz", "aazzaay"));
        }

        @Test
        public void iSCTest4() {
            assertFalse(iSC.solution("aaxyaa", "aazzaa"));
        }

        @Test
        public void iSCTest5() {
            assertTrue(iSC.solution("aabc", "aacb"));
        }

        @Test
        public void iSCTest6() {
            assertFalse(iSC.solution("dccd", "zzxx"));
        }

        @Test
        public void iSCTest7() {
            assertTrue(iSC.solution("ddcc", "zzxx"));
        }

        @Test
        public void iSCTest8() {
            assertFalse(iSC.solution("abc", "ccc"));
        }

        @Test
        public void iSCTest9() {
            assertTrue(iSC.solution("abcdefg", "hijklmn"));
        }

        @Test
        public void iSCTest10() {
            assertTrue(iSC.solution("aaabbbccc", "aaabbbccc"));
        }

    }
}
