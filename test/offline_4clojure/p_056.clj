;; Find Distinct Items - Medium
;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.
;; tags - seqs:core-functions
;; restricted - distinct
(ns offline-4clojure.p56
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= (__ [1 2 1 3 1 2 4]) [1 2 3 4])))
    (deftest test4clj-1 (is (= (__ [:a :a :b :b :c :c]) [:a :b :c])))
    (deftest
      test4clj-2
      (is (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))))
    (deftest test4clj-3 (is (= (__ (range 50)) (range 50)))))
  __)