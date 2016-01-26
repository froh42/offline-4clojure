;; Drop Every Nth Item - Easy
;; Write a function which drops every Nth item from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p41
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])))
    (deftest test4clj-1 (is (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])))
    (deftest test4clj-2 (is (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6]))))
  __)