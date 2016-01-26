;; Replicate a Sequence - Easy
;; Write a function which replicates each element of a sequence a variable number of times.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p33
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 2 3] 2) '(1 1 2 2 3 3))))
    (deftest
      test4clj-1
      (is (= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))))
    (deftest test4clj-2 (is (= (__ [4 5 6] 1) '(4 5 6))))
    (deftest
      test4clj-3
      (is (= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))))
    (deftest test4clj-4 (is (= (__ [44 33] 2) [44 44 33 33]))))
  __)