;; Logical falsity and truth - Elementary
;; In Clojure, only nil and false represent the values of logical falsity in conditional tests - anything else is logical truth.
;; tags - logic
;; restricted - 
(ns offline-4clojure.p162
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= __ (if-not false 1 0))))
    (deftest test4clj-1 (is (= __ (if-not nil 1 0))))
    (deftest test4clj-2 (is (= __ (if true 1 0))))
    (deftest test4clj-3 (is (= __ (if [] 1 0))))
    (deftest test4clj-4 (is (= __ (if [0] 1 0))))
    (deftest test4clj-5 (is (= __ (if 0 1 0))))
    (deftest test4clj-6 (is (= __ (if 1 1 0)))))
  __)