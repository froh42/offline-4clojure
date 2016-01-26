;; Sequences: filter - Elementary
;; The filter function takes two arguments: a predicate function (f) and a sequence (s).  Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
;; tags - 
;; restricted - 
(ns offline-4clojure.p18
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do (deftest test4clj-0 (is (= __ (filter #(> % 5) '(3 4 5 6 7))))))
  __)