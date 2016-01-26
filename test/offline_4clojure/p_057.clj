;; Simple Recursion - Elementary
;; A recursive function is a function which calls itself.  This is one of the fundamental techniques used in functional programming.
;; tags - recursion
;; restricted - 
(ns offline-4clojure.p57
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is
        (=
          __
          ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)))))
  __)