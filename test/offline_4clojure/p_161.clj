;; Subset and Superset - Elementary
;; Set A is a subset of set B, or equivalently B is a superset of A, if A is "contained" inside B. A and B may coincide.
;; tags - set-theory
;; restricted - 
(ns offline-4clojure.p161
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (clojure.set/superset? __ #{2})))
    (deftest test4clj-1 (is (clojure.set/subset? #{1} __)))
    (deftest test4clj-2 (is (clojure.set/superset? __ #{1 2})))
    (deftest test4clj-3 (is (clojure.set/subset? #{1 2} __))))
  __)