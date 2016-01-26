;; A Half-Truth - Easy
;; Write a function which takes a variable number of booleans.  Your function should return true if some of the parameters are true, but not all of the parameters are true.  Otherwise your function should return false.
;; tags - 
;; restricted - 
(ns offline-4clojure.p83
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= false (__ false false))))
    (deftest test4clj-1 (is (= true (__ true false))))
    (deftest test4clj-2 (is (= false (__ true))))
    (deftest test4clj-3 (is (= true (__ false true false))))
    (deftest test4clj-4 (is (= false (__ true true true))))
    (deftest test4clj-5 (is (= true (__ true true true false)))))
  __)