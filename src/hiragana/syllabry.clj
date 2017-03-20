(ns hiragana.syllabry
  (:gen-class))

;;Japanese hiragana syllabry in unicode with gojūon ordering.
(defonce syllabograms
  {
    :monographs {
                 :vowels {:a "\u3042" :i "\u3044" :u "\u3046" :e "\u3048" :o "\u304A"}
                 :consonant-vowel-unions {
                                           :ka "\u304B" :ki "\u304D" :ku "\u304F" :ke "\u3051" :ko "\u3053"
                                           :sa "\u3055" :si "\u3057" :su "\u3059" :se "\u305B" :so "\u305D"
                                           :ta "\u305F" :ti "\u3061" :tu "\u3063" :te "\u3066" :to "\u3068"

                                         }
                 :consonant {}
                }
    :monograph-diacritics {}
    :digraphs {}
    :digraph-diacritics {}
  })

