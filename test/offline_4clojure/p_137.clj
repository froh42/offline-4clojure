;; Digits and bases - Medium
;; Write a function which returns a sequence of digits of a non-negative number (first argument) in numerical system with an arbitrary base (second argument). Digits should be represented with their integer values, e.g. 15 would be [1 5] in base 10, [1 1 1 1] in base 2 and [15] in base 16. 
;; tags - math
;; restricted - 
(ns offline-4clojure.p137
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= [1 2 3 4 5 0 1] (__ 1234501 10))))
    (deftest test4clj-1 (is (= [0] (__ 0 11))))
    (deftest test4clj-2 (is (= [1 0 0 1] (__ 9 2))))
    (deftest
      test4clj-3
      (is (= [1 0] (let [n (rand-int 100000)] (__ n n)))))
    (deftest
      test4clj-4
      (is (= [16 18 5 24 15 1] (__ Integer/MAX_VALUE 42)))))
  __)