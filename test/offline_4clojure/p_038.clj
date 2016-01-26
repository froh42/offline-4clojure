;; Maximum value - Easy
;; Write a function which takes a variable number of parameters and returns the maximum value.
;; tags - core-functions
;; restricted - max:max-key
(ns offline-4clojure.p38
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ 1 8 3 4) 8)))
    (deftest test4clj-1 (is (= (__ 30 20) 30)))
    (deftest test4clj-2 (is (= (__ 45 67 11) 67))))
  __)