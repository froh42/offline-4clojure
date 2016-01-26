;; Sum It All Up - Easy
;; Write a function which returns the sum of a sequence of numbers.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p24
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 2 3]) 6)))
    (deftest test4clj-1 (is (= (__ (list 0 -2 5 5)) 8)))
    (deftest test4clj-2 (is (= (__ #{1 4 2}) 7)))
    (deftest test4clj-3 (is (= (__ '(0 0 -1)) -1)))
    (deftest test4clj-4 (is (= (__ '(1 10 3)) 14))))
  __)