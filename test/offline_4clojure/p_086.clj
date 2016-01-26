;; Happy numbers - Medium
;; Happy numbers are positive integers that follow a particular formula: take each individual digit, square it, and then sum the squares to get a new number. Repeat with the new number and eventually, you might get to a number whose squared sum is 1. This is a happy number. An unhappy number (or sad number) is one that loops endlessly. Write a function that determines if a number is happy or not.
;; tags - math
;; restricted - 
(ns offline-4clojure.p86
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 7) true)))
    (deftest test4clj-1 (is (= (__ 986543210) true)))
    (deftest test4clj-2 (is (= (__ 2) false)))
    (deftest test4clj-3 (is (= (__ 3) false))))
  __)