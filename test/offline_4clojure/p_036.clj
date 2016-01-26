;; Let it Be - Elementary
;; Can you bind x, y, and z so that these are all true?
;; tags - math:syntax
;; restricted - 
(ns offline-4clojure.p36
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest test4clj-0 (is (= 10 ((let __ (+ x y))))))
    (deftest test4clj-1 (is (= 4 ((let __ (+ y z))))))
    (deftest test4clj-2 (is (= 1 ((let __ z))))))
  __)