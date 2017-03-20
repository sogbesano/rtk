(ns hiragana.syllabry
  (:gen-class))

;;japanese hiragana syllabry in unicode with gojūon ordering.
(defonce syllabograms
  {
    :monographs {
                 :vowels {:a "\u3042" :i "\u3044" :u "\u3046" :e "\u3048" :o "\u304A"}
                 :consonant-vowel-unions {
                                           :ka "\u304B" :ki "\u304D" :ku "\u304F" :ke "\u3051" :ko "\u3053"
                                           :sa "\u3055" :si "\u3057" :su "\u3059" :se "\u305B" :so "\u305D"
                                           :ta "\u305F" :ti "\u3061" :tu "\u3063" :te "\u3066" :to "\u3068"
                                           :na "\u306A" :ni "\u306B" :nu "\u306C" :ne "\u306D" :no "\u306E"
                                           :ha "\u306F" :hi "\u3072" :hu "\u3075" :he "\u3078" :ho "\u307B"
                                           :ma "\u307E" :mi "\u307F" :mu "\u3080" :me "\u3081" :mo "\u3082"
                                           :ya "\u3084"              :yu "\u3086"              :yo "\u3088"
                                           :ra "\u3089" :ri "\u308A" :ru "\u308B" :re "\u308C" :ro "\u308D"
                                           :wa "\u308F" :wi "\u3090" :we "\u3091"              :wo "\u3092"
                                         }
                 :consonant {:n "\u3093"}
                 :diacritics { 
                               :ga "\u304C" :gi "\u304E" :gu "\u3050" :ge "\u3052" :go "\u3054"
                               :za "\u3056" :zi "\u3058" :zu "\u305A" :ze "\u305C" :zo "\u305E"
                               :da "\u3060" :di "\u3062" :du "\u3065" :de "\u3067" :do "\u3069" 
                             }
                 }
    :digraphs {}
  })

