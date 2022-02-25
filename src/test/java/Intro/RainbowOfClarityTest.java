package Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Rainbow of Clarity")
public class RainbowOfClarityTest {

    @Nested
    @DisplayName("Rainbow of Clarity")
    public class IsDigitTest {

        IsDigit iD = new IsDigit();

        @Test
        public void iDTest1() {
            assertTrue(iD.solution('0'));
        }

        @Test
        public void iDTest2() {
            assertFalse(iD.solution('-'));
        }

        @Test
        public void iDTest3() {
            assertFalse(iD.solution('O'));
        }

        @Test
        public void iDTest4() {
            assertTrue(iD.solution('1'));
        }

        @Test
        public void iDTest5() {
            assertFalse(iD.solution('!'));
        }

        @Test
        public void iDTest6() {
            assertTrue(iD.solution('0'));
        }

        @Test
        public void iDTest7() {
            assertFalse(iD.solution('@'));
        }

        @Test
        public void iDTest8() {
            assertFalse(iD.solution('+'));
        }

        @Test
        public void iDTest9() {
            assertTrue(iD.solution('6'));
        }

        @Test
        public void iDTest10() {
            assertFalse(iD.solution('('));
        }

        @Test
        public void iDTest11() {
            assertFalse(iD.solution(')'));
        }

    }

    @Nested
    @DisplayName("Line Encoding")
    public class LineEncodingTest {

        LineEncoding lE = new LineEncoding();

        @Test
        public void lETest1() {
            assertEquals("2a3bc", lE.solution("aabbbc") );
        }

        @Test
        public void lETest2() {
            assertEquals("a2bca2b", lE.solution("abbcabb") );
        }

        @Test
        public void lETest3() {
            assertEquals("abcd", lE.solution("abcd") );
        }

        @Test
        public void lETest4() {
            assertEquals("4z", lE.solution("zzzz") );
        }

        @Test
        public void lETest5() {
            assertEquals("7wa7w", lE.solution("wwwwwwwawwwwwww") );
        }

        @Test
        public void lETest6() {
            assertEquals("15c", lE.solution("ccccccccccccccc") );
        }

        @Test
        public void lETest7() {
            assertEquals("qwertyuioplkjhg", lE.solution("qwertyuioplkjhg") );
        }

        @Test
        public void lETest8() {
            assertEquals("2s2i2gk3o", lE.solution("ssiiggkooo") );
        }

        @Test
        public void lETest9() {
            assertEquals("adf3a", lE.solution("adfaaa") );
        }

        @Test
        public void lETest10() {
            assertEquals("2bj2adlkjdl", lE.solution("bbjaadlkjdl") );
        }

    }

}
