package amharicstopwordremoval;

/**
 *
 * @author Epha
 */
public class Normalizer
{
    public String fontNormalizer(String word)
    {
        String amharicPointSymbols= "[\\፡\\፤\\፦\\፣\\፥\\!\\)\\(\\\"\\]\\[\\<\\>\\']";
        word = word.replaceAll(amharicPointSymbols, "");
        return normalizeAmharicFonts(word);
    }

    public String normalizeAmharicFonts(String words) 
    {
        String h1 = "[\\ሃ\\ኅ\\ሀ\\ኃ\\ሐ\\ሓ\\ኻ]";
        String h2 = "[\\ሁ\\ሑ\\ኁ\\ዅ]";
        String h3 = "[\\ሂ\\ኂ\\ሒ\\ኺ]";
        String h4 = "[\\ሄ\\ኌ\\ሔ\\ዄ]";
        String h5 = "[\\ህ\\ሕ\\ኅ]";
        String h6 = "[\\ሆ\\ኆ\\ሖ\\ኾ]";
        String s1 = "[\\ሰ\\ሠ]";
        String s2 = "[\\ሱ\\ሡ]";
        String s3 = "[\\ሲ\\ሢ]";
        String s4 = "[\\ሳ\\ሣ]";
        String s5 = "[\\ሴ\\ሤ]";
        String s6 = "[\\ስ\\ሥ]";
        String s7 = "[\\ሶ\\ሦ]";
        String a1 = "[\\አ \\ዓ \\ኣ \\ዐ]";
        String a2 = "[\\ኡ\\ዑ]";
        String a3 = "[\\ኢ\\ዒ]";
        String a4 = "[\\ዔ\\ኤ]";
        String a5 = "[\\እ\\ዕ]";
        String a6 = "[\\ኦ\\ዖ]";
        String ts1 = "[\\ጸ\\ፀ]";
        String ts2 = "[\\ጹ\\ፁ]";
        String ts3 = "[\\ጺ\\ፂ]";
        String ts4 = "[\\ጻ\\ፃ]";
        String ts5 = "[\\ጼ\\ፄ]";
        String ts6 = "[\\ጽ\\ፅ]";
        String ts7 = "[\\ጾ\\ፆ]";
        words = words.replaceAll(h1, "ሀ");
        words = words.replaceAll(h2, "ሁ");
        words = words.replaceAll(h3, "ሂ");
        words = words.replaceAll(h4, "ሄ");
        words = words.replaceAll(h5, "ህ");
        words = words.replaceAll(h6, "ሆ");
        words = words.replaceAll(s1, "ሰ");
        words = words.replaceAll(s2, "ሱ");
        words = words.replaceAll(s3, "ሲ");
        words = words.replaceAll(s4, "ሳ");
        words = words.replaceAll(s5, "ሴ");
        words = words.replaceAll(s6, "ስ");
        words = words.replaceAll(s7, "ሶ");
        words = words.replaceAll(a1, "አ");
        words = words.replaceAll(a2, "ኡ");
        words = words.replaceAll(a3, "ኢ");
        words = words.replaceAll(a4, "ኤ");
        words = words.replaceAll(a5, "እ");
        words = words.replaceAll(a6, "ኦ");
        words = words.replaceAll(ts1, "ፀ");
        words = words.replaceAll(ts2, "ፁ");
        words = words.replaceAll(ts3, "ፂ");
        words = words.replaceAll(ts4, "ፃ");
        words = words.replaceAll(ts5, "ፄ");
        words = words.replaceAll(ts6, "ፅ");
        words = words.replaceAll(ts7, "ፆ");
        return words;
    }

}
