;; Intro to Iterate - Easy
;; The iterate function can be used to produce an infinite lazy sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p45
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do (deftest test4clj-0 (is (= __ (take 5 (iterate #(+ 3 %) 1))))))
  __)