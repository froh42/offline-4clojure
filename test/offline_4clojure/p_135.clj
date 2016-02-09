;; Infix Calculator - Easy
;; Your friend Joe is always whining about Lisps using the prefix notation for math. Show him how you could easily write a function that does math using the infix notation. Is your favorite language that flexible, Joe?
;;
;;Write a function that accepts a variable length mathematical expression consisting of numbers and the operations +, -, *, and /. Assume a simple calculator that does not do precedence and instead just calculates left to right.
;; tags - higher-order-functions:math
;; restricted - 
(ns offline-4clojure.p135
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 7 (__ 2 + 5))))
    (deftest test4clj-1 (is (= 42 (__ 38 + 48 - 2 / 2))))
    (deftest test4clj-2 (is (= 8 (__ 10 / 2 - 1 * 2))))
    (deftest
      test4clj-3
      (is (= 72 (__ 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9)))))
  __)