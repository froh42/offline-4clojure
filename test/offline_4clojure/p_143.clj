;; dot product - Easy
;; Create a function that computes the <a href="http://en.wikipedia.org/wiki/Dot_product#Definition">dot product</a> of two sequences. You may assume that the vectors will have the same length.
;; tags - seqs:math
;; restricted - 
(ns offline-4clojure.p143
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 0 (__ [0 1 0] [1 0 0]))))
    (deftest test4clj-1 (is (= 3 (__ [1 1 1] [1 1 1]))))
    (deftest test4clj-2 (is (= 32 (__ [1 2 3] [4 5 6]))))
    (deftest test4clj-3 (is (= 256 (__ [2 5 6] [100 10 1])))))
  __)