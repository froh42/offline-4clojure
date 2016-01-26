;; Implement range - Easy
;; Write a function which creates a list of all integers in a given range.
;; tags - seqs:core-functions
;; restricted - range
(ns offline-4clojure.p34
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 1 4) '(1 2 3))))
    (deftest test4clj-1 (is (= (__ -2 2) '(-2 -1 0 1))))
    (deftest test4clj-2 (is (= (__ 5 8) '(5 6 7)))))
  __)