;; Making Data Dance - Hard
;; Write a function that takes a variable number of integer arguments.  If the output is coerced into a string, it should return a comma (and space) separated list of the inputs sorted smallest to largest.  If the output is coerced into a sequence, it should return a seq of unique input elements in the same order as they were entered.
;; tags - types
;; restricted - proxy
(ns offline-4clojure.p113
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= "1, 2, 3" (str (__ 2 1 3)))))
    (deftest test4clj-1 (is (= '(2 1 3) (seq (__ 2 1 3)))))
    (deftest test4clj-2 (is (= '(2 1 3) (seq (__ 2 1 3 3 1 2)))))
    (deftest test4clj-3 (is (= '(1) (seq (apply __ (repeat 5 1))))))
    (deftest
      test4clj-4
      (is (= "1, 1, 1, 1, 1" (str (apply __ (repeat 5 1))))))
    (deftest
      test4clj-5
      (is (and (= nil (seq (__))) (= "" (str (__)))))))
  __)