;; Intro to Sets - Elementary
;; Sets are collections of unique values.
;; tags - 
;; restricted - 
(ns offline-4clojure.p8
  (:use clojure.test)
  (:use offline-4clojure.core))

(??
  (do
    (deftest
      test4clj-0
      (is (= __ (set '(:a :a :b :c :c :c :c :d :d)))))
    (deftest
      test4clj-1
      (is (= __ (clojure.set/union #{:c :b :a} #{:c :b :d})))))
  __)