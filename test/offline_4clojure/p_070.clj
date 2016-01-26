;; Word Sorting - Medium
;; Write a function that splits a sentence up into a sorted list of words.  Capitalization should not affect sort order and punctuation should be ignored.
;; tags - sorting
;; restricted - 
(ns offline-4clojure.p70
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ "Have a nice day.") ["a" "day" "Have" "nice"])))
    (deftest
      test4clj-1
      (is
        (=
          (__ "Clojure is a fun language!")
          ["a" "Clojure" "fun" "is" "language"])))
    (deftest
      test4clj-2
      (is
        (=
          (__ "Fools fall for foolish follies.")
          ["fall" "follies" "foolish" "Fools" "for"]))))
  __)