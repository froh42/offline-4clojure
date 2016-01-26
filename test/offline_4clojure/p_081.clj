;; Set Intersection - Easy
;; Write a function which returns the intersection of two sets.  The intersection is the sub-set of items that each set has in common.
;; tags - set-theory
;; restricted - intersection
(ns offline-4clojure.p81
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ #{0 1 3 2} #{4 3 2 5}) #{3 2})))
    (deftest test4clj-1 (is (= (__ #{0 1 2} #{4 3 5}) #{})))
    (deftest
      test4clj-2
      (is (= (__ #{:c :b :d :a} #{:e :c :d :f :a}) #{:c :d :a}))))
  __)