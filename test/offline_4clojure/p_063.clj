;; Group a Sequence - Easy
;; Given a function f and a sequence s, write a function which returns a map.  The keys should be the values of f applied to each item in s.  The value at each key should be a vector of corresponding items in the order they appear in s.
;; tags - core-functions
;; restricted - group-by
(ns offline-4clojure.p63
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})))
    (deftest
      test4clj-1
      (is
        (=
          (__ #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
          {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})))
    (deftest
      test4clj-2
      (is
        (=
          (__ count [[1] [1 2] [3] [1 2 3] [2 3]])
          {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]}))))
  __)