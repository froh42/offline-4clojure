;; Split a sequence - Easy
;; Write a function which will split a sequence into two parts.
;; tags - seqs:core-functions
;; restricted - split-at
(ns offline-4clojure.p49
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])))
    (deftest
      test4clj-1
      (is (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])))
    (deftest
      test4clj-2
      (is (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))))
  __)