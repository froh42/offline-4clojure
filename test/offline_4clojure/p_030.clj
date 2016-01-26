;; Compress a Sequence - Easy
;; Write a function which removes consecutive duplicates from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p30
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")))
    (deftest test4clj-1 (is (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))))
    (deftest
      test4clj-2
      (is (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2])))))
  __)