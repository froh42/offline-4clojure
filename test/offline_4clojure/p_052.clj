;; Intro to Destructuring - Elementary
;; Let bindings and function parameter lists support destructuring.
;; tags - destructuring
;; restricted - 
(ns offline-4clojure.p52
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= [2 4] (let [[a b c d e] [0 1 2 3 4]] __)))))
  __)