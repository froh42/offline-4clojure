;; Equivalence Classes - Medium
;; A function f defined on a domain D induces an <a href="http://en.wikipedia.org/wiki/Equivalence_relation">equivalence relation</a> on D, as follows: a is equivalent to b with respect to f if and only if (f a) is equal to (f b).  Write a function with arguments f and D that computes the <a href="http://en.wikipedia.org/wiki/Equivalence_class">equivalence classes</a> of D with respect to f.
;; tags - 
;; restricted - 
(ns offline-4clojure.p98
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ #(* % %) #{0 1 -2 -1 2}) #{#{1 -1} #{-2 2} #{0}})))
    (deftest
      test4clj-1
      (is (= (__ #(rem % 3) #{0 1 4 3 2 5}) #{#{0 3} #{1 4} #{2 5}})))
    (deftest
      test4clj-2
      (is (= (__ identity #{0 1 4 3 2}) #{#{3} #{2} #{1} #{0} #{4}})))
    (deftest
      test4clj-3
      (is (= (__ (constantly true) #{0 1 4 3 2}) #{#{0 1 4 3 2}}))))
  __)