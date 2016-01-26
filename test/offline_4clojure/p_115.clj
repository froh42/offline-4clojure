;; The Balance of N - Medium
;; A balanced number is one whose component digits have the same sum on the left and right halves of the number.  Write a function which accepts an integer n, and returns true iff n is balanced.
;; tags - math
;; restricted - 
(ns offline-4clojure.p115
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= true (__ 11))))
    (deftest test4clj-1 (is (= true (__ 121))))
    (deftest test4clj-2 (is (= false (__ 123))))
    (deftest test4clj-3 (is (= true (__ 0))))
    (deftest test4clj-4 (is (= false (__ 88099))))
    (deftest test4clj-5 (is (= true (__ 89098))))
    (deftest test4clj-6 (is (= true (__ 89089))))
    (deftest
      test4clj-7
      (is
        (=
          (take 20 (filter __ (range)))
          [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101]))))
  __)