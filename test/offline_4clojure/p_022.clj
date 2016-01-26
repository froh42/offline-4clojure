;; Count a Sequence - Easy
;; Write a function which returns the total number of elements in a sequence.
;; tags - seqs:core-functions
;; restricted - count
(ns offline-4clojure.p22
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ '(1 2 3 3 1)) 5)))
    (deftest test4clj-1 (is (= (__ "Hello World") 11)))
    (deftest test4clj-2 (is (= (__ [[1 2] [3 4] [5 6]]) 3)))
    (deftest test4clj-3 (is (= (__ '(13)) 1)))
    (deftest test4clj-4 (is (= (__ '(:a :b :c)) 3))))
  __)