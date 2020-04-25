package sda.ciphers.Rot13CipherTest;

import sda.ciphers.CesarSipher.CesarCipher;

public class Rot13Cipher extends CesarCipher {

    public Rot13Cipher(String toEncode) {
        super(toEncode);
    }

    public Rot13Cipher() {
        super();
    }

    @Override
    public int getEncodedPosition (int position) {
        return (position + 13) % 26;
    }

    @Override
    public int getDecodedPosition (int position) {
        return (position + 13) % 26;
    }
}
