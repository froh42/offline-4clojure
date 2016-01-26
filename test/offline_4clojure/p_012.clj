;; Intro to Sequences - Elementary
;; All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last.
;; tags - 
;; restricted - 
(ns offline-4clojure.p12
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= __ (first '(3 2 1)))))
    (deftest test4clj-1 (is (= __ (second [2 3 4]))))
    (deftest test4clj-2 (is (= __ (last (list 1 2 3))))))
  __)