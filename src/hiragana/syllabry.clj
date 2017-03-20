(ns hiragana.syllabry
  (:gen-class))

;;Japanese hiragana syllabry in gojūon ordering.
(defonce syllabograms
  {
    :monographs {
                 :vowels {:a "\u3042" :i "\u3044" :u "\u3046" :e "\u3048" :o "\u304A"}
                 :consonant-vowel-unions {
                                           :ka "\u304B" :ki "\u304D" :ku "\u304F" :ke "\u3051" :ko "\u3053"
                                         }
                 :consonant {}
                }
    :monograph-diacritics {}
    :digraphs {}
    :digraph-diacritics {}
  })

