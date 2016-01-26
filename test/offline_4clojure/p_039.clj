;; Interleave Two Seqs - Easy
;; Write a function which takes two sequences and returns the first item from each, then the second item from each, then the third, etc.
;; tags - seqs:core-functions
;; restricted - interleave
(ns offline-4clojure.p39
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))))
    (deftest test4clj-1 (is (= (__ [1 2] [3 4 5 6]) '(1 3 2 4))))
    (deftest test4clj-2 (is (= (__ [1 2 3 4] [5]) [1 5])))
    (deftest test4clj-3 (is (= (__ [30 20] [25 15]) [30 25 20 15]))))
  __)