;; Intro to Maps - Elementary
;; Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
;; tags - 
;; restricted - 
(ns offline-4clojure.p10
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= __ ((hash-map :a 10 :b 20 :c 30) :b))))
    (deftest test4clj-1 (is (= __ (:b {:a 10, :b 20, :c 30})))))
  __)