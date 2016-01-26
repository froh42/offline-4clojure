;; Greatest Common Divisor - Easy
;; Given two integers, write a function which
;;returns the greatest common divisor.
;; tags - 
;; restricted - 
(ns offline-4clojure.p66
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 2 4) 2)))
    (deftest test4clj-1 (is (= (__ 10 5) 5)))
    (deftest test4clj-2 (is (= (__ 5 7) 1)))
    (deftest test4clj-3 (is (= (__ 1023 858) 33))))
  __)