package Rot13Cipher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Cipher ROT-13 under test")
class Rot13CipherTest {

    @DisplayName("When no arg constructor then empty encode string and empty decode string")
    @Test
    public void emptyArgConstructorReturnEmptyString() {
        final Rot13Cipher cipher = new Rot13Cipher();
        assertEquals("", cipher.getBase());
        assertEquals("", cipher.getEncoded());
        assertEquals("", cipher.getDecoded());
    }

    @DisplayName("Check encode function")
    @ParameterizedTest(name = "Test case {index} : input {0} gives result {1}")
    @CsvSource({"abc,nop", "xyz,klm", "xYz,kLm", "'',''"})
    public void getEncodeStringWhenGivenParamInput(String entry, String result) {
        final Rot13Cipher cipher = new Rot13Cipher(entry);
        cipher.encode();
        String encode = cipher.getEncoded();
        assertEquals(result, encode);
    }

    @DisplayName("Check decode function")
    @ParameterizedTest(name = "Test case {index} : input {0} gives result {1}")
    @CsvSource({"nop,abc", "klm,xyz", "kLm,xYz", "'',''"})
    public void getDecodeStringWhenGivenParamInput(String entry, String result) {
        final Rot13Cipher cipher = new Rot13Cipher(entry);
        cipher.decode();
        String decode = cipher.getDecoded();
        assertEquals(result, decode);
    }
}