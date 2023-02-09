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
    public void wrongCode() {
        MorseCode code = new MorseCode();
        String expected = "-";
        String actual = code.getCode("Wrong code, please check.");
        assertEquals(expected, actual);
    }

}
