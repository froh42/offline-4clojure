;; Contain Yourself - Easy
;; The contains? function checks if a KEY is present in a given collection.  This often leads beginner clojurians to use it incorrectly with numerically indexed collections like vectors and lists.
;; tags - 
;; restricted - 
(ns offline-4clojure.p47
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (contains? #{4 6 5} __)))
    (deftest test4clj-1 (is (contains? [1 1 1 1 1] __)))
    (deftest test4clj-2 (is (contains? {4 :a, 2 :b} __)))
    (deftest test4clj-3 (is (not (contains? [1 2 4] __)))))
  __)