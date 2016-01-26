;; To Tree, or not to Tree - Easy
;; Write a predicate which checks whether or not a given sequence represents a <a href="http://en.wikipedia.org/wiki/Binary_tree">binary tree</a>.  Each node in the tree must have a value, a left child, and a right child.
;; tags - trees
;; restricted - 
(ns offline-4clojure.p95
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ '(:a (:b nil nil) nil)) true)))
    (deftest test4clj-1 (is (= (__ '(:a (:b nil nil))) false)))
    (deftest
      test4clj-2
      (is (= (__ [1 nil [2 [3 nil nil] [4 nil nil]]]) true)))
    (deftest
      test4clj-3
      (is (= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]]) false)))
    (deftest
      test4clj-4
      (is (= (__ [1 [2 [3 [4 nil nil] nil] nil] nil]) true)))
    (deftest
      test4clj-5
      (is (= (__ [1 [2 [3 [4 false nil] nil] nil] nil]) false)))
    (deftest test4clj-6 (is (= (__ '(:a nil ())) false))))
  __)