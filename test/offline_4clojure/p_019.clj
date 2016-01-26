;; Last Element - Easy
;; Write a function which returns the last element in a sequence.
;; tags - seqs:core-functions
;; restricted - last
(ns offline-4clojure.p19
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 2 3 4 5]) 5)))
    (deftest test4clj-1 (is (= (__ '(5 4 3)) 3)))
    (deftest test4clj-2 (is (= (__ ["b" "c" "d"]) "d"))))
  __)