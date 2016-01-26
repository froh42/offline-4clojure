;; Sequs Horribilis - Medium
;; Create a function which takes an integer and a nested collection of integers as arguments.  Analyze the elements of the input collection and return a sequence which maintains the nested structure, and which includes all elements starting from the head whose sum is less than or equal to the input integer.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p112
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ 10 [1 2 [3 [4 5] 6] 7]) '(1 2 (3 (4))))))
    (deftest
      test4clj-1
      (is
        (=
          (__ 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11])
          '(1 2 (3 (4 (5 (6 (7)))))))))
    (deftest test4clj-2 (is (= (__ 9 (range)) '(0 1 2 3))))
    (deftest test4clj-3 (is (= (__ 1 [[[[[1]]]]]) '(((((1))))))))
    (deftest test4clj-4 (is (= (__ 0 [1 2 [3 [4 5] 6] 7]) '())))
    (deftest test4clj-5 (is (= (__ 0 [0 0 [0 [0]]]) '(0 0 (0 (0))))))
    (deftest
      test4clj-6
      (is
        (=
          (__ 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]])
          '(-10 (1 (2 3 (4))))))))
  __)