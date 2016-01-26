;; Regular Expressions - Elementary
;; Regex patterns are supported with a special reader macro.
;; tags - regex:syntax
;; restricted - 
(ns offline-4clojure.p37
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce "))))))
  __)