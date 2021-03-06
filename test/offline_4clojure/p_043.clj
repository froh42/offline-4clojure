;; Reverse Interleave - Medium
;; Write a function which reverses the interleave process into x number of subsequences.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p43
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6)))))
    (deftest
      test4clj-1
      (is (= (__ (range 9) 3) '((0 3 6) (1 4 7) (2 5 8)))))
    (deftest
      test4clj-2
      (is (= (__ (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))))
  __)