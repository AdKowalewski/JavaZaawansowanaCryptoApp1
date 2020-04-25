package sda.ciphers.CesarSipher;

public class CesarCipher {

    private String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String base;
    private String encoded;
    private String decoded;

    public CesarCipher() {
        base = "";
        encoded = "";
        decoded = "";
    }

    public CesarCipher(String toEncode) {
        base = toEncode;
    }

    public String getBase() {
        return base;
    }

    public void encode() {
        StringBuilder tempEncode = new StringBuilder();
        for (int i = 0; i < base.length(); i++) {
            char letter = base.charAt(i);
            if(!Character.isLetter(letter)) continue;
            final boolean isLower = Character.isLowerCase(letter);
            if (!isLower) {
              letter = Character.toLowerCase(letter);
            }
            final int position = alphabet.indexOf(base.charAt(i));
            final char c = alphabet.charAt(getEncodedPosition(position));
            tempEncode.append(isLower ? c : Character.toUpperCase(c));
        }
        encoded = tempEncode.toString();
    }

    public int getEncodedPosition (int position) {
        return (position + 3) % 26;
    }

    public String getEncoded() {
        return encoded;
    }

    public void decode() {
        StringBuilder tempDecode = new StringBuilder();
        for (int i = 0; i < base.length(); i++) {
            char letter = base.charAt(i);
            if(!Character.isLetter(letter)) continue;
            final boolean isLower = Character.isLowerCase(letter);
            if (!isLower) {
                letter = Character.toLowerCase(letter);
            }
            final int position = alphabet.indexOf(base.charAt(i));
            final char c = alphabet.charAt(getDecodedPosition(position));
            tempDecode.append(isLower ? c : Character.toUpperCase(c));
        }
        decoded = tempDecode.toString();
    }

    public int getDecodedPosition (int position) {
        return (position + 23) % 26;
    }

    public String getDecoded() {
        return decoded;
    }
}
