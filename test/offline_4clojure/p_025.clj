;; Find the odd numbers - Easy
;; Write a function which returns only the odd numbers from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p25
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ #{1 4 3 2 5}) '(1 3 5))))
    (deftest test4clj-1 (is (= (__ [4 2 1 6]) '(1))))
    (deftest test4clj-2 (is (= (__ [2 2 4 6]) '())))
    (deftest test4clj-3 (is (= (__ [1 1 1 3]) '(1 1 1 3)))))
  #(filter odd? %))