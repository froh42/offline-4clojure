;; Intro to Functions - Elementary
;; Clojure has many different ways to create functions.
;; tags - 
;; restricted - 
(ns offline-4clojure.p14
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= __ ((fn add-five [x] (+ x 5)) 3))))
    (deftest test4clj-1 (is (= __ ((fn [x] (+ x 5)) 3))))
    (deftest test4clj-2 (is (= __ (#(+ % 5) 3))))
    (deftest test4clj-3 (is (= __ ((partial + 5) 3)))))
  8)