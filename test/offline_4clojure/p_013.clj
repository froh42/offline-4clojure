;; Sequences: rest - Elementary
;; The rest function will return all the items of a sequence except the first.
;; tags - 
;; restricted - 
(ns offline-4clojure.p13
  (:use clojure.test)
  (:use offline-4clojure.core))

(?? (do (deftest test4clj-0 (is (= __ (rest [10 20 30 40]))))) [20 30 40])