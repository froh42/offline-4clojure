;; Anagram Finder - Medium
;; Write a function which finds all the anagrams in a vector of words.  A word x is an anagram of word y if all the letters in x can be rearranged in a different order to form y.  Your function should return a set of sets, where each sub-set is a group of words which are anagrams of each other.  Each sub-set should have at least two words.  Words without any anagrams should not be included in the result.
;; tags - 
;; restricted - 
(ns offline-4clojure.p77
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          (__ ["meat" "mat" "team" "mate" "eat"])
          #{#{"meat" "mate" "team"}})))
    (deftest
      test4clj-1
      (is
        (=
          (__ ["veer" "lake" "item" "kale" "mite" "ever"])
          #{#{"kale" "lake"} #{"item" "mite"} #{"ever" "veer"}}))))
  __)