;; Power Set - Medium
;; Write a function which generates the <a href="http://en.wikipedia.org/wiki/Power_set">power set</a> of a given set.  The power set of a set x is the set of all subsets of x, including the empty set and x itself.
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p85
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ #{1 :a}) #{#{1 :a} #{} #{1} #{:a}})))
    (deftest test4clj-1 (is (= (__ #{}) #{#{}})))
    (deftest
      test4clj-2
      (is
        (=
          (__ #{1 3 2})
          #{#{} #{3} #{2} #{1} #{1 3 2} #{1 3} #{1 2} #{3 2}})))
    (deftest
      test4clj-3
      (is (= (count (__ (into #{} (range 10)))) 1024))))
  __)