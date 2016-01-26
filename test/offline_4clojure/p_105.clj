;; Identify keys and values - Medium
;; Given an input sequence of keywords and numbers, create a map such that each key in the map is a keyword, and the value is a sequence of all the numbers (if any) between it and the next keyword in the sequence.
;; tags - maps:seqs
;; restricted - 
(ns offline-4clojure.p105
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= {} (__ []))))
    (deftest test4clj-1 (is (= {:a [1]} (__ [:a 1]))))
    (deftest test4clj-2 (is (= {:a [1], :b [2]} (__ [:a 1 :b 2]))))
    (deftest
      test4clj-3
      (is (= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4])))))
  __)