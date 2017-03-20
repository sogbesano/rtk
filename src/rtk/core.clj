(ns rtk.core
  (:require [hiragana.syllabry :refer [syllabograms]])
  (:gen-class))

(defn -main
  "Will transliterate between rōmaji and japanese kana."
  [& args]
  (println (:vowels (:monographs syllabograms))))
