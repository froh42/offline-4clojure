;; Duplicate a Sequence - Easy
;; Write a function which duplicates each element of a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p32
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 2 3]) '(1 1 2 2 3 3))))
    (deftest
      test4clj-1
      (is (= (__ [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))))
    (deftest
      test4clj-2
      (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))))
    (deftest
      test4clj-3
      (is (= (__ [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])))))
  __)