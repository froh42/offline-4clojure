;; Sum of square of digits - Easy
;; Write a function which takes a collection of integers as an argument.  Return the count of how many elements are smaller than the sum of their squared component digits.  For example: 10 is larger than 1 squared plus 0 squared; whereas 15 is smaller than 1 squared plus 5 squared.
;; tags - math
;; restricted - 
(ns offline-4clojure.p120
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 8 (__ (range 10)))))
    (deftest test4clj-1 (is (= 19 (__ (range 30)))))
    (deftest test4clj-2 (is (= 50 (__ (range 100)))))
    (deftest test4clj-3 (is (= 50 (__ (range 1000))))))
  __)