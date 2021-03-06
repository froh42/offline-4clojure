;; Beauty is Symmetry - Easy
;; Let us define a binary tree as "symmetric" if the left half of the tree is the mirror image of the right half of the tree.  Write a predicate to determine whether or not a given binary tree is symmetric. (see <a href='/problem/95'>To Tree, or not to Tree</a> for a reminder on the tree representation we're using).
;; tags - trees
;; restricted - 
(ns offline-4clojure.p96
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ '(:a (:b nil nil) (:b nil nil))) true)))
    (deftest test4clj-1 (is (= (__ '(:a (:b nil nil) nil)) false)))
    (deftest
      test4clj-2
      (is (= (__ '(:a (:b nil nil) (:c nil nil))) false)))
    (deftest
      test4clj-3
      (is
        (=
          (__
            [1
             [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
             [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]])
          true)))
    (deftest
      test4clj-4
      (is
        (=
          (__
            [1
             [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
             [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]])
          false)))
    (deftest
      test4clj-5
      (is
        (=
          (__
            [1
             [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
             [2 [3 nil [4 [6 nil nil] nil]] nil]])
          false))))
  __)