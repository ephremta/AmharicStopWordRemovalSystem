package amharicstopwordremoval;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Pattern;

/**
 *
 * @author Epha
 */
public class Tokenizer {
//parse sentence using demarcation of words and compund words
    public List parsetSentencesList(String sentence) {
        List words = new ArrayList<>();
        String delimiter = " ";
        String wrd[] = sentence.trim().split(delimiter);
        for (String w : wrd) {
            boolean add = words.add(new Normalizer().fontNormalizer(w));
            //words.add(w);
        }
        return new StopwordRemoval().removeStopList(words);
        //  return words;
    }
//parse paragraph using demarcation of sentences and questions 
    @SuppressWarnings("unchecked")
    public List parseParagraphsList(String textContent) {
        List sentences = new ArrayList<>();
        String regex = "[\\�?�\\?\\!\\�?�]";
        Pattern delimiter = Pattern.compile(regex);
        String sen[] = delimiter.split(textContent);
        sentences.addAll(Arrays.asList(sen));
        return sentences;
    }
//write the result to file
    public void createResultOfTokens(List word) throws Exception {
        try (FileWriter dictWriter = new FileWriter("C:\\Users\\Epha\\Documents\\NetBeansProjects\\StopWordRemoval\\TestFile\\Result")) {
            for (int i = 0; i < word.size(); i++) {
                dictWriter.write(word.get(i) + "\n");
            }
            dictWriter.flush();
        }
    }
//get input from file
    public List getAllTokens() throws Exception 
    {
        String text = new FileReaders().read("C:\\Users\\Epha\\Documents\\NetBeansProjects\\StopWordRemoval\\TestFile\\raw_text");
        // you can declare your varibale here to get inline input from the user
        List sen;
        sen = parseParagraphsList(text.trim());
        List allWords = new ArrayList<>();
        // List<String> type = new ArrayList<>();
        for (Iterator it = sen.iterator(); it.hasNext();) {
            Object p = it.next();
            List words = parsetSentencesList(p.toString().trim());
            words.stream().forEach(new Consumer() {
                @Override
                @SuppressWarnings("unchecked")
                public void accept(Object w) {
                    allWords.add(w.toString());
                    // type.add(w.toString());
                }
            });
        }
        createResultOfTokens(allWords);
        return allWords;
    }

//    public static void main(String[] args) throws Exception {
//        Tokenizer t = new Tokenizer();
//        t.getToken();
//        System.out.println(t.getToken() + "\n");
//
//    }
}
