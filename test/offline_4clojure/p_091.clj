;; Graph Connectivity - Hard
;; Given a graph, determine whether the graph is connected. A connected graph is such that a path exists between any two given nodes.<br/><br/>-Your function must return true if the graph is connected and false otherwise.<br/><br/>-You will be given a set of tuples representing the edges of a graph. Each member of a tuple being a vertex/node in the graph.<br/><br/>-Each edge is undirected (can be traversed either direction).
;;
;; tags - graph-theory
;; restricted - 
(ns offline-4clojure.p91
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= true (__ #{[:a :a]}))))
    (deftest test4clj-1 (is (= true (__ #{[:a :b]}))))
    (deftest
      test4clj-2
      (is (= false (__ #{[2 3] [6 4] [5 6] [4 5] [3 1] [1 2]}))))
    (deftest
      test4clj-3
      (is (= true (__ #{[2 3] [3 4] [6 4] [5 6] [4 5] [3 1] [1 2]}))))
    (deftest
      test4clj-4
      (is
        (=
          false
          (__ #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:b :c]}))))
    (deftest
      test4clj-5
      (is
        (=
          true
          (__
            #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:x :a]
              [:b :c]})))))
  __)