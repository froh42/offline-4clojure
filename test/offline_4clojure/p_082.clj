;; Word Chains - Hard
;; A word chain consists of a set of words ordered so that each word differs by only one letter from the words directly before and after it.  The one letter difference can be either an insertion, a deletion, or a substitution.  Here is an example word chain:<br/><br/>cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog<br/><br/>Write a function which takes a sequence of words, and returns true if they can be arranged into one continous word chain, and false if they cannot.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p82
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          true
          (__ #{"dog" "oat" "cot" "coat" "hot" "hat" "hog" "cat"}))))
    (deftest test4clj-1 (is (= false (__ #{"cot" "hot" "bat" "fat"}))))
    (deftest
      test4clj-2
      (is (= false (__ #{"stop" "top" "tops" "toss" "to"}))))
    (deftest
      test4clj-3
      (is (= true (__ #{"spot" "pot" "spout" "dot" "pout" "do"}))))
    (deftest
      test4clj-4
      (is (= true (__ #{"shares" "are" "hare" "hares" "share"}))))
    (deftest
      test4clj-5
      (is (= false (__ #{"are" "hare" "hares" "share"})))))
  __)