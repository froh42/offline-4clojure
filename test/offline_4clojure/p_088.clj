;; Symmetric Difference - Easy
;; Write a function which returns the symmetric difference of two sets.  The symmetric difference is the set of items belonging to one but not both of the two sets.
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p88
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ #{1 4 6 3 2 5} #{7 1 3 5}) #{7 4 6 2})))
    (deftest test4clj-1 (is (= (__ #{:c :b :a} #{}) #{:c :b :a})))
    (deftest test4clj-2 (is (= (__ #{} #{4 6 5}) #{4 6 5})))
    (deftest
      test4clj-3
      (is (= (__ #{[2 3] [1 2]} #{[2 3] [3 4]}) #{[3 4] [1 2]}))))
  __)