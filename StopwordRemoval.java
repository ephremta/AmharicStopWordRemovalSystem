/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amharicstopwordremoval;

import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Epha
 */
public class StopwordRemoval {

    private static final String AMHARICSTOPWORDLIST
            = " �?�?"
            + " �?በር"
            + " �?በረ"
            + " �?በሩ"
            + " አወ "
            + "እና "
            + " ወይ�?"
            + " እዚህ "
            + "ሌላ"
            + " እባክሸ"
            + " እባክህ"
            + "  እባካች�?"
            + " እዚያ "
            + "ሌሎች"
            + " ከ�?ሉ "
            + "ተጨማሪ "
            + "ናቸ�?"
            + " እያንዳንዱ"
            + " �?ጪ "
            + " እያንዳንዳች�?"
            + " ናት "
            + "ጥቂት "
            + "እንዲ�?�?"
            + " በርካታ"
            + " እንደገና "
            + "�?በረች "
            + "ብቻ"
            + " ማን�?"
            + " ያ�?ሉ�?"
            + " እባክዎ"
            + " �?ገሮች "
            + "ከ�?�ት"
            + " ከላይ"
            + " ታች "
            + "ከታች"
            + " በታች "
            + "የታች "
            + "�?ስጥ"
            + " ከኋላ "
            + "መካከ�? "
            + "ከመካከ�?"
            + " ሰሞኑን "
            + "ከሰሞኑ "
            + "በሰሞኑ "
            + "የሰሞኑ "
            + "ጋራ"
            + " የጋራ "
            + "ከጋራ "
            + "ተለያዩ"
            + " ተለያየ "
            + "ድረስ "
            + "እስከ"
            + " በጣ�?"
            + " �?ን "
            + "ሲሆን "
            + "ሲ�? "
            + "�?ስጥ"
            + " ላይ"
            + " �?ይ "
            + "�?�? "
            + "ጋር "
            + "ናቸ�?"
            + " ይህ "
            + "ወደ"
            + " ወዘተ"
            + " እና "
            + "ወይ�?"
            + " እንደ "
            + "�?�ት"
            + " ወደ�?�ት "
            + "�?ገር"
            + " በኋላ"
            + " በኩ�?"
            + " ስለ "
            + "ደ�?ሞ "
            + "እንጂ "
            + "በዚህ "
            + "ሆኖ"
            + " �?ዩ "
            + "ጊዜ "
            + "  እና "
            + "�?ክኒያቱ�?"
            + "ይቻላ�? "
            + "መጀመሪያ"
            + " እዚህ "
            + "ይህ  "
            + "�?ና�?ባት"
            + "ባጋጣሚ "
            + "ስለዚህ"
            + " ቀጣይ"
            + " እ�?ሱ"
            + " እሱ"
            + " እሷ"
            + " እኛ "
            + "ወደ�?�ት "
            + "ከዚህ "
            + "�?ጭ"
            + " አንተ "
            + "እባክህ";
    Dictionary<Object, Object> stopWordLists = new Hashtable<>();
    public final Set<String> amharicStopwordList = new HashSet<>();

    StopwordRemoval() {
        this.amharicStopwordList.addAll(Arrays.asList(AMHARICSTOPWORDLIST.trim().split(" ")));

    }

    /**
     *
     * @param tokens
     * @return
     */
    @SuppressWarnings("unchecked")
    public List removeStopList(List tokens) {
        List tokensWithOutStopWord = new ArrayList<>();
        Set<String> stopwords;
        stopwords = amharicStopwordList;
        for (Object t : tokens) {
            if (stopwords.contains(t)) {
                stopWordLists.put(0, t);
//                for (Enumeration i = stopWordLists.elements(); i.hasMoreElements();)
//                {
//                    System.out.println(i.nextElement());
//            
//                }   
//               
                continue;
            }
            tokensWithOutStopWord.add(t);
        }
        return tokensWithOutStopWord;
    }

   

}
