;; Universal Computation Engine - Medium
;; 	 Given a mathematical formula in prefix notation, return a function that calculates
;;	 the value of the formula.
;;	 The formula can contain nested calculations using the four basic
;;	 mathematical operators, numeric constants, and symbols representing variables.
;;	 The returned function has to accept a single parameter containing the map
;;	 of variable names to their values.
;;
;; tags - functions
;; restricted - eval:resolve
(ns offline-4clojure.p121
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 2 ((__ '(/ a b)) '{b 8, a 16}))))
    (deftest test4clj-1 (is (= 8 ((__ '(+ a b 2)) '{a 2, b 4}))))
    (deftest
      test4clj-2
      (is
        (=
          [6 0 -4]
          (map
            (__ '(* (+ 2 a) (- 10 b)))
            '[{a 1, b 8} {b 5, a -2} {a 2, b 11}]))))
    (deftest
      test4clj-3
      (is (= 1 ((__ '(/ (+ x 2) (* 3 (+ y 1)))) '{x 4, y 1})))))
  __)