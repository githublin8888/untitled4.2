package assignmentVersion2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MorseCodeTestFall {
    @Test
    public void englishToMorse() {
        MorseCode code = new MorseCode();
        String expected = "-***";
        String actual = code.getCode("B");
        assertEquals(expected, actual);
    }

    @Test
    public void morseToEnglish() {
        MorseCode code = new MorseCode();
        String expected = "A";
        String actual = code.getCode("*-");
        assertEquals(expected, actual);
    }

    @Test
    public void morseToNr() {
        MorseCode code = new MorseCode();
        String expected = "1";
        String actual = code.getCode("*----");
        assertEquals(expected, actual);
    }

    @Test
    public void nRTomorse() {
        MorseCode code = new MorseCode();
        String expected = "*----";
        String actual = code.getCode("1");
        assertEquals(expected, actual);
    }

    @Test
    public void morseToCharacter() {
        MorseCode code = new MorseCode();
        String expected = "**--**";
        String actual = code.getCode("?");
        assertEquals(expected, actual);
    }

    @Test
    public void characterToMorse() {
        MorseCode code = new MorseCode();
        String expected = "?";
        String actual = code.getCode("**--**");
        assertEquals(expected, actual);
    }

    @Test
    public void lowercaseLong() {
        MorseCode code = new MorseCode();
        String expected = "*- -*** -*-*";
        String actual = code.getCode("a b c");
        assertEquals(expected, actual);
    }

    @Test
    public void uppercaseLong() {
        MorseCode code = new MorseCode();
        String expected = "-*-- * *** **--**";
        String actual = code.getCode("Y E S ?");
        assertEquals(expected, actual);
    }
    @Test
    public void mixMoEng() {
        MorseCode code = new MorseCode();
        String expected = "*- -*** A";
        String actual = code.getCode("a b *-");
        assertEquals(expected, actual);
    }

    @Test
    public void mixWrongAndRight() {
        MorseCode code = new MorseCode();
        String expected = "invalid code E";
        String actual = code.getCode("-------- *");
        assertEquals(expected, actual);
    }

    @Test
    public void illegalCode1() {
        MorseCode code = new MorseCode();
        String expected = "It contains illegal character.";
        String actual = code.getCode("==!@#");
        assertEquals(expected, actual);
    }
    @Test
    public void illegalCode2() {
        MorseCode code = new MorseCode();
        String expected = "It contains illegal character.";
        String actual = code.getCode(")--");
        assertEquals(expected, actual);
    }


    @Test
    public void noSpace1() {
        MorseCode code = new MorseCode();
        String expected = "Please separate with space.";
        String actual = code.getCode("ASDF.");
        assertEquals(expected, actual);
    }

    @Test
    public void noSpace2() {
        MorseCode code = new MorseCode();
        String expected = "Please separate with space.";
        String actual = code.getCode("12345");
        assertEquals(expected, actual);
    }


}
