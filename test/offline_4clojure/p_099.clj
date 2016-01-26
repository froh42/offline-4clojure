;; Product Digits - Easy
;; Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;; tags - math:seqs
;; restricted - 
(ns offline-4clojure.p99
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 1 1) [1])))
    (deftest test4clj-1 (is (= (__ 99 9) [8 9 1])))
    (deftest test4clj-2 (is (= (__ 999 99) [9 8 9 0 1]))))
  __)