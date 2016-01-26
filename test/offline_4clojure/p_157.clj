;; Indexing Sequences - Easy
;; Transform a sequence into a sequence of pairs containing the original elements along with their index.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p157
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]])))
    (deftest test4clj-1 (is (= (__ [0 1 3]) '((0 0) (1 1) (3 2)))))
    (deftest
      test4clj-2
      (is (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]]))))
  __)