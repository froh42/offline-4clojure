;; Perfect Numbers - Medium
;; A number is "perfect" if the sum of its divisors equal the number itself.  6 is a perfect number because 1+2+3=6.  Write a function which returns true for perfect numbers and false otherwise.
;; tags - 
;; restricted - 
(ns offline-4clojure.p80
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 6) true)))
    (deftest test4clj-1 (is (= (__ 7) false)))
    (deftest test4clj-2 (is (= (__ 496) true)))
    (deftest test4clj-3 (is (= (__ 500) false)))
    (deftest test4clj-4 (is (= (__ 8128) true))))
  __)