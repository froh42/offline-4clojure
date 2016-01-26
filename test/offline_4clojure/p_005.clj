;; Lists: conj - Elementary
;; <p>When operating on a list, the conj function will return a new list with one or more items "added" to the front.</p>
;;<p>Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.</p>
;; tags - 
;; restricted - 
(ns offline-4clojure.p5
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= __ (conj '(2 3 4) 1))))
    (deftest test4clj-1 (is (= __ (conj '(3 4) 2 1)))))
  __)