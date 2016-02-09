;; Black Box Testing - Medium
;; Clojure has many sequence types, which act in subtly different ways. The core functions typically convert them into a uniform "sequence" type and work with them that way, but it can be important to understand the behavioral and performance differences so that you know which kind is appropriate for your application.<br /><br />Write a function which takes a collection and returns one of :map, :set, :list, or :vector - describing the type of collection it was given.<br />You won't be allowed to inspect their class or use the built-in predicates like list? - the point is to poke at them and understand their behavior.
;; tags - seqs:testing
;; restricted - class:type:Class:vector?:sequential?:list?:seq?:map?:set?:instance?:getClass
(ns offline-4clojure.p65
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= :map (__ {:a 1, :b 2}))))
    (deftest test4clj-1 (is (= :list (__ (range (rand-int 20))))))
    (deftest test4clj-2 (is (= :vector (__ [1 2 3 4 5 6]))))
    (deftest test4clj-3 (is (= :set (__ #{10 (rand-int 5)}))))
    (deftest
      test4clj-4
      (is (= [:map :set :vector :list] (map __ [{} #{} [] ()])))))
  __)