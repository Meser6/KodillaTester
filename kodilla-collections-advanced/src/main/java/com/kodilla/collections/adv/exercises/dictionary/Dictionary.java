package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishWord, EnglishWord englishWord) {
    List<EnglishWord> englishWords = dictionary.getOrDefault(polishWord, new ArrayList<>());
    englishWords.add(englishWord);
    dictionary.put(polishWord, englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishWord) {
        return Collections.emptyList();
    }

    public List<EnglishWord> findEnglishWords(String polishWord, PartOfSpeech partOfSpeech) {
        return Collections.emptyList();
    }
    public int size(){
        return dictionary.size();
    }
}
/*
Metoda ta pobiera z mapy listę angielskich słów, odpowiadających wskazanemu słowu polskiemu. Jeżeli żadnego słowa angielskiego w mapie nie ma, to tworzona jest pusta lista (wykorzystujemy tu metodę getOrDefault z interfejsu Map, która zwraca podaną jako argument wartość domyślną, gdy mapa nie zawiera szukanego przez nas wpisu). Do tej listy (dotychczas istniejących w mapie słów angielskich lub nowej pustej listy) dodawany jest nasz wpis. Następnie wpis ten jest wstawiany do mapy. Metoda put mapy wstawi nowy wpis lub zaktualizuje istniejący, jeżeli wpis o danym kluczu (czyli polskim słowie) był już wcześniej w mapie obecny.
 */
