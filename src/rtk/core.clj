(ns rtk.core
  (:require [hiragana.syllabry :refer [syllabograms]])
  (:gen-class))

(defn -main
  "will transliterate between rōmaji and japanese kana."
  [& args]
  (println syllabograms))
