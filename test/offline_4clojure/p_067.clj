;; Prime Numbers - Medium
;; Write a function which returns the first x
;;number of prime numbers.
;; tags - primes
;; restricted - 
(ns offline-4clojure.p67
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 2) [2 3])))
    (deftest test4clj-1 (is (= (__ 5) [2 3 5 7 11])))
    (deftest test4clj-2 (is (= (last (__ 100)) 541))))
  __)