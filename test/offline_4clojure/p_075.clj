;; Euler's Totient Function - Medium
;; Two numbers are coprime if their greatest common divisor equals 1.  Euler's totient function f(x) is defined as the number of positive integers less than x which are coprime to x.  The special case f(1) equals 1.  Write a function which calculates Euler's totient function.
;; tags - 
;; restricted - 
(ns offline-4clojure.p75
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 1) 1)))
    (deftest test4clj-1 (is (= (__ 10) (count '(1 3 7 9)) 4)))
    (deftest test4clj-2 (is (= (__ 40) 16)))
    (deftest test4clj-3 (is (= (__ 99) 60))))
  __)