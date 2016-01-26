;; Fibonacci Sequence - Easy
;; Write a function which returns the first X fibonacci numbers.
;; tags - Fibonacci:seqs
;; restricted - 
(ns offline-4clojure.p26
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 3) '(1 1 2))))
    (deftest test4clj-1 (is (= (__ 6) '(1 1 2 3 5 8))))
    (deftest test4clj-2 (is (= (__ 8) '(1 1 2 3 5 8 13 21)))))
  __)