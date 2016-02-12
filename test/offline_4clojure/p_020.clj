;; Penultimate Element - Easy
;; Write a function which returns the second to last element from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p20
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ (list 1 2 3 4 5)) 4)))
    (deftest test4clj-1 (is (= (__ ["a" "b" "c"]) "b")))
    (deftest test4clj-2 (is (= (__ [[1 2] [3 4]]) [1 2]))))
  #(second (reverse %)))