;; Reverse a Sequence - Easy
;; Write a function which reverses a sequence.
;; tags - seqs:core-functions
;; restricted - reverse:rseq
(ns offline-4clojure.p23
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 2 3 4 5]) [5 4 3 2 1])))
    (deftest test4clj-1 (is (= (__ (sorted-set 5 7 2 7)) '(7 5 2))))
    (deftest
      test4clj-2
      (is (= (__ [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]]))))
  __)