;; Rotate Sequence - Medium
;; Write a function which can rotate a sequence in either direction.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p44
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))))
    (deftest test4clj-1 (is (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))))
    (deftest test4clj-2 (is (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))))
    (deftest test4clj-3 (is (= (__ 1 '(:a :b :c)) '(:b :c :a))))
    (deftest test4clj-4 (is (= (__ -4 '(:a :b :c)) '(:c :a :b)))))
  __)