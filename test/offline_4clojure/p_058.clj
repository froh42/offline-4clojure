;; Function Composition - Medium
;; Write a function which allows you to create function compositions.  The parameter list should take a variable number of functions, and create a function that applies them from right-to-left.
;; tags - higher-order-functions:core-functions
;; restricted - comp
(ns offline-4clojure.p58
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= [3 2 1] ((__ rest reverse) [1 2 3 4]))))
    (deftest
      test4clj-1
      (is (= 5 ((__ (partial + 3) second) [1 2 3 4]))))
    (deftest
      test4clj-2
      (is (= true ((__ zero? #(mod % 8) +) 3 5 7 9))))
    (deftest
      test4clj-3
      (is
        (=
          "HELLO"
          ((__ #(.toUpperCase %) #(apply str %) take)
            5
            "hello world")))))
  __)