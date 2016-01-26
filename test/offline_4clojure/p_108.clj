;; Lazy Searching - Medium
;; <p>Given any number of sequences, each sorted from smallest to largest, find the smallest single number which appears in all of the sequences. The sequences may be infinite, so be careful to search lazily.</p>
;; tags - seqs:sorting
;; restricted - 
(ns offline-4clojure.p108
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 3 (__ [3 4 5]))))
    (deftest test4clj-1 (is (= 4 (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19]))))
    (deftest
      test4clj-2
      (is (= 7 (__ (range) (range 0 100 7/6) [2 3 5 7 11 13]))))
    (deftest
      test4clj-3
      (is
        (=
          64
          (__
            (map #(* % % %) (range))
            (filter #(zero? (bit-and % (dec %))) (range))
            (iterate inc 20))))))
  __)