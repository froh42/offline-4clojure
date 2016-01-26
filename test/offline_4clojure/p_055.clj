;; Count Occurrences - Medium
;; Write a function which returns a map containing the number of occurences of each distinct item in a sequence.
;; tags - seqs:core-functions
;; restricted - frequencies
(ns offline-4clojure.p55
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})))
    (deftest test4clj-1 (is (= (__ [:b :a :b :a :b]) {:a 2, :b 3})))
    (deftest
      test4clj-2
      (is (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2}))))
  __)