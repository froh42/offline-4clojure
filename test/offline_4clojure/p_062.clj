;; Re-implement Iterate - Easy
;; Given a side-effect free function f and an initial value x write a function which returns an infinite lazy sequence of x, (f x), (f (f x)), (f (f (f x))), etc.
;; tags - seqs:core-functions
;; restricted - iterate
(ns offline-4clojure.p62
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (take 5 (__ #(* 2 %) 1)) [1 2 4 8 16])))
    (deftest
      test4clj-1
      (is (= (take 100 (__ inc 0)) (take 100 (range)))))
    (deftest
      test4clj-2
      (is
        (=
          (take 9 (__ #(inc (mod % 3)) 1))
          (take 9 (cycle [1 2 3]))))))
  __)