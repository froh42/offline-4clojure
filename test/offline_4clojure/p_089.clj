;; Graph Tour - Hard
;; Starting with a graph you must write a function that returns true if it is possible to make a tour of the graph in which every edge is visited exactly once.<br/><br/>The graph is represented by a vector of tuples, where each tuple represents a single edge.<br/><br/>The rules are:<br/><br/>- You can start at any node.<br/>- You must visit each edge exactly once.</br>- All edges are undirected.
;; tags - graph-theory
;; restricted - 
(ns offline-4clojure.p89
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= true (__ [[:a :b]]))))
    (deftest test4clj-1 (is (= false (__ [[:a :a] [:b :b]]))))
    (deftest
      test4clj-2
      (is
        (=
          false
          (__
            [[:a :b]
             [:a :b]
             [:a :c]
             [:c :a]
             [:a :d]
             [:b :d]
             [:c :d]]))))
    (deftest test4clj-3 (is (= true (__ [[1 2] [2 3] [3 4] [4 1]]))))
    (deftest
      test4clj-4
      (is
        (=
          true
          (__
            [[:a :b]
             [:a :c]
             [:c :b]
             [:a :e]
             [:b :e]
             [:a :d]
             [:b :d]
             [:c :e]
             [:d :e]
             [:c :f]
             [:d :f]]))))
    (deftest test4clj-5 (is (= false (__ [[1 2] [2 3] [2 4] [2 5]])))))
  __)