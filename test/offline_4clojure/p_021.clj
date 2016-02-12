;; Nth Element - Easy
;; Write a function which returns the Nth element from a sequence.
;; tags - seqs:core-functions
;; restricted - nth
(ns offline-4clojure.p21
  (:use clojure.test)
  (:use offline-4clojure.core))

(defn my-nth [s n]
  (loop [n n s s]
    (if (<= n 0)
      (first s)
      (recur (dec n) (rest s)))))

(??
  (do
    (deftest test4clj-0 (is (= (__ '(4 5 6 7) 2) 6)))
    (deftest test4clj-1 (is (= (__ [:a :b :c] 0) :a)))
    (deftest test4clj-2 (is (= (__ [1 2 3 4] 1) 2)))
    (deftest test4clj-3 (is (= (__ '([1 2] [3 4] [5 6]) 2) [5 6]))))
  my-nth)