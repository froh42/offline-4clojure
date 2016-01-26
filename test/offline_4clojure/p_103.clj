;; Generating k-combinations - Medium
;; Given a sequence S consisting of n elements generate all <a href="https://secure.wikimedia.org/wikipedia/en/wiki/Combination">k-combinations</a> of S, i. e. generate all possible sets consisting of k distinct elements taken from S.
;;
;;The number of k-combinations for a sequence is equal to the <a href="https://secure.wikimedia.org/wikipedia/en/wiki/Binomial_coefficient">binomial coefficient</a>.
;; tags - seqs:combinatorics
;; restricted - 
(ns offline-4clojure.p103
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 1 #{4 6 5}) #{#{6} #{5} #{4}})))
    (deftest test4clj-1 (is (= (__ 10 #{4 6 5}) #{})))
    (deftest
      test4clj-2
      (is (= (__ 2 #{0 1 2}) #{#{0 1} #{1 2} #{0 2}})))
    (deftest
      test4clj-3
      (is
        (=
          (__ 3 #{0 1 4 3 2})
          #{#{0 4 3} #{0 1 4} #{4 3 2} #{0 1 2} #{0 1 3} #{1 3 2}
            #{0 3 2} #{1 4 3} #{1 4 2} #{0 4 2}})))
    (deftest
      test4clj-4
      (is
        (=
          (__ 4 #{"efg" "abc" [1 2 3] :a})
          #{#{"efg" "abc" [1 2 3] :a}})))
    (deftest
      test4clj-5
      (is
        (=
          (__ 2 #{"efg" "abc" [1 2 3] :a})
          #{#{[1 2 3] :a} #{"efg" :a} #{"abc" :a} #{"abc" [1 2 3]}
            #{"efg" "abc"} #{"efg" [1 2 3]}}))))
  __)