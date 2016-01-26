;; Flipping out - Medium
;; Write a higher-order function which flips the order of the arguments of an input function.
;; tags - higher-order-functions
;; restricted - 
(ns offline-4clojure.p46
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 3 ((__ nth) 2 [1 2 3 4 5]))))
    (deftest test4clj-1 (is (= true ((__ >) 7 8))))
    (deftest test4clj-2 (is (= 4 ((__ quot) 2 8))))
    (deftest test4clj-3 (is (= [1 2 3] ((__ take) [1 2 3 4 5] 3)))))
  __)