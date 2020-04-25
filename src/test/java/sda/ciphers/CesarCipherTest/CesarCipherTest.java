package sda.ciphers.CesarCipherTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import sda.ciphers.CesarSipher.CesarCipher;

import static org.junit.jupiter.api.Assertions.*;

class CesarCipherTest {

//    public static final String SAMPLE_BASE_ABC = "abc";

    @Test
    public void cesarCipherIsCreated() {
        final CesarCipher cipher = new CesarCipher();
        assertNotNull(cipher);
    }

    @DisplayName("When no arg construct then empty encoded string and empty decoded string")
    @Test
    public void emptyArgConstructorReturnEmptyString() {
        final CesarCipher cipher = new CesarCipher();
        assertEquals("", cipher.getBase());
        assertEquals("", cipher.getEncoded());
        assertEquals("", cipher.getDecoded());
    }

//    @Test
//    public void passedParamToConstructorReturnParamString() {
//        final CesarCipher cipher = new CesarCipher(SAMPLE_BASE_ABC);
//        assertEquals(SAMPLE_BASE_ABC, cipher.getBase());
//    }

    @DisplayName("Check encode function")
    @ParameterizedTest(name = "Test case {index} : input {0} gives result {1}")
    @CsvSource({"abc,def", "xyz,abc", "xYz,aBc", "'',''"})
    public void getEncodeStringWhenGivenParamInput(String entry, String result) {
        final CesarCipher cipher = new CesarCipher(entry);
        cipher.encode();
        String encode = cipher.getEncoded();
        assertEquals(result, encode);
    }

    @DisplayName("Check decode function")
    @ParameterizedTest(name = "Test case {index} : input {0} gives result {1}")
    @CsvSource({"def,abc", "abc,xyz", "aBc,xYz", "'',''"})
    public void getDecodeStringWhenGivenParamInput(String entry, String result) {
        final CesarCipher cipher = new CesarCipher(entry);
        cipher.decode();
        String decode = cipher.getDecoded();
        assertEquals(result, decode);
    }
}