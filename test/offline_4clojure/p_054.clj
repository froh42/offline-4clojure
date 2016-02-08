;; Partition a Sequence - Medium
;; Write a function which returns a sequence of lists of x items each.  Lists of less than x items should not be returned.
;; tags - seqs:core-functions
;; restricted - partition:partition-all
(ns offline-4clojure.p54
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))))
    (deftest
      test4clj-1
      (is (= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))))
    (deftest test4clj-2 (is (= (__ 3 (range 8)) '((0 1 2) (3 4 5))))))
  __)