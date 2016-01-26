;; Flatten a Sequence - Easy
;; Write a function which flattens a sequence.
;; tags - seqs:core-functions
;; restricted - flatten
(ns offline-4clojure.p28
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))))
    (deftest test4clj-1 (is (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))))
    (deftest test4clj-2 (is (= (__ '((((:a))))) '(:a)))))
  __)