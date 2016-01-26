;; Split by Type - Medium
;; Write a function which takes a sequence consisting of items with different types and splits them up into a set of homogeneous sub-sequences. The internal order of each sub-sequence should be maintained, but the sub-sequences themselves can be returned in any order (this is why 'set' is used in the test cases).
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p50
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (set (__ [1 :a 2 :b 3 :c])) #{[:a :b :c] [1 2 3]})))
    (deftest
      test4clj-1
      (is (= (set (__ [:a "foo" "bar" :b])) #{[:a :b] ["foo" "bar"]})))
    (deftest
      test4clj-2
      (is
        (=
          (set (__ [[1 2] :a [3 4] 5 6 :b]))
          #{[:a :b] [[1 2] [3 4]] [5 6]}))))
  __)