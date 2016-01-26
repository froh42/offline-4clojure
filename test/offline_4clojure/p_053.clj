;; Longest Increasing Sub-Seq - Hard
;; Given a vector of integers, find the longest consecutive sub-sequence of increasing numbers. If two sub-sequences have the same length, use the one that occurs first. An increasing sub-sequence must have a length of 2 or greater to qualify.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p53
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 0 1 2 3 0 4 5]) [0 1 2 3])))
    (deftest test4clj-1 (is (= (__ [5 6 1 3 2 7]) [5 6])))
    (deftest test4clj-2 (is (= (__ [2 3 3 4 5]) [3 4 5])))
    (deftest test4clj-3 (is (= (__ [7 6 5 4]) []))))
  __)