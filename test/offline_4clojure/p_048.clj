;; Intro to some - Easy
;; The some function takes a predicate function and a collection.  It returns the first logical true value of (predicate x) where x is an item in the collection.
;; tags - 
;; restricted - 
(ns offline-4clojure.p48
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= __ (some #{7 6 2} [5 6 7 8]))))
    (deftest
      test4clj-1
      (is (= __ (some #(when (even? %) %) [5 6 7 8])))))
  __)