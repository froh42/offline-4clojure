;; Partially Flatten a Sequence - Medium
;; Write a function which flattens any nested combination of sequential things (lists, vectors, etc.), but maintains the lowest level sequential items.  The result should be a sequence of sequences with only one level of nesting.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p93
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ [["Do"] ["Nothing"]]) [["Do"] ["Nothing"]])))
    (deftest
      test4clj-1
      (is
        (=
          (__ [[[[:a :b]]] [[:c :d]] [:e :f]])
          [[:a :b] [:c :d] [:e :f]])))
    (deftest
      test4clj-2
      (is (= (__ '((1 2) ((3 4) ((((5 6))))))) '((1 2) (3 4) (5 6))))))
  __)