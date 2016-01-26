;; Least Common Multiple - Easy
;; Write a function which calculates the <a href="http://en.wikipedia.org/wiki/Least_common_multiple">least common multiple</a>.  Your function should accept a variable number of positive integers or ratios. 
;; tags - math
;; restricted - 
(ns offline-4clojure.p100
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (== (__ 2 3) 6)))
    (deftest test4clj-1 (is (== (__ 5 3 7) 105)))
    (deftest test4clj-2 (is (== (__ 1/3 2/5) 2)))
    (deftest test4clj-3 (is (== (__ 3/4 1/6) 3/2)))
    (deftest test4clj-4 (is (== (__ 7 5/7 2 3/5) 210))))
  __)