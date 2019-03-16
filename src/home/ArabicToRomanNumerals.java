package home;


import java.util.TreeMap;

 class ArabicToRomanNumerals {
    private static final TreeMap<Integer, String> ROMAN_PREFIX = new TreeMap<>();

    static {
        ROMAN_PREFIX.put(1_000, "M");
        ROMAN_PREFIX.put(500, "D");
        ROMAN_PREFIX.put(100, "C");
        ROMAN_PREFIX.put(50, "L");
        ROMAN_PREFIX.put(10, "X");
        ROMAN_PREFIX.put(9, "IX");
        ROMAN_PREFIX.put(4, "IV");
        ROMAN_PREFIX.put(5, "V");
        ROMAN_PREFIX.put(1, "I");
    }

     static String convert(int arabic) {
        Integer prefix = ROMAN_PREFIX.floorKey(arabic);

        if (arabic == prefix) return ROMAN_PREFIX.get(prefix);
        return ROMAN_PREFIX.get(prefix) + convert(arabic - prefix);
    }

 }