;; Pack a Sequence - Easy
;; Write a function which packs consecutive duplicates into sub-lists.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p31
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))))
    (deftest
      test4clj-1
      (is (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))))
    (deftest
      test4clj-2
      (is (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4]))))))
  __)